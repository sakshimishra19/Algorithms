import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {900 , 767 , -900 ,-67 ,65,89,-98,12,-576,555};
        selection(arr);
        System.out.println("The sorted array is:-");
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int[] arr){
        int n = arr.length;
        //logic for selection sort
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    //swap the elements
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
