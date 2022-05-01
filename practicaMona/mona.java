package practicaMona;

public class mona {
    String nombre;
    String colorOjos;
    String colorPiel;
    int numTentaculos;

    String caracteristica;
    public mona(){

    }
    public mona( String nombre, String colorOjos, String colorPiel, int numTentaculos, String caracteristica){
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.colorPiel = colorPiel;
        this.numTentaculos = numTentaculos;
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "---------------------------------------\n" +"nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPiel='" + colorPiel + '\'' +
                ", numTentaculos=" + numTentaculos +
                ",\ncaracteristicas="+ caracteristica+
                " ,Personalidad original";
    }
}
