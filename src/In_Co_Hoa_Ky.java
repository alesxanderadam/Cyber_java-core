public class In_Co_Hoa_Ky {
    public static void main(String[] args) {
        int height = 15;
        int width = 25;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < width; j++) {
                if (j < 10) {
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < height - 9; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("= ");
            }
            System.out.println();
        }
    }
}
