import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //System.out.print("Hello Gradle!\n");

        // Garante que a criação da GUI será feita na thread correta
        SwingUtilities.invokeLater(() -> {
            MyForm form = new MyForm(); // instanciando seu Form
            form.setVisible(true);      // tornando o Form visível
        });
    }
}
