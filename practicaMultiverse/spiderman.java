package practicaMultiverse;

public class spiderman implements ataques{
    String nombre;
    String genero;
    String colorTraje;

    public spiderman() {
    this.nombre = "Peter Parker, spiderman";
    this.genero = "hombre";
    this.colorTraje = "Rojo con franjas azules";
    }

    public void caracteristicas(){
        System.out.println("--------------------------------------------\n"+"Nombre: "+ this.nombre +"\nGenero: "+this.genero+ "\nColor de traje: "+this.colorTraje);

    }

    public void ataque1() {
        System.out.println("Ataque 1: lanzar autos");
    }

    public void ataque2() {
        System.out.println("Ataque 2: Telaraña orgánica");
    }

    public void ataque3() {
        System.out.println("Ataque 3: Aguijones");
    }
}
