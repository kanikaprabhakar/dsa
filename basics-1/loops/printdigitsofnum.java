package loops;

import java.util.Scanner;

public class printdigitsofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        //to count digits
        int count =0;
        while(num>0){
            num = num/10;
            count++;
        }
        
        while(n>0){
            int r = num/1000;
            System.out.println(r);
            n = n/10;
        }
        sc.close();
    }
}
