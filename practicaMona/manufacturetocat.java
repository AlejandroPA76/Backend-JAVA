package practicaMona;

public class manufacturetocat extends mona{
    public manufacturetocat(){
    }

    public manufacturetocat(String nombre, String colorOjos, String colorPiel, int numTentaculos, String caracteristica) {
        super(nombre, colorOjos, colorPiel, numTentaculos, caracteristica);
    }

    @Override
    public String toString() {

        return "nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPiel='" + colorPiel + '\'' +
                ", numTentaculos=" + numTentaculos +
                ",\ncaracteristicas="+ caracteristica+
                " ,Personalidad manufacturetocat ";
    }
}
