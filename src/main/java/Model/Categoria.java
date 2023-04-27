package Model;
import java.util.ArrayList;
import java.util.Collections;
public class Categoria {
    private String nombre;
    private int codigo;
    private String descripcion;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Item> listaItems;

    public Categoria(String pNombre, int pCodigo, String pDescripcion, ArrayList<Curso> listaCursos) {
        this.nombre = pNombre;
        this.codigo = pCodigo;
        this.descripcion = pDescripcion;
        this.listaCursos = listaCursos;
        this.listaItems = new ArrayList();
    }
    
    public Categoria(int pCodigo,String pNombre, String pDescripcion) {
        this.nombre = pNombre;
        this.codigo = pCodigo;
        this.descripcion = pDescripcion;
       // this.listaCursos = listaCursos;
       // this.listaItems = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }
    
    public void registrarItemNuevo(String pPrompt, String pRespuesta, Fuente pFuenteRespuesta, String pEjemplo, Fuente pFuenteEjemplo, int pCodCateg){
        int idActual = determinarUltimo() + 1;
        Item aux = new Item(idActual, pPrompt, pRespuesta, pFuenteRespuesta, pEjemplo, pFuenteEjemplo);
        listaItems.add(aux);
    }
    
    public void registrarItemBd(int pId, String pPrompt, String pRespuesta, Fuente pFuenteRespuesta, String pEjemplo, Fuente pFuenteEjemplo, int pCodCateg){
        Item aux = new Item(pId, pPrompt, pRespuesta, pFuenteRespuesta, pEjemplo, pFuenteEjemplo);
        listaItems.add(aux);
    }
    
    public int determinarUltimo(){
        return listaItems.size();
    }
    
    public String toStringListaItems(){
        StringBuilder sb = new StringBuilder();
        for(Item aux: listaItems){
            sb.append(aux.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public String toStringListaCursos(){
        StringBuilder sb = new StringBuilder();
        for(Curso aux: listaCursos){
            sb.append(aux.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        String listaI = this.toStringListaItems();
        String listaC = this.toStringListaCursos();
        return "Categoria: " + "Nombre: " + nombre + ", Codigo: " + codigo + ", Descripcion: " + descripcion + ", Lista de preguntas: " + listaI + ", Lista de Cursos: " + listaC;
    }
    
    public String toString1() {
        
        return "Categoria: " + "Nombre: " + nombre + ", Codigo: " + codigo + ", Descripcion: " + descripcion ;
    }
    
    public void ordenarAlfabeticamente(){
        Collections.sort(this.listaItems);
        for (Item i : this.listaItems){
            System.out.println(i.getPrompt());
        }
    }
    
    public ArrayList<Item> getListaItems() {
        return listaItems;
    }
    // AQUÍ COMIENZA EL CODIGO DE LOS TOP X
    // Punto 3 Agarrar las respuestas que tengan como fuente: Admin
    public ArrayList<Item> getFuenteRpAdmin(){
        ArrayList<Item> listaAux = new ArrayList<>();
        for(Item i : listaItems){
            if(i.getFuenteRespuesta().equals(Fuente.Admin)){
                listaAux.add(i);
            }
        }
        return listaAux;
    }
    // Punto 3 Agarrar las respuestas que tengan como fuente: ChatGPT
    public ArrayList<Item> getFuenteRpChatGPT(){
        ArrayList<Item> listaAux = new ArrayList<>();
        for(Item i : listaItems){
            if(i.getFuenteRespuesta().equals(Fuente.ChatGPT)){
                listaAux.add(i);
            }
        }
        return listaAux;
    }
    // Punto 3 Agarrar los Ejemplos que tengan como fuente: Admin
    public ArrayList<Item> getFuenteEjAdmin(){
        ArrayList<Item> listaAux = new ArrayList<>();
        for(Item i : listaItems){
            if(i.getFuenteEjemplo().equals(Fuente.Admin)){
                listaAux.add(i);
            }
        }
        return listaAux;
    }
    // Punto 3 Agarrar los Ejemplos que tengan como fuente: ChatGPT
    public ArrayList<Item> getFuenteEjChatGPT(){
        ArrayList<Item> listaAux = new ArrayList<>();
        for(Item i : listaItems){
            if(i.getFuenteEjemplo().equals(Fuente.ChatGPT)){
                listaAux.add(i);
            }
        }
        return listaAux;
    }
    // Punto 4: Promedio a Respuestas con cualquier fuente
    public ArrayList<Item> ordenarPorPromRp(ArrayList<Item> pLista, int pNum){
        ArrayList<Item> listaAux = new ArrayList<>();
            for(Item i: pLista){
                int promAux = i.promedioValoracion(i.getListaValoracionesRespuesta());
                System.out.println("Promedio de la valoracion: " + promAux);
                
                anadirAListaPosicion(listaAux, i, promAux);
        }
        imprimirN(listaAux, pNum);
        return listaAux;
    }
    //Punto 4: Promedio a Ejemplos con cualquier fuente
    public ArrayList<Item> ordenarPorPromEj(ArrayList<Item> pLista, int pNum){
        ArrayList<Item> listaAux = new ArrayList<>();
            for(Item i: pLista){
                int promAux = i.promedioValoracion(i.getListaValoracionesEjemplos());
                System.out.println("Promedio de la valoracion: " + promAux);
                anadirAListaPosicion(listaAux, i, promAux);
        }
        imprimirN(listaAux, pNum);
        return listaAux;
    }
    //Punto 4: Promedio a Ejemplos y Respuestas con cualquier fuente
    public ArrayList<Item> ordenarPorPromBoth(ArrayList<Item> pLista, int pNum){
        ArrayList<Item> listaAux = new ArrayList<>();
            for(Item i: pLista){
                int promAux = i.promedioValoracion(i.getListaValoracionesEjemplos());
                int promAux2 = i.promedioValoracion(i.getListaValoracionesRespuesta());
                int promAux3 = (promAux+promAux2)/2;
                System.out.println("Promedio de la valoracion: " + promAux3);
                anadirAListaPosicion(listaAux, i, promAux3);
        }
        imprimirN(listaAux, pNum);
        return listaAux;
    }
    //Punto 5 y 6: Lista con promedios >=4 y ordenada.
    public void anadirAListaPosicion(ArrayList<Item> pLista, Item i,int pNum){
                if(pNum==5){
                    //System.out.println("Metiendo el item al inicio");
                    pLista.add(0,i);
                }
                else if(pNum == 4){
                    //System.out.println("Metiendo el item al final");
                    pLista.add(i);
                }
    }
    //Punto 7-aux: Da el top X de lo que sea
    // CREO QUE HAY QUE MODIFICARLO
    public void imprimirN(ArrayList<Item> pLista, int pNum){
        int contador = 0;
            for (Item p : pLista) {
                if (contador < pNum) {
                    System.out.println(p.getPrompt());
                    contador++;
                } else {
                    break;
                }
            }
    }
 
    // Punto 7: Top X Respuestas. Fuente: Admin
    //Revisado
    public String topXRpAdmin(int pNum){
        ArrayList<Item> aux = this.getFuenteRpAdmin();
        aux = ordenarPorPromRp(aux, pNum);
        return (aux.toString());
    }
    
    // Punto 7: Top X Respuestas. Fuente: ChatGPT
    //Revisado
    public String topXRpChatGPT(int pNum){
        ArrayList<Item> aux = this.getFuenteRpChatGPT();
        aux = ordenarPorPromRp(aux, pNum);
        return (aux.toString());
    }
    
    // Punto 7: Top X Respuestas. Fuente: ChatGPT y Admin
    //Revisado
    public String topXRpBoth(int pNum){
        ArrayList<Item> aux = this.listaItems;
        aux = ordenarPorPromRp(aux, pNum);
        return (aux.toString());
    }
    
    // Punto 7: Top X Ejemplos. Fuente: Admin
    //Revisado
    public String topXEjAdmin(int pNum){
        ArrayList<Item> aux = this.getFuenteEjAdmin();
        aux = ordenarPorPromEj(aux, pNum);
        return (aux.toString());
    }
    
    // Punto 7: Top X Ejemplos. Fuente: ChatGPT
    //Revisado
    public String topXEjChatGPT(int pNum){
        ArrayList<Item> aux = this.getFuenteEjChatGPT();
        aux = ordenarPorPromEj(aux, pNum);
        return (aux.toString());
    }
    // Punto 7: Top X Ejemplos. Fuente: Ambas
    //Revisado
    public String topXEjBoth(int pNum){
        ArrayList<Item> aux = this.listaItems;
        aux = ordenarPorPromEj(aux, pNum);
        return (aux.toString());
    }
    
    // Punto 7: Top X toda la lista. Fuente: Ambas
    //Revisado
    public String topXBothBoth(int pNum){
        ArrayList<Item> aux = this.listaItems;
        aux = ordenarPorPromBoth(aux, pNum);
        return (aux.toString());
    }

    public int getCodigo() {
        return codigo;
    }
}