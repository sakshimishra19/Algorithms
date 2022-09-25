import java.util.Scanner;
public class linear_search {
    public static int search(int arr[],int X){
        int N = arr.length;
        int i;
        for(i = 0;i<N;i++) {
            if (arr[i] == X) {
                return i;
            }
        }
             return -1;
    }

    public static void main(String[] args) {
      int  arr[]={34, 67, 89, 23, 45, 67,60,43,90,19 };
      int X=90;
      //Function call//
      int result = search(arr,X);
      if(result==-1){
          System.out.println("Element is not present in the array");
      }
      else{
          System.out.println("Element is present at "+ result +" index");
      }
    }
}
