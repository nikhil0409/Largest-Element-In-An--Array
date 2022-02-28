import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nik = new int[n];
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            nik[i] = sc.nextInt();
            if(nik[i] > ans)
                ans = nik[i];
        }System.out.println(ans);
    }
}
