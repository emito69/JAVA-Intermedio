
package ar.com.ap.actividad4.Modelos;

import static ar.com.ap.actividad4.Modelos.Icono.MUSICAL_NOTE;

public class Normal implements Popularidad{
            
    @Override
    public String getIcono() {
        //return MUSICAL_NOTE.texto();      
        return "MUSICAL_NOTE";  
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getArtista().getNombre() + " - " + cancion.getAlbum().getNombre() + " - " + cancion.getTitulo(); 
    }

    @Override
    public void actualizar(Cancion cancion) {
        
        if (cancion.getReproducciones() > 1000){
            cancion.setPopularidad(new EnAuge());
        }
    }

  
}
