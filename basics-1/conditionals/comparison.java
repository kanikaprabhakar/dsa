package conditionals;

public class comparison {
 public static void main(String[] args) {
    int n1 =10;
    int n2=20;
    if(n1==n2){
        System.out.println("equal");
    }
    else{
        if(n1>n2){
            System.out.println("n1 greater than n2");
        }
        else{
            System.out.println("n2 greater than n1");
        }
    }
    //can be done by else if 
    if(n1==n2){
        System.out.println("equal");
    }
    else if(n2>n1){
        System.out.println("n2 greater than n1");
    }
    else{
        System.out.println("n1 greater than n1");
    }
 }   
}
