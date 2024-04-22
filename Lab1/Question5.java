import java.util.ArrayList;
import java.util.Scanner;


public class Question5 {
    Scanner sc = new Scanner(System.in);
    private int n = sc.nextInt();
    
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

    public ArrayList<Integer> insertEle() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            arr.add(a[i]);
        }
        int replacePos = sc.nextInt();
        int replaceEle = sc.nextInt();
        sc.close();

        System.out.println(arr);
        arr.remove(replacePos);
        arr.add(replacePos, replaceEle);
        return arr;
    }

    public ArrayList<Integer> dupEle() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            if(arr.contains(a[i])) {
                arr1.add(a[i]);
            }
            else {
                arr.add(a[i]);
            }
        }
        sc.close();
        return arr1;
    }

    public ArrayList<Integer> removeDupEle() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            if(arr.contains(a[i])) {
                continue;
            }
            else {
                arr.add(a[i]);
            }
        }
        sc.close();
        return arr;
    }
}
        