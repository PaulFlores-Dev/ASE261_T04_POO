import javax.swing.*;
import java.awt.*;

public class PanelPreferencias extends JPanel {

    private JCheckBox checkNotificaciones;
    private JCheckBox checkTerminos;
    private JButton botonConfirmar;

    public PanelPreferencias() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createTitledBorder("Preferencias"));

        checkNotificaciones = new JCheckBox(
                "Deseo recibir notificaciones"
        );

        checkTerminos = new JCheckBox(
                "Acepto los términos y condiciones"
        );

        botonConfirmar = new JButton("Confirmar");

        checkNotificaciones.setAlignmentX(Component.LEFT_ALIGNMENT);
        checkTerminos.setAlignmentX(Component.LEFT_ALIGNMENT);
        botonConfirmar.setAlignmentX(Component.LEFT_ALIGNMENT);

        add(checkNotificaciones);
        add(Box.createVerticalStrut(10));
        add(checkTerminos);
        add(Box.createVerticalStrut(15));
        add(botonConfirmar);

        botonConfirmar.addActionListener(e -> confirmarRegistro());
    }

    private void confirmarRegistro() {
        if (!checkTerminos.isSelected()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Debe aceptar los términos y condiciones.",
                    "Validación",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String notificaciones = checkNotificaciones.isSelected()
                ? "Sí"
                : "No";

        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Desea registrar la información?\n"
                        + "Recibir notificaciones: " + notificaciones,
                "Confirmar registro",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(
                    this,
                    "La información fue registrada correctamente.",
                    "Registro exitoso",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Prueba de JCheckBox y JOptionPane");

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.add(new PanelPreferencias());
            ventana.setSize(430, 230);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });
    }
}
