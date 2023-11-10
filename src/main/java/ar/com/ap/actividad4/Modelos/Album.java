
package ar.com.ap.actividad4.Modelos;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class Album {
    
    private String nombre;
    private String anio;
    //private Artista artista; dejamos que sólo las canciones tengan artista
    private Set<Cancion> listaCanciones;
    
    public Album (String nombre, String anio){
        this.nombre = nombre;
        this.anio = anio;
        this.listaCanciones = new HashSet<>();
    }
    
}
