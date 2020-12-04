import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe7 {
    private JPanel Panel1;
    private JButton button1;
    private JTextField textField1;
    private JRadioButton option1RadioButton;
    private JRadioButton option2RadioButton;
    private JRadioButton option3RadioButton;


    public static void main(String[] args) {
        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe7().Panel1);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FormTest.pack();
        FormTest.setVisible(true);
    }

    public Aufgabe7() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (option1RadioButton.isSelected()){
                    textField1.setText(option1RadioButton.getText());
                }else if (option2RadioButton.isSelected()) {
                    textField1.setText(option2RadioButton.getText());
                }else if (option3RadioButton.isSelected()) {
                    textField1.setText(option3RadioButton.getText());
                }else
                    textField1.setText("Bitte wähle eine Option");
            }
        });
    }
}
