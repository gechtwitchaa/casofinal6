import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class InterfazUsuarioInteractiva extends JFrame {
    private JTextArea areaTexto;
    private JTextField campoTexto;
    private JButton botonAgregar;
    private JButton botonIndexar;
    private JButton botonListar;
    private GestionEstudiantes gestionEstudiantes;

    public InterfazUsuarioInteractiva() {
        gestionEstudiantes = new GestionEstudiantes();

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

        botonIndexar = new JButton("Indexar Archivos");
        botonIndexar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexarArchivos();
            }
        });

        botonListar = new JButton("Listar Archivos");
        botonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarArchivos();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        panelBotones.add(botonAgregar);
        panelBotones.add(botonIndexar);
        panelBotones.add(botonListar);

        JPanel panelTexto = new JPanel();
        panelTexto.setLayout(new BorderLayout());
        panelTexto.add(campoTexto, BorderLayout.NORTH);
        panelTexto.add(scrollPane, BorderLayout.CENTER);

        add(panelTexto, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void agregarDato() {
        String nuevoDato = campoTexto.getText();
        areaTexto.append(nuevoDato + "\n");
        campoTexto.setText("");
    }

    private void indexarArchivos() {
        Map<String, String> nombresRutas = gestionEstudiantes.indexarArchivos();
        areaTexto.append("Indexación completa:\n");
        for (Map.Entry<String, String> entry : nombresRutas.entrySet()) {
            areaTexto.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
    }

    private void listarArchivos() {
        Map<String, String> nombresRutas = gestionEstudiantes.indexarArchivos();
        areaTexto.append("Lista de nombres y rutas:\n");
        String[] listaNombresRutas = new String[0];
        for (String nombreRuta : listaNombresRutas) areaTexto.append(nombreRuta + "\n");
    }

    public static void main(String[] args) {
        // Compilación de todos los módulos
        compileModules();

        // Inicio de la interfaz de usuario
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuarioInteractiva();
            }
        });
    }

    private static void compileModules() {
    }

    private class GestionEstudiantes {
        public Map<String, String> indexarArchivos() {
            return null;
        }
    }
}
