import Interfaces.Alimentable;
import Interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable
{
    int CantTentaculos;
    
    public Pulpo(String nombre, int canttentaculos)
    {
        super(nombre);
        this.CantTentaculos = canttentaculos;
    }
    
    // Proviene de la clase "abstract":
    @Override
    public void nadar()
    {
        System.out.println(Nombre + " está nadando con sus " + CantTentaculos + " tentáculos! ");
    }
    
    // Proviene de la clase "implements":
    @Override
    public void comunicar()
    {
        System.out.println(Nombre + " saluda con sus " + CantTentaculos + " tentáculos. ");
    }
    
    @Override
    public void alimentar()
    {
        System.out.println("Estamos alimentando con peces a " + Nombre + ".");
    }
}
