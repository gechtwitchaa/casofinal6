public class Main {
    public static void main(String[] args) {
        compileModules();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuarioInteractivo();
            }
        });
    }

    private static void compileModules() {
        String[] modules = {"GestionEstudiantes", "GestionRelaciones", "RecuperacionEficiente"};

        for (String module : modules) {
            compileModule(module);
        }
    }

    private static void compileModule(String moduleName) {
        String[] javacCmd = {"javac", "-d", "out/production/GestionDatosDinamicos",
                "src/" + moduleName + ".java"};
        executeCommand(javacCmd);
    }

    private static void executeCommand(String[] cmd) {
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private record InterfazUsuarioInteractivo() {
    }
}
