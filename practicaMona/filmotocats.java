package practicaMona;

public class filmotocats extends  mona{
    public filmotocats() {
    }

    public filmotocats(String nombre, String colorOjos, String colorPiel, int numTentaculos, String caracteristica) {
        super(nombre, colorOjos, colorPiel, numTentaculos, caracteristica);
    }

    @Override
    public String toString() {

        return "---------------------------------------\n" +"nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPiel='" + colorPiel + '\'' +
                ", numTentaculos=" + numTentaculos +
                ",\ncaracteristicas="+ caracteristica+
                " ,Personalidad filmotocats ";
    }
}
