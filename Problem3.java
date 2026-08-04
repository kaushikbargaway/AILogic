import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s1.append(sc.nextInt());
        }

        int m = sc.nextInt();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < m; i++) {
            s2.append(sc.nextInt());
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = 0;

        while (i < s1.length() || i < s2.length() || carry != 0) {
            int digit1 = (i < s1.length()) ? (s1.charAt(i) - '0') : 0;
            int digit2 = (i < s2.length()) ? (s2.charAt(i) - '0') : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
            i++;
        }

        for (int k = 0; k < result.length(); k++) {
            System.out.print(result.charAt(k) + (k == result.length() - 1 ? "" : " "));
        }
        System.out.println();
    }
}