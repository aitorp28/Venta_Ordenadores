package vista;

import javax.swing.*;

public class login {


    private JPanel Principal;
    private JTextPane titulo;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
