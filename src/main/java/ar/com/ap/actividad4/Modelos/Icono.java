
package ar.com.ap.actividad4.Modelos;
// https://docs.oracle.com/javase/tutorial/i18n/text/string.html

public class Icono {
    
    public static Icono MUSICAL_NOTE = new Icono(new int[]{0x004A}); //\xF0\x9F\x8E\xB5

    public static Icono ROCKET = new Icono(new int[]{0xD83D, 0xDE80});

    public static Icono FIRE = new Icono(new int[]{0xD83D, 0xDD25});

    private int[] internalEncoding;

    
    Icono(int[] internalEncoding){

        this.internalEncoding = internalEncoding;

    }

    public String texto() {

        return new String(internalEncoding, 0, internalEncoding.length);

    }
    
}