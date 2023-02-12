import java.security.PublicKey;

import pkg.Walkable;

public class GrandParent extends Man implements Walkable {

  public GrandParent(String name, int num) {
    super(name, num, 1);
  }
  
  @Override
  public void walk(int x, int y){
    whoami();
    System.out.println("걷는 속도 : "+ speed);
    this.x = x;
    this.y = y;
    System.out.println("걷는 위치 : "+getLocation());
  }
}
