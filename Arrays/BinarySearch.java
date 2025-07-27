package Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,12,34,56,78,89,99,121};
        int target = 12;
        int n =  arr.length;
    
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
    }
}