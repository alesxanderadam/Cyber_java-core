import java.util.Scanner;

public class Bai_4567 {
    public static void bai4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num = sc.nextInt();
        int sum = 0;

        /* Cách 1 */
//        while (num > 0) {
//            sum += num % 10;
//            System.out.println(num);
//            num /= 10;
//        }

        /* Cách 2 */
        String numberString = Integer.toString(num);

        for(int i = 0; i < numberString.length(); i++){
            int digit = Character.getNumericValue(numberString.charAt(i));
            sum += digit;
        }
        System.out.println("Tổng của " + num + " là: " + sum);
    }

    public static void bai5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tọa độ điểm A (x1,y1): ");
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        System.out.print("Nhập tọa độ điểm B (x2,y2): ");
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        float length = (float) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); //  (float): ép kiểu Math.sqrt cho phép toán căn bậc 2
        System.out.println("Độ dài đoạn thẳng AB là: " + length);
    }
    public static void bai6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String s = scanner.nextLine();
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }
        System.out.println("Chuỗi đảo ngược là: " + reverse);
    }
    public static void bai7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số tự nhiên: ");
        int num = sc.nextInt();
        System.out.println("Ứoc số của " + num + ':');
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("------------------------------");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Bai tap 4");
            System.out.println("2. Bai tap 5");
            System.out.println("3. Bai tap 6");
            System.out.println("4. Bai tap 7");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("Chạy bài số: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                bai4();
            } else if (choice == 2) {
                bai5();
            } else if (choice == 3) {
                bai6();
            } else if (choice == 4) {
                bai7();
            } else if (choice == 5) {
                System.out.println("Ket thuc chuong trinh.");
                break;
            } else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}