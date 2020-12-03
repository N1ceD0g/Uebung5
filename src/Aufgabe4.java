import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe4 {
    private JButton counter0Button;
    private JPanel panel;

    public static void main(String[] args) {
        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe4().panel);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FormTest.pack();
        FormTest.setVisible(true);

    }

    public Aufgabe4() {
        counter0Button.addActionListener(new ActionListener() {
            int clicked = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                clicked++;
                //System.out.println(clicked);
                counter0Button.setText("Counter "+ clicked);
            }
        });
    }
}
