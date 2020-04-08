import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    JLabel display = new JLabel("Play TicTacToe");
    int alternate = 0;
    JButton button[] = new JButton[9];

    public TicTacToe() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        getContentPane().add(panel, BorderLayout.CENTER);
        display.setPreferredSize(new Dimension(400, 30));
        display.setFont(new Font("Arial", Font.PLAIN, 25));
        this.setTitle("TicTacToe");

        for (int i = 0; i < 9; i++) {
            button[i] = new JButton();
            button[i].setFont(new Font("Arial", Font.PLAIN, 25));
            button[i].setText("");
            panel.add(button[i]);
            button[i].addActionListener(this);
        }

        getContentPane().add(display,BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        TicTacToe tictactoe = new TicTacToe();
        tictactoe.setSize(400, 400);
        tictactoe.setVisible(true);
        tictactoe.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String checkForWin(){
        // horizontal
        if (button[0].getText() == button[1].getText()){
            if (button[1].getText() == button[2].getText()) {
                return button[0].getText();
            }
        }
        if (button[3].getText() == button[4].getText()) {
            if (button[4].getText() == button[5].getText()) {
                return button[3].getText();
            }
        }
        if (button[6].getText() == button[7].getText()) {
            if (button[7].getText() == button[8].getText()) {
                return button[7].getText();
            }
        }

        // vertical
        if (button[0].getText() == button[3].getText()) {
            if (button[3].getText() == button[6].getText()) {
                return button[0].getText();
            }
        }
        if (button[1].getText() == button[4].getText()) {
            if (button[4].getText() == button[7].getText()) {
                return button[1].getText();
            }
        }
        if (button[2].getText() == button[5].getText()) {
            if (button[5].getText() == button[8].getText()) {
                return button[2].getText();
            }
        }

        // diagonal
        if (button[0].getText() == button[4].getText()) {
            if (button[4].getText() == button[8].getText()) {
                return button[0].getText();
            }
        }
        if (button[2].getText() == button[4].getText()) {
            if (button[4].getText() == button[6].getText()) {
                return button[2].getText();
            }
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton currentButton = (JButton)e.getSource();
        if (alternate % 2 == 0) {
            currentButton.setText("X");
        }
        else {
            currentButton.setText("O");
        }
        if (checkForWin() == "X") {
            display.setText("Winner is X");
        }
        if (checkForWin() == "O") {
            display.setText("Winner is O");
        }
        alternate ++;
    }
}

