package vista;

import controlador.c_login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class login extends JFrame implements ActionListener{


    private JPanel Principal;
    private JLabel titulo;
    private JPasswordField txtPassword;
    private JTextField txtUser;
    private JButton btnIniciar;
    private JButton btnSalir;
    private static JFrame frame;
    public login() {
        btnIniciar.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public static void main(String[] args) {
        frame = new JFrame("login");
        frame.setContentPane(new login().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnIniciar){
            String password=new String(txtPassword.getPassword());
            if(c_login.compr_usu(txtUser.getText().toLowerCase(Locale.ROOT).trim(),password.toLowerCase(Locale.ROOT).trim())){
                frame.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource()==btnSalir){
            int dialogo=JOptionPane.showConfirmDialog(null,"¿Deseas salir?","Salir",JOptionPane.YES_NO_CANCEL_OPTION);
            if (dialogo==0){
                System.exit(0);
            }
        }
    }
}
