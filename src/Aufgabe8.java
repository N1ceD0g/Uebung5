import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Aufgabe8 {
    private JPanel panel1;
    private JList list1;
    private JButton button1;
    private JButton oButton2;
    private JButton oButton3;
    private JButton oButton1;
    private JTextField TextField1;
    private JTextField TextField2;
    private JTextField TextField3;

    public static void main(String[] args) {
        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe8().panel1);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FormTest.pack();
        FormTest.setVisible(true);


    }

    public Aufgabe8() {
        oButton1.setVisible(false);
        TextField1.setVisible(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                oButton1.setVisible(true);
                TextField1.setVisible(true);
                oButton2.setVisible(false);
                TextField2.setVisible(false);
            }
        });
        oButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(true);
                oButton1.setVisible(false);
                TextField1.setVisible(false);
                oButton2.setVisible(true);
                TextField2.setVisible(true);
            }
        });
        oButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                oButton1.setVisible(true);
                TextField1.setVisible(true);
                oButton2.setVisible(false);
                TextField2.setVisible(false);
            }
        });

        oButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
