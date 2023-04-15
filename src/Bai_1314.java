import java.util.*;

public class Bai_1314 {

    public  static void bai13(){
        int n;
        Scanner scanner = new Scanner(System.in);

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

        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        float diemTrungBinh = 0;
        for (int i = 0; i < n; i++) {
            diemTrungBinh += array[i];
        }
        diemTrungBinh /= n;
        System.out.println("Gía trị trung bình là : " + diemTrungBinh);

        int max = array[0], min = array[0];
        for (int i = 1; i < n; i += 2) {
            if (i == n - 1) {
                min = Math.min(min, array[i]);
                max = Math.max(max, array[i]);
            } else {
                if (array[i] < array[i + 1]) {
                    min = Math.min(min, array[i]);
                    max = Math.max(max, array[i + 1]);
                } else {
                    min = Math.min(min, array[i + 1]);
                    max = Math.max(max, array[i]);
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max + "\n");
        System.out.println("Phần tử nhỏ nhất là: " + min + "\n");

        ArrayList<Integer> mangChan = new ArrayList<>();
        ArrayList<Integer> mangLe = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                mangChan.add(array[i]);
            } else {
                mangLe.add(array[i]);
            }
        }

        System.out.println("Số chẵn trong mảng là: " + mangChan);
        System.out.println("Số lẻ trong mảng là: " + mangLe);

        // Khởi tạo một ArrayList mới và sao chép tất cả các phần tử từ ArrayList cũ sang ArrayList mới
        List<Integer> newList = new ArrayList<>();

        for(int i=0;i < n;i++){
            newList.add(array[i]);
        }

        System.out.println("Nhập vào vị trí muốn thêm");
        int index = scanner.nextInt();

        System.out.println("Nhập vào giá trị muốn thêm");
        int newValue = scanner.nextInt();

        newList.add(index, newValue);
        System.out.println("Mảng được thêm là: " + newList + "\n");

        System.out.println("Nhập vào phần tử muốn xóa");
        int indexRemove = scanner.nextInt();

        newList.remove(indexRemove);
        System.out.println("Mảng đã xóa là: " + newList + "\n");
    }

    public static void bai14(){
        Scanner scanner = new Scanner(System.in);
        // Nhập vào số phần tử của mảng
        System.out.print("Nhập vào số phần tử của mảng: ");
        int m = scanner.nextInt();

        // Khởi tạo một HashSet để lưu trữ các giá trị của mảng
        Set<Integer> set = new HashSet<>();

        // Nhập giá trị cho mảng và thêm vào HashSet
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int value = scanner.nextInt();
            set.add(value);
        }

        // Khởi tạo một mảng mới với độ dài bằng kích thước của HashSet
        int[] newArray = new int[set.size()];

        // Chuyển các giá trị từ HashSet sang mảng mới
        int index2 = 0;
        for (int value : set) {
            newArray[index2++] = value;
        }

        // In ra mảng mới
        System.out.println("Mảng mới sau khi loại bỏ các phần tử trùng lặp:");
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Bai tap 13");
        System.out.println("2. Bai tap 14");
        choice = sc.nextInt();
        while (true){
            if(choice == 1){
                bai13();
            } else if (choice == 2) {
                bai14();
                break;
            }
            else {
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }

    }
}
