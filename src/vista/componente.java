package vista;

import javax.swing.*;

public class componente {


    private JComboBox comboBox1;
    private JButton btnComprar;
    private JLabel lblTitulo;
    private JLabel lblCaja;
    private JLabel lblPlaca;
    private JLabel lblProcesador;
    private JLabel lblRam;
    private JLabel lblGrafica;
    private JLabel lblAlmacenamiento;
    private JLabel lblRefrigeracio;
    private JLabel lblFuenteDeAlimentacion;
    private JPanel jpComponente;

    public static void main(String[] args) {
        JFrame frame = new JFrame("componente");
        frame.setContentPane(new componente().jpComponente);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
