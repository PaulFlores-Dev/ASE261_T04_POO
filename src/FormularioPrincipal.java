import javax.swing.*;
import java.awt.*;

public class FormularioPrincipal extends JFrame {

    private JPanel panelPrincipal;

    private JTextField txtNombre;
    private JTextField txtDocumento;
    private JTextField txtTelefono;

    public FormularioPrincipal() {
        setTitle("Formulario - Proyecto P00");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cierra la app al dar click en X
        setLocationRelativeTo(null); // centra la ventana en la pantalla

        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // --- CAMPO NOMBRE ---
        JLabel lblNombre = new JLabel("Nombre Completo:");
        lblNombre.setAlignmentX(Component.LEFT_ALIGNMENT);
        txtNombre = new JTextField();
        txtNombre.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        txtNombre.setAlignmentX(Component.LEFT_ALIGNMENT);

        // --- CAMPO DOCUMENTO ---
        JLabel lblDocumento = new JLabel("Documento / DNI:");
        lblDocumento.setAlignmentX(Component.LEFT_ALIGNMENT);
        txtDocumento = new JTextField();
        txtDocumento.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        txtDocumento.setAlignmentX(Component.LEFT_ALIGNMENT);

        // --- CAMPO TELÉFONO ---
        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setAlignmentX(Component.LEFT_ALIGNMENT);
        txtTelefono = new JTextField();
        txtTelefono.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        txtTelefono.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Agregar elementos al panel con espacios verticales
        panelPrincipal.add(lblNombre);
        panelPrincipal.add(Box.createVerticalStrut(5));
        panelPrincipal.add(txtNombre);
        panelPrincipal.add(Box.createVerticalStrut(15));

        panelPrincipal.add(lblDocumento);
        panelPrincipal.add(Box.createVerticalStrut(5));
        panelPrincipal.add(txtDocumento);
        panelPrincipal.add(Box.createVerticalStrut(15));

        panelPrincipal.add(lblTelefono);
        panelPrincipal.add(Box.createVerticalStrut(5));
        panelPrincipal.add(txtTelefono);
        panelPrincipal.add(Box.createVerticalStrut(20));

        add(panelPrincipal);
    }

    // MÉTODOS GETTER

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public String getDocumento() {
        return txtDocumento.getText().trim();
    }

    public String getTelefono() {
        return txtTelefono.getText().trim();
    }

    // Getters de los objetos por si necesita modificarlos directamente
    public JTextField getTxtNombre() { return txtNombre; }
    public JTextField getTxtDocumento() { return txtDocumento; }
    public JTextField getTxtTelefono() { return txtTelefono; }
    public JPanel getPanelPrincipal() { return panelPrincipal; }
}