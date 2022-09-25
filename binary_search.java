//if the array is sorted in ascending order//

public class binary_search {
    public static void main(String[] args) {

        int a[] = {-89, -90, 2, 4, 6, 8, 10, 12, 65, 78};
        int t = 2;
        int ans = Binarysearch(a, t);
        if(ans==-1){
            System.out.println("The element is not present in the array");
        }
        else{
            System.out.println("The element is present at "+ans+" index and "+(ans+1)+" position");
        }
    }
 public static int Binarysearch(int[] arr,int target){
    int start = 0;
    int end = arr.length - 1;

    while(start<=end){
        int mid = start + (end-start)/2;
        if(target<arr[mid]){
        end = mid - 1;
    }
        else if(target>arr[mid]){
            start = mid + 1;
        }
        else{
            return mid;
        }
    }
  return -1;
}


}