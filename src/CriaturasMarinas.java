public abstract class CriaturasMarinas
{
    // Atributos:
    String Nombre;
    
    // Contructor:
    public CriaturasMarinas(String nombre)
    {
        this.Nombre = nombre;
    }
    
    // Se sobreescrirá en las clases que hereden de Criaturas Marinas:
    public abstract void nadar();
}
