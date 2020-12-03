import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe9 {
    private JPanel Panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton calculateInButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel Label;
    private JButton einheitButton;

    public static void main(String[] args) {

        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe9().Panel1);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FormTest.pack();
        FormTest.setVisible(true);
    }

    public Aufgabe9() {
        calculateInButton.addActionListener(new ActionListener() {

            //double input =Double.parseDouble (inputString);
            double m;
            double km;
            double meile;
            double inch;

            @Override
            public void actionPerformed(ActionEvent e) {
                String inputString = textField1.getText();
                double input=0;
                try{
                    input =Double.parseDouble (inputString);
                }
                catch(NumberFormatException x){
                    JOptionPane.showMessageDialog(null,"gib deine zahl ein");
                }
               switch (comboBox1.getSelectedIndex()){
                   case 0:
                       m = input;
                       km = input/1000;
                       meile = (input*0.00062137);
                       inch = input*39.39;
                       break;
                   case 1:
                       m = input*1000;
                       km = input;
                       meile = input*0.62137;
                       inch = input*39370;
                       break;
                   case 2:
                       m = input*1610;
                       km = input*1.61;
                       meile = input;
                       inch = input*63360;
                       break;
                   case 3:
                       m = input*0.0254;
                       km = input*0.0000254;
                       meile = input/63360;
                       inch = input;
                       break;
                    }
                   String SM = Double.toString(m);
                   String SKM = Double.toString(km);
                   String SMeile = Double.toString(meile);
                   String Sinch = Double.toString(inch);


               switch (comboBox2.getSelectedIndex()){
                   case 0:
                       textField2.setText(SM);
                       einheitButton.setText("Meter");
                   case 1:
                       textField2.setText(SKM);
                       einheitButton.setText("Kilometer");
                   case 2:
                       textField2.setText(SMeile);
                       einheitButton.setText("Meilen");
                   case 3:
                       textField2.setText(Sinch);
                       einheitButton.setText("Inches");
               }
            }
        });
    }
}
