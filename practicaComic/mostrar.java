package practicaComic;
import javax.swing.*;
import java.awt.*;

public class mostrar extends Thread implements narrar{
    String img;
    public mostrar(String texto) {
        super(texto);
    }

    public void lectura() {



        JFrame f=new JFrame("Mi comic");


        JLabel label1;
        JPanel panel = new JPanel();
        panel.setPreferredSize (new Dimension(400, 400));
        panel.setBackground (Color.white);
        label1 = new JLabel("");
        //label1 = new JLabel("a", imagen1, SwingConstants.CENTER);
        panel.add (label1);
        f.setSize(500,500);
        f.add(panel);
        f.setVisible(true);

        for (int i=1; i<53;i++){
          ImageIcon imagen1 = new ImageIcon(new ImageIcon("../semana1/src/practicaComic/img/" + i + ".jpg").getImage().getScaledInstance(500,700, Image.SCALE_DEFAULT));
          label1.setIcon(imagen1);
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // El hilo ha sido interrumpido. Vamos a salir de run()
                return;
            }

        }


        }





    public void run() {
        lectura();

    }
}
