// FIND LARGEST ELEMENT IN ARRAY

package codingjourneystart;
import java.util.*;
public class Ch14ARRAYS07 {
    public static int getLargest(int []nums){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++){
            if(largest<nums[i])
                largest=nums[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int []nums = {1,2,7,3,4,6,};
        // fun call
        System.out.println("Largest number in nums array is: " + getLargest(nums));
    }
}
