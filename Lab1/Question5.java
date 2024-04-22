import java.util.ArrayList;
import java.util.Scanner;


public class Question5 {
    private int n;
    
    public Question5() {
        
    }
    
    public Question5(int n) {
        this.n = n;
    }
    
    public boolean firstEle() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            arr.add(a[i]);
        }
        sc.close();
        
        if(arr.isEmpty()) {
            return false;
        }
        else {
            arr.remove(0);
            System.out.println(arr);
            return true;
        }
    }
}
        