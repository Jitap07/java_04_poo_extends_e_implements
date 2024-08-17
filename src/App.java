public class App {
    public static void main(String[] args) throws Exception
    {
        Delfin delfin = new Delfin("Adolfina");
        delfin.nadar();
        delfin.comunicar();
        delfin.alimentar();
        
        System.out.println("");
        
        Pulpo pulpo = new Pulpo("Gonzales",8);
        pulpo.nadar();
        pulpo.comunicar();
        pulpo.alimentar();
    }
}
