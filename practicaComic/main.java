package practicaComic;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Comenzar con el comic?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
        Thread t1 = new mostrar("hilo 1");
        t1.start();

        }
    }
}
