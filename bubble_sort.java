import java.util.Arrays;
public class bubble_sort {
    public static void main(String[] args) {
        int arr[]= {10, -33, 75, 97, -900, 988};
        //function calling
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr){
       int n = arr.length;
        boolean swapped;
        int temp;
        //logic for bubble sort
        for(int i = 0;i<n;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap the elements
                    temp=arr[j] ;
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   swapped = true;
                }

            }
            //if the array is already sorted then the code should finish after 1st pass
            if(!swapped){
                break;
            }
        }
    }
}
