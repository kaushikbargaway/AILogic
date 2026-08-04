import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + n];
        for (int i = 0; i < n * 2; i++) {
            
            arr[i] = sc.nextInt();
            
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                list.add(arr[j + 1]);
            }
            
        }
        list.add(arr[arr.length - 1]);
        for (int k = 0; k < list.size() - 2; k += 2) {
            System.out.println(list.get(k) + " " + list.get(k + 1));
        }
        
    }
}