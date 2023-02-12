import pkg.Runa;
import pkg.Swimmable;
import pkg.Walkable;

class Man {
  public String name;
  public int num;
  public int speed;
  public int x,y;
  
  // 전체를 초기화 시키고
  public Man(String name, int num, int speed, int x, int y) {
    this.name = name;
    this.num = num;
    this.speed = speed;
    this.x = x;
    this.y = y;
  }

  // 받아 넘길거 입력
  public Man(String name, int num, int speed) {
    this(name, num, speed, 0, 0);
  }

  // x, y 정보를 보낼수 있게 입력한다
  public String getLocation(){
    return "(" +x+", "+y+" )";
  }

  // name, num(나이를)을 받을수 있게 만든다
  protected void whoami(){
    System.out.println("나는 "+name+" 입니다. 나이는 " +num);
  }
}



public class Main {
  public static void main(String[] args) {
    Man gendParent = new GrandParent("할아버지", 80);
    Man parent = new parent2("아빠", 50);
    Man child = new Child("자식", 20);

    Man[] humans = {gendParent,parent,child};

    for(Man human : humans){
      System.out.println("이름 : "+human.name +", 나이: "+human.num+", 속도 : "+human.speed+", 위치 : "+human.getLocation());
    }
    System.out.println("<활동 시작>");
    for(Man human : humans){
      if(human instanceof Walkable){
        // 걸을수있는 휴먼의 인스턴스면 나는 걸갈거야
        ((Walkable)human).walk(1,1);
        System.out.println(" - - - - - ");
      }
      if(human instanceof Runa){
        // 뛸수 있는 사람
        ((Runa)human).run(2, 2);
        System.out.println(" - - - - - ");
      }
      if(human instanceof Swimmable){
        ((Swimmable)human).swim(3, -1);
        System.out.println(" - - - - - ");
      }
    }
  }
}