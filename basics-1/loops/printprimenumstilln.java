package loops;

import java.util.Scanner;

public class printprimenumstilln {

    static boolean isprime(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int low,high;
        Scanner sc = new Scanner(System.in);
        low = sc.nextInt();
        high = sc.nextInt();
        for(int i=low;i<=high;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
