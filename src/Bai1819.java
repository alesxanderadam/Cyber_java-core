import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai1819 {
    public static void Bai18(){
        Scanner sc = new Scanner(System.in);
        double interestRate = 0.05;

        System.out.println("Chào mừng đến với ngân hàng siêu uy tín");
        System.out.println("Bạn hãy nhập số tiền muốn gửi: ");
        double money = sc.nextDouble();

        double xe_hoi = 20000, nha = 50000;
        System.out.println("Mời bạn chọn thứ muốn mua");
        System.out.println("1. Xe hơi. Giá: " + xe_hoi + "USD");
        System.out.println("2. Nhà. Giá: " + nha + "USD");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                double t = (Math.log(xe_hoi/money))/(Math.log(Math.E)*interestRate);
                System.out.printf("Số năm ít nhất mà anh X phải chờ đợi là: %.2f \n", t);
                break;
            case 2:
                double result = (Math.log(nha/money))/(Math.log(Math.E)*interestRate);
                System.out.printf("Số năm ít nhất mà anh X phải chờ đợi là: %.2f \n", result);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    public static void Bai19(){

        DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
        Scanner scanner = new Scanner(System.in);

        int aNumber, bNumber;
        System.out.println("Nhập vào số a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        bNumber = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double nghiem = (double) -bNumber / aNumber;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }


    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Bai tap 18");
        System.out.println("2. Bai tap 19");
        choice = scanner.nextInt();
        while (true){
            if(choice == 1){
                Bai18();
            } else if (choice == 2) {
                Bai19();
            }
            else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
