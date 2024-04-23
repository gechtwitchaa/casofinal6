import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class InterfazUsuarioInteractiva extends JFrame {
    private JTextArea areaTexto;
    private JTextField campoTexto;
    private JButton botonAgregar;
    private ArrayList<String> datos;

    public InterfazUsuarioInteractiva() {
        datos = new ArrayList<>();

        setTitle("Interfaz de Usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);

        areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        campoTexto = new JTextField();
        botonAgregar = new JButton("Agregar");
        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDato();
            }
        });

        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new BorderLayout());
        panelEntrada.add(campoTexto, BorderLayout.CENTER);
        panelEntrada.add(botonAgregar, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(panelEntrada, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void agregarDato() {
        String nuevoDato = campoTexto.getText();
        datos.add(nuevoDato);
        actualizarAreaTexto();
        campoTexto.setText("");
    }

    private void actualizarAreaTexto() {
        areaTexto.setText("");
        for (String dato : datos) {
            areaTexto.append(dato + "\n");
        }
    }

    public static void main(String[] args) {
        new InterfazUsuarioInteractiva();
    }
}
