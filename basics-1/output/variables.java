package output;
public class variables {
    public static void main(String[] args) {
        int x =10;
        int y =15;


        //sum
        int sum = x+y;
        System.out.println("sum of x and y:" + sum);


        //product


        int product = x*y;
        System.out.println("product of x and y:" + product);


        //division

        
        int division = x/y;
        int division2 = y/x;
        System.out.println("x/y : "+ division + " y/x : " + division2);


        //modulus

        
        int modulus1 = x%y;
        int modulus2 = y%x;
        System.out.println("x%y : " + modulus1 + " y%x : " + modulus2);


        //bodmas

        
        int result = (x*y)/(x+y);
        System.out.println("result is:" + result);
    }
}
