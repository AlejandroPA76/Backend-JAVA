package practicaMultiverse;

public class spiderMan2099 extends spiderman implements ataques{
    public spiderMan2099() {
        this.nombre="Miguel O'Hara, spiderman 2099";
        this.genero="hombre";
        this.colorTraje="traje negro con logotipo rojo";
    }

    public void caracteristicas() {
        System.out.println("--------------------------------------------\n"+"Nombre: "+ this.nombre +"\nGenero: "+this.genero+ "\nColor de traje: "+this.colorTraje);

    }

    public void ataque1() {
        System.out.println("Ataque 1: garras retractiles");
    }

    public void ataque2() {
        System.out.println("Ataque 2: lanzar objetos muy pesados");
    }

    public void ataque3() {
        System.out.println("Ataque 3: super saltos");
    }
}
