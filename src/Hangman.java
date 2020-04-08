import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hangman extends JFrame implements ActionListener {

    JLabel display = new JLabel("Enter word: ");
    static JTextField textfield = new JTextField(1);
    JButton button = new JButton("Submit");

    public Hangman() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        getContentPane().add(panel);
        display.setPreferredSize(new Dimension(200, 30));
        display.setFont(new Font("Arial", Font.PLAIN, 25));
        textfield.setPreferredSize(new Dimension(150, 30));
        this.setTitle("Hangman");
        panel.add(textfield);
        textfield.addActionListener(this);
        panel.add(button);
        button.setFont(new Font("Arial", Font.PLAIN, 25));
        button.addActionListener(this);

        getContentPane().add(display, BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.setSize(400, 400);
        hangman.setVisible(true);
        hangman.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}

