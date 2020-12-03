import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe3 {
    private JButton button1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JPanel panel;

    public Aufgabe3() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe3().panel);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FormTest.pack();
        FormTest.setVisible(true);

        JButton Button2 = new JButton();
        Button2.setVisible(true);
        Button2.setBackground(Color.BLACK);
        FormTest.add(Button2);

    }
}
