package Draw;

import java.awt.*;

public class Line extends Figure {

    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }
}
