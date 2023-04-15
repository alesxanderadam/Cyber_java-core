import java.util.Scanner;

public class Bai_89 {
    public static void bai8(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào một chuỗi bất kỳ để viết hoa chữ cái đầu: ");
            String input = sc.nextLine();
            String firstLetter = input.substring(0, 1).toUpperCase();
            String restLetters = input.substring(1).toLowerCase();
            String result = firstLetter + restLetters;
            System.out.println();
            System.out.println("Chuỗi sau khi viết hoa chữ cái đầu: " + result);
    }

    public  static  void bai9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ 1: ");
        int num1 = sc.nextInt();
        System.out.println("Nhập vào số thứ 2: ");
        int num2 = sc.nextInt();

        String num1String = Integer.toString(num1);
        String num2tring = Integer.toString(num2);

        Boolean check = false;

        if(num1 > 10 && num1 < 99 && num2 > 10 && num2 < 99){
            for (int i = 0; i < num1String.length(); i++){
                char digit =  num1String.charAt(i);
                if(num2tring.indexOf(digit) >= 0){
                    check = true;
                    break;
                }
            }
        }
        System.out.println(check);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Bai tap 8");
            System.out.println("2. Bai tap 9");
            System.out.println("3. Thoat chuong trinh");
            System.out.println("Chạy bài số: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                bai8();
            }else if (choice == 2) {
                bai9();
            }
             else if (choice == 3) {
                System.out.println("Ket thuc chuong trinh.");
                break;
            } else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
