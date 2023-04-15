import java.util.ArrayList;
import java.util.Scanner;

public class Bai2021 {
    public static void Bai20(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("\nNhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
            System.out.println(n);
        } while (n < 0);

        int array[] = new int[n];

        System.out.println("\nNhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int[] evenNumbers = new int[array.length];
        int[] oddNumbers = new int[array.length];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers[evenIndex] = array[i];
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = array[i];
                oddIndex++;
            }
        }

        System.out.print("Số chẵn: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Số lẻ: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Bài 20");
        System.out.println("2. Bài 21");
        choice = sc.nextInt();
        while (true){
            if(choice == 1){
                Bai20();
            } else if (choice == 2) {
//                Bai21();
                //Chưa thể tự mình hoàn thành
            }
            else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
