package practicaMultiverse;

public class scarletSpider extends spiderman implements ataques{
    public scarletSpider(){
        this.nombre= "Benjami Reilly, scarlet Spider";
        this.genero= "hombre";
        this.colorTraje="traje color vino, sudadera azul y cinturon blanco";
    }
    public void caracteristicas(){
        System.out.println("--------------------------------------------\n"+"Nombre: "+ this.nombre +"\nGenero: "+this.genero+ "\nColor de traje: "+this.colorTraje);
    }

    public void ataque1() {
        System.out.println("Ataque 1: telarana de impacto");
    }

    public void ataque2() {
        System.out.println("Ataque 2: dardos paralizante");
    }

    public void ataque3() {
        System.out.println("Ataque 3: red paralizante");
    }
}
