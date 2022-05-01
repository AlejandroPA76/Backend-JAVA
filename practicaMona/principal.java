package practicaMona;

public class principal {
    public static void main(String[] args) {
        mona m = new mona("The Octocat","cafe","negra y cafe",5,"tu eres mona la original y sin rodeos");
        NUXtocat n = new NUXtocat("The Octocat","cafe","negra y cafe",5,"te gusta la tecnologia y tiene gadgets");
        Yogitocat y = new Yogitocat("The Octocat","cafe","negra y cafe",5,"te gusta estar relagad@");
        manufacturetocat ma = new manufacturetocat("The Octocat","cafe","negra y cafe",5,"tienes un casco, botas con gafas y un pantalon");
        filmotocats fil= new filmotocats("The Octocat","cafe","negra y cafe",5,"te encanta grabar contenido en multimedia");
        boxertocat box = new boxertocat("The Octocat","cafe","negra y cafe",5,"usas guantes y una cinta en la cabeza");
        Luchadortocat lu = new Luchadortocat("The Octocat","cafe","negra y cafe",5,"usas una mascara y luchar en un cuadrilatero");

        System.out.println(m);
        System.out.println(n);
        System.out.println(y);
        System.out.println(ma);
        System.out.println(fil);
        System.out.println(box);
        System.out.println(lu);
    }
}
