/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Usuario
 */
/* 
Faltan los siguientes métodos: 
+ valorarItemResp(int pCodCateg, String pPrompt): String
+ valorarItemEj(int pCodCateg, String pPrompt): String
*/


public class Item implements Comparable<Item>{  
    private int idItem;
    private String prompt;
    private String respuesta;
    private Fuente fuenteRespuesta;
    private String ejemplo;
    private Fuente fuenteEjemplo;
    private ArrayList<Valoracion> listaValoracionesRespuesta;
    private ArrayList<Valoracion> listaValoracionesEjemplos;
    public Item(int pId, String pPrompt, String pRespuesta, Fuente pFuenteRespuesta, String pEjemplo, Fuente pFuenteEjemplo) {
        this.idItem = pId;
        this.prompt = pPrompt;
        this.respuesta = pRespuesta;
        this.fuenteRespuesta = pFuenteRespuesta;
        this.ejemplo = pEjemplo;
        this.fuenteEjemplo = pFuenteEjemplo;
        this.listaValoracionesRespuesta = new ArrayList();
        this.listaValoracionesEjemplos = new ArrayList();
    }
    
    @Override
    public int compareTo(Item i){
        return this.prompt.compareTo(i.prompt);
    }

    public String toStringLista(ArrayList<Valoracion> pLista){
        StringBuilder sb = new StringBuilder();
        for(Valoracion val: pLista){
            sb.append(val.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void anadirValoracionResp(int pEst, String com){
        Valoracion aux = new Valoracion(pEst, com);
        this.listaValoracionesRespuesta.add(aux);
    }
    
    public void anadirValoracionEj(int pEst, String com){
        Valoracion aux = new Valoracion(pEst, com);
        this.listaValoracionesEjemplos.add(aux);
    }

    @Override
    public String toString() {
        String listaR = this.toStringLista(listaValoracionesRespuesta);
        String listaE = this.toStringLista(listaValoracionesEjemplos);
        return "Item: " + "Prompt: " + prompt + ", Respuesta: " + respuesta + ", Fuente Respuesta: " + fuenteRespuesta + ", Ejemplo: " + ejemplo + ", Fuente Ejemplo: " + fuenteEjemplo + ", Valoraciones de las respuestas: " + listaR+ ", Valoraciones de los ejemplos: " + listaE+ "\n";
    }  
    
    public int promedioValoracion(ArrayList<Valoracion> pLista){
        int numerador = 0;
        int denominador = pLista.size();
        
        for(Valoracion aux: pLista){
            numerador += aux.getEstrellas();
        }
        
        return numerador/denominador;
    }

    public String getPrompt() {
        return prompt;
    }
    
    
    public void ordenarNumeros(ArrayList<Valoracion> pLista){
        Collections.sort(pLista);
        for (Valoracion v: pLista){
            System.out.println(v.getEstrellas());
        }
    }
    
    public boolean tamanoEsperado(ArrayList<Valoracion> pLista, int pNum){
        return pLista.size() >= pNum;
    }

    public Fuente getFuenteRespuesta() {
        return fuenteRespuesta;
    }

    public Fuente getFuenteEjemplo() {
        return fuenteEjemplo;
    }

    public ArrayList<Valoracion> getListaValoracionesRespuesta() {
        return listaValoracionesRespuesta;
    }

    public ArrayList<Valoracion> getListaValoracionesEjemplos() {
        return listaValoracionesEjemplos;
    }

    public int getIdItem() {
        return idItem;
    }
    
    
    
}
