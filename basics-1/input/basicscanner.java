package input;
import java.util.Scanner;


public class basicscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j =1;j<=n;++j){
            System.out.println(j);
        }
        sc.close();
    }
}
