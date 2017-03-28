package Cursada.Clases.Clase1.Swing;

import javax.swing.*;

/**
 * Created by DiegoMancini on 1/3/17.
 */
public class HelloWorldSwing {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }

}
