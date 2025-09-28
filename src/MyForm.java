import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {
    public MyForm() {
        setTitle("Meu Formulário");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Clique aqui");
        panel.add(button);

        add(panel, BorderLayout.CENTER);
    }
}
