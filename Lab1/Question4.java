import java.util.Scanner;

public class Question4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[]a = new int[n];
        int SumEven = 0;
        
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            if(a[i]%2==0) {
                SumEven+=a[i];
            }
        }
        System.out.println(SumEven);
    }
}
