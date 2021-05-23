import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
  public void demoLoop() {
    System.out.println("While, Scan input from console");
    for (int i = 0; i < 10; i++) {
      System.out.println("i = " + i);
    }
    int k = 0;
    while (k < 10) {
      System.out.println("k = " + k);
      k++;
    }
  }

  public void getName() {
    Scanner input = new Scanner(System.in);   
    while (true) {
      System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
      String name = input.nextLine();
      if (name.equals("q")) {
        break; //thoát ra khỏi vòng lặp while
      } else if (name.length() < 3) {
        continue; //Tiếp tục vòng lặp, bỏ qua lệnh tiếp theo
      } else {
        System.out.println("Tên của bạn thật là đẹp " + name);
      }      
    }
    input.close();
  }

  public void guessName() {
    ArrayList<String> manNames = new ArrayList<>();

    manNames.add("Cường");
    manNames.add("Dũng");
    manNames.add("Thắng");
    manNames.add("Kiên");
    manNames.add("Long");
    manNames.add("Trung");
    manNames.add("Thành");
    manNames.add("Quân");

    List<String> womanNames = List.of("Hoa", "Lan", "Hương", "Hằng", "Thuỷ", "Dung", "Hiền", "Khuê", "Trinh");
    List<String> neutralNames = List.of("Bình", "Thanh", "Linh");


    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
      String name = input.nextLine();
      if (name.equals("q")) {
        break;
      } else {
        //Kiểm tra nếu tên nằm trong danh sách tên của Nam 
        for (String s : manNames) {
          if (s.equals(name)) {
            System.out.println("Nam giới");
            break;
          }
        }
        //Kiểm tra nếu tên nằm trong danh sách tên của Nữ
        for (String s : womanNames){
          if (s.equals(name)) {
            System.out.println("Nữ giới");
            break;
          }
        }

        //Kiểm tra nếu tên nằm trong danh sách tên không rõ Nam hay Nữ
        for (String s : neutralNames){
          if (s.equals(name)) {
            System.out.println("Giới tính của bạn là gì?");
            String gender = input.nextLine();
            System.out.println(name + " có giới tính là " + gender);
            break;
          }
        }
      }      
    }
    input.close();
  }

  public void guessNumber() {
    Random r = new Random();
    int number = r.nextInt(100);

    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("Hãy đoán số hoặc gõ 'q' để thoát");
      String str = input.nextLine();
      if (str.equals("q")) {
        break;
      } else {
        int guessNumber = Integer.parseInt(str);
        if (guessNumber > number){
          System.out.println("Số bạn nhập vào lớn hơn");
        } else if (guessNumber < number) {
          System.out.println("Số bạn nhập vào nhỏ hơn");
        } else {
          System.out.println("Bạn đã đoán đúng số " + number);
        }
      }
    }
    input.close();
  }
  // Game đoán số
      public void guessNumber() {
        Random r = new Random();
        int number = r.nextInt(100);
    
        Scanner input = new Scanner(System.in);
        while (true) {
          System.out.println("Hãy đoán số hoặc gõ 'q' để thoát");
          String str = input.nextLine();
          if (str.equals("q")) {
            break;
          } else {
            int guessNumber = Integer.parseInt(str);
            if (guessNumber > number){
              System.out.println("Số bạn nhập vào lớn hơn");
            } else if (guessNumber < number) {
              System.out.println("Số bạn nhập vào nhỏ hơn");
            } else {
              System.out.println("Bạn đã đoán đúng số " + number);
            }
          }
        }
        input.close();
      }

      // Kiểm tra sức khỏe
      public void guessBMI(){
        Scanner input = new Scanner(System.in);
        while (true) {
          System.out.println("Nhập chiều cao của bạn hoặc nhấn q để thoát :");
          float height = input.nextLine();
          System.out.println("Nhập cân nặng của bạn :");
          float weight = input.nextLine();
          float BMI = weight / (height * height);
          if (height == q){
            break;
          }else{
            if( BMI < 18.5){
              System.out.println("Bạn đang nhẹ cân ,cần ăn uống khoa học hơn .");
            }else if( BMI > 18.5 && BMI < 24.9){
              System.out.println("Bạn đang có thân hình chuẩn , cố giữu nhé .");
            }else if ( BMI > 24.9 && BMI < 29.9){
              System.out.println("Bạn đang thừa cân ,cần ăn uống khoa học hơn .");
            }else if ( BMI > 29.9){
              System.out.println("Bạn đang quá béo ,hãy ăn ít lại và tập thể dục .");
            }

          }
        }
        input.close();
      }

      //Kiểm tra email của người dùng nhập vào
      public void checkemail(){
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";// cấu trúc 1 email thông thường
        while (true) {
          Scanner input = new Scanner(System.in);
          System.out.println("Mời bạn nhập email hoặc x để thoát :");
          String email = input.nextLine();
          if( email.equals("x") ){
            break;
          }else if(Patter.matches(EMAIL_PATTERN , email) == true ){
            System.out.println(" email chuẩn .");
            break;
          }else{
            System.out.println(" email sai định dạng .");
            break;
          }
        }
        input.close();
      }

      // Nhập vào một số nguyên dương < 100, hãy in ra chuỗi các số nguyên tố. Số nguyên tố là số chỉ chia hết cho 1 và chính nó.
      public void soNguyenTo(){
        boolean soNguyenTo = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Số bạn muốn nhập là :");
        int a = input.nextInt();
        // 1 2 là số nguyên tố mặc nhiên ta ko cần xét 
        System.out.println("1 2")
        // bắt đàu xét từ 3
        for( i = 3 ; i < a ; i++){
          soNguyenTo = true;
          for( j = 2 ; j < i ; j++){
            if( i % j == 0 )
            soNguyenTo = false;
          }
          if( soNguyenTo == true)
            System.out.println( i + "");
        }
        
      }
}
