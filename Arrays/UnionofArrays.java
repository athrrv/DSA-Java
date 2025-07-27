package Arrays;
import java.util.*;

public class UnionofArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        int[] arr2 = {1,3,4,5,6,7};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);    
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set.toString());
    }    
}