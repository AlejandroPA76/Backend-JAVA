package practicaHarry;

public class principal {
    public static void main(String[] args) {

        constructor harry = new constructor("Gryffindor","Femenino","Hermione Jean Granger ","La profesora McGonagall le dice que reprobó todos sus exámenes","nutria");
        constructor jamesPotter = new constructor("Gryffindor","Masculino","James Potter I","Lord Voldemort","Ciervo");
        constructor minerva = new constructor("Gryffindor","Femenino","Minerva McGonagall","Lord Voldemort","Gato con lineas alrededor de los ojos");
        constructor ron = new constructor("Gryffindor","Masculino","Ronald Weasley","araña enorme","Jack Russell terrier");
        constructor lupin = new constructor("Hufflepuff","Femenino","Nymphadora Lupin","Perder sus habilidades","Liebre[10] (antes de 1995)\n" +
                "Lobo(1995-1998)");

        harry.descripcionMagos();
        jamesPotter.descripcionMagos();
        minerva.descripcionMagos();
        ron.descripcionMagos();
        lupin.descripcionMagos();
    }
}
