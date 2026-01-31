import java.util.*;
import java.util.Arrays;

class MajorityElement {

// Brute Force approach 
// Count frequency of each element using nested loops
// If the frequency of any element > n/2 then return the element 
// Time complexity is O(n^2) 
// Space complexity is O(1)

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

    // Optimize approach
    // Sort the given array
    // With the help of loop track the frequency of an element
    // If the frequency is > n/2, return the element
    // Time complexity is O(nlogn)
    // Space complexity is O(1)

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

// Moore's voting algorithm
// Simply run a for loop on given array
// If the current number is equal to the variable answer increase the frequency else decrease the frequency
// Time complexity is O(n)
//  // Space complexity is O(1)

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