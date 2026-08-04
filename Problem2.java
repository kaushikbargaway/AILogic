import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long k = sc.nextLong();

        int maxLength = 0;
        int bestStart = 1; 

        for (int i = 0; i < n; i++) {
            long currentMin = arr[i];
            long currentMax = arr[i];


            for (int j = i; j < n; j++) {
                currentMin = Math.min(currentMin, arr[j]);
                currentMax = Math.max(currentMax, arr[j]);

                if (currentMax - currentMin <= k) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        bestStart = i + 1;
                    }
                } else {
                   
                  break;
                }
            }
        }

        System.out.println(maxLength + " " + bestStart);
    }
}