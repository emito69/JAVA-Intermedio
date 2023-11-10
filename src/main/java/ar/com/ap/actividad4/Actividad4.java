
package ar.com.ap.actividad4;

import ar.com.ap.actividad4.Modelos.*;

public class Actividad4 {

    public static void main(String[] args) {
        
        //**** **** **** **** **** **** **** **** **** **** **** **** **** **** ****// 
        //**** Armamos Artista, Cancions y Album segun lo que indica la actividad ****//

        Artista artista = new Artista("Coldplay");
        
        Cancion cancion = new Cancion("The Scientist", "2002");
        cancion.setArtista(artista);
        
        Album album = new Album("A Rush of Blood to the head", "2002");
        album.getListaCanciones().add(cancion);
        
        cancion.setAlbum(album);   // ahora que hay un album creado puedo completarlo en los datos de la cancion 

        //**** **** **** **** **** **** **** **** **** **** **** **** **** **** ****//       
        
        //una canción arranca con estado Normal //
        System.out.println(cancion.getPopularidad()); // vemos qué instancia de estado contiene
        System.out.println(cancion.getIcono() + " - " + cancion.getLeyenda() + "\n");
        
        // Actualización de Popularidad // 
        
        cancion.setReproducciones(1001);
        cancion.actualizarPopularidad();
        System.out.println(cancion.getPopularidad()); // vemos qué instancia de estado contiene
        System.out.println(cancion.getIcono() + " - " + cancion.getLeyenda() + "\n");

        // Actualización de Popularidad // 
        
        cancion.setDislikes(5001);
        cancion.actualizarPopularidad();
        System.out.println(cancion.getPopularidad()); // vemos qué instancia de estado contiene
        System.out.println(cancion.getIcono() + " - " + cancion.getLeyenda() + "\n");

        // Actualización de Popularidad // 
        
        cancion.actualizarPopularidad();
        System.out.println(cancion.getPopularidad()); // vemos qué instancia de estado contiene
        System.out.println(cancion.getIcono() + " - " + cancion.getLeyenda() + "\n"); 

        // Actualización de Popularidad // 
        
        cancion.setReproducciones(50001);
        cancion.setLikes(20001);
        cancion.setDislikes(4999);
        cancion.setReprodLast24hs(true);
        cancion.actualizarPopularidad();
        System.out.println(cancion.getPopularidad()); // vemos qué instancia de estado contiene
        System.out.println(cancion.getIcono() + " - " + cancion.getLeyenda() + "\n");

        // Actualización de Popularidad // 
        
        cancion.setReprodLast24hs(false);
        cancion.actualizarPopularidad();
        System.out.println(cancion.getPopularidad()); // vemos qué instancia de estado contiene
        System.out.println(cancion.getIcono() + " - " + cancion.getLeyenda() + "\n");
        
    }
}
