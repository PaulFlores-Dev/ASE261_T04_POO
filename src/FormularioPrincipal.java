import javax.swing.*;
import java.awt.*;

public class FormularioPrincipal extends JFrame {

    private JPanel panelPrincipal;

    public FormularioPrincipal() {
        setTitle("Formulario - Proyecto POO");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cierra la app al dar click en X
        setLocationRelativeTo(null); // centra la ventana en la pantalla

        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        add(panelPrincipal);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioPrincipal ventana = new FormularioPrincipal();
            ventana.setVisible(true);
        });
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }
}