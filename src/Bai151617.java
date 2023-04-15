import java.util.Random;
import java.util.Scanner;

public class Bai151617 {

    public static  void  Bai16(){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn cần kiểm tra:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;
        if(year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if( year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        if(isLeap==true)
            System.out.println(year + " là năm nhuận.");
        else
            System.out.println(year + " không phải là năm nhuận.");
    }
    public static void Bai15(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // a) Độ dài của chuỗi
        int length = input.length();
        System.out.println("Độ dài của chuỗi là: " + length);

        // b) Ký tự tại vị trí nhất định
        System.out.print("Nhập vị trí muốn lấy ký tự: ");
        int index = scanner.nextInt();
        char character = input.charAt(index);
        System.out.println("Ký tự tại vị trí " + index + " là: " + character);

        // c) Kiểm tra xem có chuỗi phụ "abcdef" hay không
        boolean containsSubstring = input.contains("abcdef"); //contains kiểm tra xem chuỗi (?) có phụ thuộc ? không
        if (containsSubstring) {
            System.out.println("Chuỗi vừa nhập có chứa chuỗi phụ \"abcdef\".");
        } else {
            System.out.println("Chuỗi vừa nhập không có chứa chuỗi phụ \"abcdef\".");
        }
    }

    public static void Bai17(){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int numGuesses = 0;

        System.out.println("Đây là game mò số hehe!");
        System.out.println("Bạn hãy đoán thử từ số 1 đến số 100");
        System.out.println("Bạn đoán nó sẽ là gì? Bạn có 4 lần đoán!");

        while (guess != secretNumber && numGuesses < 4) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Hơi thấp rồi. Lại đi!.");
            } else if (guess > secretNumber) {
                System.out.println("Cao quá bạn tôi ơi. Lại nào!.");
            } else {
                System.out.println("Đoán trúng rồi! Qúa đỉnh cậu ơi.");
            }
        }

        if (numGuesses >= 4) {
            System.out.println("Xin lỗi bạn đã thua cuộc. Bạn đã đoán quá " + secretNumber);
        }


        scanner.close();
    }


    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Bai tap 15");
        System.out.println("2. Bai tap 16");
        System.out.println("3. Bai tap 17");
        choice = sc.nextInt();
        while (true){
            if(choice == 1){
                Bai15();
            } else if (choice == 2) {
                Bai16();
            } else if (choice == 3) {
                Bai17();
                break;
            }
            else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
