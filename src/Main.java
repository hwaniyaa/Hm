import java.util.ArrayList;
import java.util.Scanner;

class Student {
  private String name;
  private String on;


  // 생성자를 받고 초기화
  public Student(String name, String on) {
    super();
    this.name = name;
    this.on = on;
  }

  // 갯터
  public String setName() {
    return name;
  }
  // 셋터
  public void setName(String name) {
    this.name = name;
  }
   // 갯터
  public String setOn() {
    return on;
  }
  // 셋터
  public void setOn(String on) {
    this.on = on;
  }


}

public class Main {
  public static void main(String[] args) {
    Student Student1 = new Student("손호공", "1992");
    Student Student2 = new Student("저팔계", "1993");
    Student Student3 = new Student("사오정", "1994");

    // 어레이 리스트 사용방법
    ArrayList <Student>list = new ArrayList<Student>();
    list.add(Student1);
    list.add(Student2);
    list.add(Student3);

    // forEach문으로 출력
    for(Student stu : list){
      System.out.println(stu.setName());
      System.out.println(stu.setOn());
    }

    // 유자가 입력할수 있게 스케너생성
    Scanner scan = new Scanner(System.in);
    
    // 유자가 입력할수 있게 보냄
    while (true) {
      System.out.println("게속 검색을 하고싶으시면 y, 종료하고 싶으면 n");
      String input = scan.next();

      if(input.equals("y")) {
        System.out.println("검색을 시작합니다.");

        // 학생의 이름을 찾기
        String name = scan.next();
        boolean flag = false;

        for (Student stu : list) {
          // 문자열에 value를 비교하고싶으면 equals
          if(stu.setName().equals(name)) {
            System.out.println("해당하는 학생의 학번은: "+stu.setName());
            flag = true;
          }
        }

        if(!flag) {
          System.out.println("해당하는 학생이름이 없습니다.");
        }

      } else if(input.equals("n")) {
        break;
      }
      
    }
    
    System.out.println("프로그램이 종료되었습니다.");
    scan.close();
  }
  
}
