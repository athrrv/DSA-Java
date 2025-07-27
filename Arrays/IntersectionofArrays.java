package Arrays;

import java.util.ArrayList;

public class IntersectionofArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        int[] arr2 = {1,2,4,5,5,6,7};

        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < arr.length && j < arr2.length){
            if(arr[i] < arr2[j]){
                i++;
            }
            else if(arr[i] > arr2[j]){
                j++;
            }
            else{
                list.add(arr[i]);
                i++;
                j++;
            }
        }
        System.out.println(list.toString());
    }
}
