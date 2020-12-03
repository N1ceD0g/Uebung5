import javax.swing.*;
import java.awt.*;

public class Aufgabe2 {
    private JLabel Text;
    public JPanel panel1;
    private JLabel Text2;


    public static void main(String[] args) {
        JPanel panel1;
        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe2().panel1);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FormTest.pack();
        FormTest.setVisible(true);

        JLabel text = new JLabel();
        text.setText("Hallo");
        text.setFont(Font.getFont("calibri"));
        text.setForeground(Color.RED);
    }



}


