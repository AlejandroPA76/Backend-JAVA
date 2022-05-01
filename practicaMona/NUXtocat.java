package practicaMona;

public class NUXtocat extends mona{
    public NUXtocat(){
    }

    public NUXtocat(String nombre, String colorOjos, String colorPiel, int numTentaculos, String caracteristica) {
        super(nombre, colorOjos, colorPiel, numTentaculos, caracteristica);
    }

    @Override
    public String toString() {

        return "---------------------------------------\n" +"nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPiel='" + colorPiel + '\'' +
                ", numTentaculos=" + numTentaculos +
                ",\ncaracteristicas="+ caracteristica+
                " ,Personalidad NUXtocat";
    }
}
