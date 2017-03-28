package Cursada.Clases.Clase1.Swing;

import javax.swing.*;

/**
 * Created by DiegoMancini on 1/3/17.
 */
public class MainWindow {

    public MainWindow() {
        JFrame frame = new JFrame("HelloWorldSwing");

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label); // Pone el label en el contenedor

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // Tamaño ajustado
        frame.setLocationRelativeTo(null);  // Lo pone en el medio
        frame.setVisible(true); // Lo muestra
    }

}
