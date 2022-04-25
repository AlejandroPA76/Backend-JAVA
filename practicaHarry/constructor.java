package practicaHarry;

public class constructor {
    String casa;
    String genero;
    String nombre;
    String boggart;
    String patronus;


    public constructor(String casa, String genero, String nombre, String boggart, String patronus){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }
    public void descripcionMagos(){
        System.out.println("casa: "+casa+ "\ngenero: "+genero+ "\nnombre: "+nombre+ "\nboggart: "+boggart+ "\npatronus: "+patronus+"\n------------------------------");
    }
}
