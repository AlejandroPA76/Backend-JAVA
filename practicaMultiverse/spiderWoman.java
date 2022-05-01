package practicaMultiverse;

public class spiderWoman extends spiderman implements ataques{

    public spiderWoman() {
        this.nombre="Jessica Drew, spider-woman";
        this.genero="mujer";
        this.colorTraje="traje negro con logotipo rojo";
    }


    public void caracteristicas() {
        System.out.println("--------------------------------------------\n"+"Nombre: "+ this.nombre +"\nGenero: "+this.genero+ "\nColor de traje: "+this.colorTraje);

    }

    public void ataque1() {
        System.out.println("Ataque 1: rafagas de bioelectricidad");
    }

    public void ataque2() {
        System.out.println("Ataque 2: levantar objetos super pesados y lanzarlos");
    }

    public void ataque3() {
        System.out.println("Ataque 3: adherirse a cualquier objeto");
    }
}
