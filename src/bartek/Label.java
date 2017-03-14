package bartek;

import javax.swing.*;

class Label extends JLabel{
    Label(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    void incrementCounter(int number) {
        int counter = Integer.parseInt(this.getText()) + number;
        this.setText(Integer.toString(counter));
    }
}
