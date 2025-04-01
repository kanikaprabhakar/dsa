package sorting;

import java.util.Scanner;

public class bubblesort {
    static void bsort(int arr[],int n){
        //swapping only the adjacent elements : "bubbles" the largest element to its correct place
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bsort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
