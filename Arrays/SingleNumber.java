class SingleNumber {

    public static int singleNumber(int[] nums) {
        int xorResult = 0;

        for(int num : nums) {
            xorResult ^= num;
        }
        return xorResult;
    }

    public static void main(String[] agrs) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
        
    }
}