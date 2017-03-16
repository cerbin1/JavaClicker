package bartek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.awt.BorderLayout.*;
import static javax.swing.SwingUtilities.invokeLater;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import static javax.swing.SwingConstants.CENTER;

public class Application {

    private void displayBoard() {
        JFrame frame = new JFrame("Clicker");
        Label label1 = new Label("Label", CENTER);
        Label label2 = new Label("Label", CENTER);
        label1.setText("0");
        label1.setFont(new Font("Arial", Font.BOLD, 40));

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        button1.setText("Click me!");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1) {
                    label1.incrementCounter(1);
                }
            }
        });
        Container pane = frame.getContentPane();
        JPanel panel = new JPanel(new BorderLayout());

        pane.add(label1, PAGE_START);
        pane.add(button1, LINE_START);
        pane.add(button2, PAGE_START);
        pane.add(button3, LINE_END);
        panel.add(label2, PAGE_END);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000, 1000);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        invokeLater(() -> new Application().displayBoard());
    }
}
