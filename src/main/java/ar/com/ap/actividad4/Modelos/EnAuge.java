
package ar.com.ap.actividad4.Modelos;

import static ar.com.ap.actividad4.Modelos.Icono.ROCKET;

public class EnAuge implements Popularidad {
    
    @Override
    public String getIcono() {
        return "ROCKET";  
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getArtista().getNombre() + " - " + cancion.getTitulo() + " - (" + cancion.getAlbum().getNombre() + " - " + cancion.getAlbum().getAnio() + ")"; 
    }
    
    @Override
    public void actualizar(Cancion cancion) {
        
        if (cancion.getReproducciones() > 50000  && cancion.getLikes() > 20000){
            cancion.setPopularidad(new EnTendencia());
        }
        
        if (cancion.getDislikes()> 5000){
            cancion.setPopularidad(new Normal());
        }
    }

}
