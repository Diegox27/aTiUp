package Model;

public class Valoracion implements Comparable<Valoracion> {
    
    private int estrellas;
    private String comentario;
    
    public Valoracion(int pEstrellas, String pComentario) {
        this.estrellas = pEstrellas;
        this.comentario = pComentario;
    }
    
    @Override
    public int compareTo(Valoracion v){
        return Integer.compare(this.estrellas, v.estrellas);
    }
    
    public int getEstrellas() {
        return estrellas;
    }
    
    @Override
    public String toString() {
        return "Valoracion: " + "Estrellas: " + estrellas + ", Comentario: " + comentario;
    } 
    
    public boolean esMayor(int pNum){
        return pNum>=4;
    }  
}
