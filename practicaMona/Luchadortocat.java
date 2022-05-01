package practicaMona;

public class Luchadortocat extends mona{
    public Luchadortocat() {
    }

    public Luchadortocat(String nombre, String colorOjos, String colorPiel, int numTentaculos, String caracteristica) {
        super(nombre, colorOjos, colorPiel, numTentaculos, caracteristica);
    }

    @Override
    public String toString() {
        return "---------------------------------------\n" +"nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPiel='" + colorPiel + '\'' +
                ", numTentaculos=" + numTentaculos +
                ",\ncaracteristicas="+ caracteristica+
                " ,Personalidad Luchadortocat";
    }
}
