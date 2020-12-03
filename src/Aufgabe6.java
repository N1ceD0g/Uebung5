import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Aufgabe6 {
    private JTextField Eingabefeld;
    private JButton pushMePlsButton;
    private JPanel Panel1;
    private JLabel Label;

    public static void main(String[] args) {
        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe6().Panel1);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FormTest.pack();
        FormTest.setVisible(true);
    }

    public Aufgabe6() {
        pushMePlsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText("Servus "+ Eingabefeld.getText()+ ", schön dass du da bist ;)");
            }
        });
    }

}
