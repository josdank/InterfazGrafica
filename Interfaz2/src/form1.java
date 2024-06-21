import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField n1;
    public JPanel mainPanel;
    private JTextField n2;
    private JButton Resta;
    private JButton division;
    private JButton Multiplicación;
    private JButton Division;
    private JTextField respuesta;
    private JLabel respuesta1;
    private JButton Suma;

    public form1() {
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(n1.getText());
                float numero2 = Float.parseFloat(n2.getText());
                if (numero1 != 0 && numero2 != 0) {
                    respuesta.setText(String.valueOf(numero1 + numero2));
                }
                respuesta.setText(respuesta.getText());
            }
        });
        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(n1.getText());
                float numero2 = Float.parseFloat(n2.getText());
                if (numero1 != 0 && numero2 != 0) {
                    respuesta.setText(String.valueOf(numero1 - numero2));
                }
                respuesta.setText(respuesta.getText());
            }
        });
        Multiplicación.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(n1.getText());
                float numero2 = Float.parseFloat(n2.getText());
                if (numero1 != 0 && numero2 != 0) {
                    respuesta.setText(String.valueOf(numero1 * numero2));
                }
                respuesta.setText(respuesta.getText());
            }
        });
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(n1.getText());
                float numero2 = Float.parseFloat(n2.getText());
                if (numero2 != 0) {
                    respuesta.setText(String.valueOf(numero1 / numero2));
                }else {
                    respuesta.setText("No se puede para 0");

                }
                respuesta.setText(respuesta.getText());
            }
        });
    }
}
