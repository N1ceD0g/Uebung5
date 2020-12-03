import javax.swing.*;

public class Aufgabe5 {
    private JPanel panel1;
    private JTextField JTextFieldTextField;
    private JPasswordField JPasswordFieldPasswordField;
    private JFormattedTextField JFormattedTextFieldFormattedTextField;
    private JTextArea JTextAreaTextArea;
    private JTextPane JTextPaneTextPane;
    private JList list1;
    private JTree tree1;
    private JScrollBar scrollBar1;

    public static void main(String[] args) {
        JFrame FormTest = new JFrame();
        FormTest.setContentPane(new Aufgabe5().panel1);
        FormTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FormTest.pack();
        FormTest.setVisible(true);
    }
}
