package vista;

import javax.swing.*;

public class login {


    private JPanel Principal;
    private JLabel titulo;
    private JPasswordField txtPassword;
    private JTextField txtUser;
    private JButton btnIniciar;
    private JButton btnSalir;

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
