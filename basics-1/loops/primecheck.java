package loops;

import java.util.Scanner;

public class primecheck {

    static boolean isprime(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while (t>0){
        int n = sc.nextInt();
        boolean b = isprime(n);
        if(b){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        t--;
    }
    sc.close();
}
}
