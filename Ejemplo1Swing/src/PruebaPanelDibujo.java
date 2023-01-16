import javax.swing.*;
import javax.swing.JOptionPane;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        JFrame aplicacion = new JFrame();
        aplicacion.add(panel);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);

    }

}
