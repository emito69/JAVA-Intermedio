
package ar.com.ap.actividad4.Modelos;

import lombok.Data;

@Data
public class Artista {
    
    private String nombre; 
    
    public Artista(String nombre){
        
        this.nombre = nombre;
    }
    
}
