import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber extends JFrame implements ActionListener {

    JLabel display = new JLabel("Guess a number between 1 and 10");
    int guess;
    Random generator = new Random();
    int number = generator.nextInt(10) + 1;


    public GuessNumber(){
        String[] labels = { "7", "8", "9",
                "4", "5", "6",
                "1", "2", "3", "0", "C"};
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        getContentPane().add(panel, BorderLayout.CENTER);
        display.setPreferredSize(new Dimension(400,30));
        display.setFont(new Font("Arial", Font.PLAIN,25));
        this.setTitle("guessNumber");

        for(int i = 0; i< 11; i++) {
            JButton button = new JButton(labels[i]);
            button.setFont(new Font("Arial", Font.PLAIN, 25));
            panel.add(button);
            button.addActionListener(this);
        }

        getContentPane().add(display,BorderLayout.NORTH);
    }
    public static void main(String[] args){
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.setSize(400,400);
        guessNumber.setVisible(true);
        guessNumber.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();
        display.setText("");
        switch (currentButton){
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                display.setText(display.getText() + currentButton);
            guess = Integer.parseInt(display.getText());
            if (guess == number){
                display.setText("True");
            }
            break;
            case "C":
                guess = 0;
                display.setText("");
                break;

        }

    }
}
