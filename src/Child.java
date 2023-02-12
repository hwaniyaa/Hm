import pkg.Runa;
import pkg.Swimmable;
import pkg.Walkable;

public class Child extends Man implements  Walkable, Runa, Swimmable {
  public Child(String name, int num){
    super(name, num, 5);
  }
  @Override
  public void walk(int x, int y){
    whoami();
    System.out.println("스피드는 : "+ (speed + 2));
    this.x = x;
    this.y = y;
    System.out.println("달리는 위치 : "+getLocation());
  }
  @Override
  public void run(int x, int y){
    whoami();
    System.out.println("걷는 속도 : "+ speed);
    this.x = x;
    this.y = y;
    System.out.println("걷는 위치 : "+getLocation());
  }
  @Override
  public void swim(int x, int y){
    whoami();
    System.out.println("수영 속도 : "+ (speed + 1));
    this.x = x;
    this.y = y;
    System.out.println("수영 위치 : "+getLocation());
  }
}
