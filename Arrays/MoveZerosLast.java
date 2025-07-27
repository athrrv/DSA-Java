package Arrays;

import java.util.*;

public class MoveZerosLast{
    
    public static void main(String[] args) {
        int[] nums = {1,2,0,3,4,5,0,0,6,7};
        int n = nums.length;
        
        int j= -1;

        for(int i=0; i<n; i++){
            if (nums[i] == 0) {
                j=i;
                break;
            }
        }
        int temp = 0;
        for (int i = j+1; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;                
            }            
        }
        
        System.out.println(Arrays.toString(nums));
    }
    
}
