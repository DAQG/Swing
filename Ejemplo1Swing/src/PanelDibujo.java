import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    // Dibuja una X de las esquinas del panel
    public void paintComponent(Graphics g) {

        //llama a painComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);
        int anchura = getWidth(); // anchura total
        int altura = getHeight(); // altura total
        //Dibuja una linea de la esquina inferior izquierda a la esquina superior derecha
       // g.drawLine(0, 0, anchura, altura);
        //Dibuja una linea de la esquina superior izquierda a la esquina superior derecha
        //g.drawLine(0,altura, anchura, 0);
        g.drawLine(10,250,10,210);
        g.drawLine(10,210,20,220);
        g.drawLine(10,250,20,240);
        g.drawLine(20,239,20,220);
        /////holoaaaaaaaaaaaaaaaaaaaaaaaaaa
    } // fin metodo paint componente
}//fin codigo de la clase PanelDibujo
