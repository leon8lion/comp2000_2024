import javax.swing.*;
import java.awt.*;

public class Cell {

    int x;
    int y;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, 35, 35);
    }
}

