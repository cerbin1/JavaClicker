package bartek;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Application {

    private void displayBoard() {
        JFrame frame = new JFrame("Clicker");
        JLabel text = new JLabel("Label", SwingConstants.CENTER);
        text.setText("0");
        text.setFont(new Font("Arial", Font.BOLD, 40));

        JButton button = new JButton();
        button.setText("Click me!");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1) {
                    text.setText(Integer.toString(Integer.parseInt(text.getText()) + 1));
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(2, 1));

        panel.add(button);
        panel.add(text);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Application().displayBoard());
    }
}
