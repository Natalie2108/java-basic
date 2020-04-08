package Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Draw extends JFrame implements MouseListener {
    private void createMenuBar() {
        var menuBar = new JMenuBar();
        var exitIcon = new ImageIcon("src/resources/exit.png");

        var fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        var eMenuItem = new JMenuItem("Exit", exitIcon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(eMenuItem);

        var figureMenu = new JMenu("Figure");
        figureMenu.setMnemonic(KeyEvent.VK_F1);

        var menuRect = new JMenuItem("Rectangle");
        menuRect.setMnemonic(KeyEvent.VK_R);
        menuRect.setToolTipText("Draw a Rectangle");
        menuRect.addActionListener((event) -> figure = new Rectangle());

        var menuOval = new JMenuItem("Oval");
        menuOval.setMnemonic(KeyEvent.VK_O);
        menuOval.setToolTipText("Draw an Oval");
        menuOval.addActionListener((event) -> figure = new Oval());

        var menuLine = new JMenuItem("Line");
        menuLine.setMnemonic(KeyEvent.VK_L);
        menuLine.setToolTipText("Draw a Line");
        menuLine.addActionListener((event) -> figure = new Line());

        var menuTri = new JMenuItem("Triangle");
        menuTri.setMnemonic(KeyEvent.VK_T);
        menuTri.setToolTipText("Draw a Triangle");
        menuTri.addActionListener((event) -> figure = new Triangle());

        figureMenu.add(menuRect);
        figureMenu.add(menuOval);
        figureMenu.add(menuLine);
        figureMenu.add(menuTri);

        menuBar.add(fileMenu);
        menuBar.add(figureMenu);
        
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setSize(500, 500);
        draw.createMenuBar();
        draw.setVisible(true);
        draw.setDefaultCloseOperation(EXIT_ON_CLOSE);



    }

    Figure figure = new Rectangle();
    List<Figure> figures = new ArrayList<>();


    public Draw() throws HeadlessException {
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figure f : figures)
        f.draw(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
        //figure = new Rectangle();
        figure.x1 = e.getX();
        figure.y1 = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
        figure.x2 = e.getX();
        figure.y2 = e.getY();
        figures.add(figure);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
