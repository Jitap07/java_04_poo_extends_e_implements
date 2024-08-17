import Interfaces.Alimentable;
import Interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable
{
    public Delfin(String nombre)
    {
        super(nombre);
    }
    
    // Proviene de la clase "abstract":
    @Override
    public void nadar()
    {
        System.out.println(Nombre + " está nadando con velocidad sobre las olas! ");
    }
    
    // Proviene de la clase "implements":
    @Override
    public void comunicar()
    {
        System.out.println(Nombre + " emite sonidos y chasquidos para comunicarse. ");
    }
    
    @Override
    public void alimentar()
    {
        System.out.println("Le dimos de comer una galleta a " + Nombre + ".");
    }
}
