import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField nombre1;
    private JPasswordField contrasenia;
    private JButton Borrar;
    private JButton okButton;
    private JLabel nombre;
    private JLabel Contraseña;
    private JLabel nombrelbl;

    public form1() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = "Josue";
                String password = "hola";

                String user_1 = nombre.getText();
                String password_1 = contrasenia.getText();

                if (user.equals(user_1) && password.equals(password_1)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                }
                else {
                    JOptionPane.showMessageDialog(null, " INGRESE CORRECTAMENTE SUS CREDENCIALES ");
                }
            }
        });
        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre1.setText(null);
                contrasenia.setText(null);
            }
        });
    }
}
