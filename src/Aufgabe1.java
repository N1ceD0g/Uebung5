import javax.swing.*;

public class Aufgabe1 {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField6;
    private JTextField textField11;

        //main
    public static void main(String[] args) {
        //Variable für GUI Form: FormTest
        JFrame FormTest = new JFrame();
        //Aufruf von panel 1
        FormTest.setContentPane(new Aufgabe1().panel1);
        //Wenn X gedrückt wird, soll das Programm auch beenden
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //größe von panel wird (an komponenten) angepasst :
        FormTest.setSize(500,500); //fullHD
        //FormTest.pack();
        //damit Panel sichtbar ist.
        FormTest.setVisible(true);
    }
}
