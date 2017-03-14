package bartek;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.SwingUtilities.invokeLater;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Application {

    private void displayBoard() {
        JFrame frame = new JFrame("Clicker");
        Label label = new Label("Label", SwingConstants.CENTER);
        label.setText("0");
        label.setFont(new Font("Arial", Font.BOLD, 40));

        JButton button = new JButton();
        button.setText("Click me!");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1) {
                    label.incrementCounter(1);
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(2, 1));

        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        invokeLater(() -> new Application().displayBoard());
    }
}
