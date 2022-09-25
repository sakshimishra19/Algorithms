public class Orderagnoisticbinarysearch {
    public static void main(String[] args) {
        int a[] = {-89, -90, 2, 4, 6, 8, 10, 12, 65, 78};
        int t = 2;
        int ans = orderagnosticBS(a, t);
        if(ans==-1){
            System.out.println("The element is not present in the array");
        }
        else{
            System.out.println("The element is present at "+ans+" index and "+(ans+1)+" position");
        }
    }

    public static int orderagnosticBS(int [] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            //check whether the array is in ascending or descending//
            boolean isAcs = (arr[start]<arr[end]);
            if(isAcs){
                if(target<arr[mid]){
                    end = mid - 1;
                }
                else if(target>arr[mid]){
                    start = mid + 1;
                }
                else{
                    if(target>arr[mid]){
                        end = mid - 1;
                    }
                    else if(target<arr[mid]){
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
