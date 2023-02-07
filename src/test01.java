import java.util.ArrayList;
import java.util.Scanner;

class Studen {
  private String name2;
  private String on2;

  public Studen(String name2, String on2){
    this.name2 = name2;
    this.on2 = on2;
  }

  public String getName2(){
    return name2;
  }
  public void getName2(String name2){
    this.name2 = name2;
  }
  public String getOn2(){
    return on2;
  }
  public void getOn2(String on2){
    this.on2 = on2;
  }
}

public class test01 {
  public static void main(String[] args) {
    Studen studen1 = new Studen("손오공", "1111");
    Studen studen2 = new Studen("저팔계", "2222");
    Studen studen3 = new Studen("사오정", "3333");

    // 어레이 리스트만들기
    ArrayList <Studen>list = new ArrayList<Studen>();
    // list에 추가하기
    list.add(studen1);
    list.add(studen2);
    list.add(studen3);

    // 추가한 list 불러오기
    for(Studen stu : list) {
      System.out.println(stu.getName2());
      System.out.println(stu.getOn2());
    }

    // 유저가 입력할수 있게 스캐너
    Scanner scan = new Scanner(System.in);

    // 1. 먼저 반복할거냐 종료할거냐를 만들어야함
    while (true){
      System.out.println("계속 검색을 하겠습니까? 'y' or 'n'");
      String yourInput = scan.next();

      if(yourInput.equals("y")){
        System.out.println("검색을 입력하세요.");
        String name = scan.next();
        boolean flag = false;

        for(Studen stu : list) {
          if(stu.getName2().equals(name)) {
            System.out.println("학생의 학번은?" +stu.getOn2());
            flag = true;
          }
        }
        if(!flag){
          System.out.println("없는 학생입니다.");
        }
        
      } else if(yourInput.equals("n")){
        break;
      }
    }
    System.out.println("종료 되었습니다.");
  }
}
