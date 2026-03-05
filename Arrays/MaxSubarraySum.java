class MaxSubarraySum {

    public static int MaxSubArray(int nums[]) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            currSum += nums[i];

            if(currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubArray(nums));
    }
}