import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Grid {
    
    ArrayList<Cell> cells = new ArrayList<Cell>(710);

    public Grid(){
        
    }
    
    public void paint(Graphics g) {
        
        Cell cell=new Cell(0, 0);
        
        for(int i = 0; i<=cells.size(); i++){
            cells.get(i).paint(g);
        }
        
        for(int x = 10; x < 710; x +=35){
            for(int y=10; y<710; y+=35){
                cell.paint(g);
            } 
        }
    } 
}
