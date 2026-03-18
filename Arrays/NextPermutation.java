class NextPermutation {
     public static void swap(int[] nums, int index, int i ) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
     }

    public static int[] nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        for(int i=n-1; i>index; i--) {
            if(nums[i] > nums[index]){
                swap(nums, index, i);
            }
        }

        int start = index+1;
        int end = n-1;
        while(start < end) {
            swap(nums, start, end);
        }
        return nums;
    }

     public static void main(String args[]) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        for(int num : nums){
            System.out.print(num);
        }
     }
}