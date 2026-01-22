import java.util.*;
import java.util.Arrays;

class MajorityElement {

    public static void bruteForce(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            int ans = nums[i];
            int freq = 1;

            for(int j=i+1; j<nums.length; j++) {
                if(ans == nums[j]) {
                    freq++;
                }
            }

            if(freq > nums.length/2) {
                System.out.println(ans);
            }
        }
    }

    public static void optimize(int nums[]) {
        Arrays.sort(nums);
        int freq = 1;
        
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                freq++;
            }else {
                freq = 1;
            }
            if(freq > nums.length/2) {
                   System.out.println(nums[i]);
                }
        }

    }

    public static int mooreVoting(int nums[]) {
        int freq = 0;
        int ans = nums[0];

        for(int i=0; i<nums.length; i++) {
            if(freq == 0) {
                ans = nums[i];
            }
            if(ans == nums[i]) {
                freq++;
            }else {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 2, 1, 1};
        bruteForce(nums);
        optimize(nums);
        System.out.println(mooreVoting(nums));
    }
}