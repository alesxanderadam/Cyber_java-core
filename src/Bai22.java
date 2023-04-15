import java.util.Scanner;

public class Bai22 {
    // Bài này e dùng hỗ trợ của chat gpt và chưa được tư duy trong trường hợp này
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int maxLength = 0;
        String longestPalindromicSubStr = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isPalindromic(subStr) && subStr.length() > maxLength) {
                    maxLength = subStr.length();
                    longestPalindromicSubStr = subStr;
                }
            }
        }

        System.out.println("Longest palindromic substring: " + longestPalindromicSubStr);

    }
    public static boolean isPalindromic(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
