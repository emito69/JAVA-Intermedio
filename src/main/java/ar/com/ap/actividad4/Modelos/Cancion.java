
package ar.com.ap.actividad4.Modelos;
import lombok.Data;

@Data
public class Cancion {
    
    private Popularidad popularidad;  // ESTADO: estamos declarando este atributo con una INTERFACE
    private String titulo; 
    private String anio;
    private Artista artista;
    private Album album;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private boolean reprodLast24hs;

    public Cancion (String titulo, String anio){
        this.titulo = titulo;
        this.reproducciones = 0;
        this.likes = 0; 
        this.dislikes = 0;
        reprodLast24hs = false;
        this.popularidad = new Normal();
    }
    
    
    public void actualizarPopularidad(){
        popularidad.actualizar(this);
    }
    
    
    
    public String getIcono(){
        return popularidad.getIcono();  // hago esto para ahorrar llamados en la rutina main
                                        // cancion.getPopularidad().getIcono()
    }    
    
    public String getLeyenda(){
        return popularidad.getLeyenda(this);  // hago esto para evitar tener que pasarle el objeto "cancion" a "cancion"
                                                    // y también para ahorrar llamado a métodos en la rutina main 
                                                    // cancion.getPopularidad().getLeyenda(cancion)
    }
}
