import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;
  ArrayList<Actor> actorList;
  public Stage() {
    grid = new Grid();
    cat = new Cat(grid.cellAtColRow(0, 0));
    dog = new Dog(grid.cellAtColRow(0, 15));
    bird = new Bird(grid.cellAtColRow(12, 9));
    actorList = new ArrayList<Actor>(){
      {
        add(cat);
        add(dog);
        add(bird);
      }
    };
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(int i = 0; i<actorList.size();i++){
      actorList.get(i).paint(g);
    }
  }
}
