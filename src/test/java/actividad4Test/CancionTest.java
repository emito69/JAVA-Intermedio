
package actividad4Test;

import ar.com.ap.actividad4.Modelos.Album;
import ar.com.ap.actividad4.Modelos.Artista;
import ar.com.ap.actividad4.Modelos.Cancion;
import ar.com.ap.actividad4.Modelos.EnAuge;
import ar.com.ap.actividad4.Modelos.EnTendencia;
import ar.com.ap.actividad4.Modelos.Normal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CancionTest {
    
    @Test
    public void cancionRecienLanzadaPopularidadNormal() {
     
        Cancion cancion = new Cancion("The Scientist", "2002");
        
        Assertions.assertInstanceOf(Normal.class, cancion.getPopularidad(), "Fallo TEST 1: El ESTADO de Popularidad no es NORMAL.class");
    }
    
    @Test
    public void cancionCon1001RespoduccionesSubePopularidadEnAuge() {
     
        Cancion cancion = new Cancion("The Scientist", "2002");
        cancion.setReproducciones(1001);
        cancion.actualizarPopularidad();
   
        Assertions.assertInstanceOf(EnAuge.class, cancion.getPopularidad(), "Fallo TEST 2: El ESTADO de Popularidad no es EnAuge.class");        
    }   
    
    
    @Test
    public void cancionCon5001DislikesBajaPopularidadNormal() {
     
        Cancion cancion = new Cancion("The Scientist", "2002");
        
        cancion.setPopularidad(new EnAuge());
        
        cancion.setDislikes(5001);
        cancion.actualizarPopularidad();
   
        Assertions.assertInstanceOf(Normal.class, cancion.getPopularidad(), "Fallo TEST 3: El ESTADO de Popularidad no bajó a Normal.class");        
    }       
    
    @Test
    public void cancionCon50001ReprodY20001LikesSubePopularidadEnTendencia() {
     
        Cancion cancion = new Cancion("The Scientist", "2002");
        
        cancion.setPopularidad(new EnAuge());
        
        cancion.setReproducciones(50001);
        cancion.setLikes(20001);
        cancion.setDislikes(4999);
        
        cancion.actualizarPopularidad();
   
        Assertions.assertInstanceOf(EnTendencia.class, cancion.getPopularidad(), "Fallo TEST 4: El ESTADO de Popularidad no subió a EnTendencia.class");        
    }       

    @Test
    public void cancionNoSeEscucha24hsBajaPopularidadNormal() {
     
        Cancion cancion = new Cancion("The Scientist", "2002");
        
        cancion.setPopularidad(new EnTendencia());
        
        cancion.setReprodLast24hs(false);
        
        cancion.actualizarPopularidad();
   
        Assertions.assertInstanceOf(Normal.class, cancion.getPopularidad(), "Fallo TEST 5: El ESTADO de Popularidad no bajó a Normal.class");        
    }    
    
}
