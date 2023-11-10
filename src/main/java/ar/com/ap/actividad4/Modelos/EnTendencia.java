
package ar.com.ap.actividad4.Modelos;

import static ar.com.ap.actividad4.Modelos.Icono.FIRE;

public class EnTendencia implements Popularidad {

    @Override
    public String getIcono() {
        return "FIRE";  
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getTitulo() + " - " + cancion.getArtista().getNombre() + " - (" + cancion.getAlbum().getNombre() + " - " + cancion.getAlbum().getAnio() + ")"; 
    }
    
    @Override
    public void actualizar(Cancion cancion) {
        
        if (!cancion.isReprodLast24hs()){
            
            cancion.setPopularidad(new Normal());
        }
    }    
}
