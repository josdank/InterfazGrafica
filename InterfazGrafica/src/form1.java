import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton btnOK;
    public JPanel mainPanel;
    private JLabel nombrelbl;
    private JButton eliminarButton;
    private JTextField saludoTXT;
    private JButton capturarTexto;

    public Container mainPanel() {
        return mainPanel;
    }

    public form1 () {
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombrelbl.setText("Hola soy Josué Guerra");
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombrelbl.setText(null);
            }
        });
        capturarTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludoTXT.setText(saludoTXT.getText());
                nombrelbl.setText(saludoTXT.getText());
            }
        });
    }
}
