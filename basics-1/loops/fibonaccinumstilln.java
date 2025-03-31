package loops;
import java.util.Scanner;
public class fibonaccinumstilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a = 0,b=1,c=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        while(n>3){
            
            a = b;
            b=c;
            c = a+b;
            System.out.println(c);
            n--;
        }
        sc.close();
    }
}
