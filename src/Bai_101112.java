import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Bai_101112 {
    public static void SumOfPrices() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        if(isPrime(n)){
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of primes from 1 to " + n + " = " + sum);
        }

    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            System.out.println("N phải lớn hơn 2");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Duyệt từ 2 đến căn bậc 2 của n. nếu n chia hết cho min i đến max i giới hạn là căn bậc 2 của n thì trả về false
            if (n % i == 0) {
                System.out.println("N không phải là số nguyên tố");
                return false;
            }
        }
        return true;
    }

    public static int findMaxN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số bất kỳ: ");
        int n = sc.nextInt();
        /* Cách 1 => không tối ưu vì phải sử dụng vòng lặp */
//        int log2n =  (int) Math.floor(Math.log(n) / Math.log(2));
//        int maxN = -1;
//        while (log2n >= 0) {
//            if (maxN == -1 && (1 << log2n) < n) {
//                maxN = 1 << log2n;
//            }
//            log2n--;
//        }
        /* Tính toán trực tiếp trên maxN và trả về */
        System.out.println((int) Math.log(n));
        int maxN = (int) Math.pow(2, (int) (Math.log(n) / Math.log(2))); /* Tuong duong log2(n) / log2(2) */
        System.out.println("Số lớn nhất của " + n + " và nhỏ hơn log2("+n+") là:" + maxN);
        return maxN;
    }

    public  static  void printTriangle(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác");
        n = sc.nextInt();
        if(n > 9){
            System.out.println("N phải nhỏ hơn 9");
            return;
        }
        for (int i = 1; i <= n; i++) {
            // Vòng lặp thứ nhất để duyệt qua chiều cao của tam giác
            for (int j = 1; j <= i; j++) {
                // Vòng lặp 2 sẽ in theo từng dong theo chiều cao của i ở vòng lặp 1 nên j <= i
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true){
            System.out.println("Menu:");
            System.out.println("1. Bai tap 10");
            System.out.println("2. Bai tap 11");
            System.out.println("2. Bai tap 12");
            choice = sc.nextInt();
            if(choice == 1){
                SumOfPrices();
            } else if (choice == 2) {
                findMaxN();
            } else if (choice == 3) {
                printTriangle();
                break;
            }
            else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
