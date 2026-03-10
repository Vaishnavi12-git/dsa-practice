class ContainerWithMostWater {
    public static int maxArea(int height[]) {
        int left = 0;
        int right = height.length-1;
        int currWater = 0;
        int maxWater = 0;

        while(left < right) {
            int width = right - left;
            int waterHeight = Math.min(height[left], height[right]);
            currWater = width * waterHeight;
            maxWater = Math.max(currWater, maxWater);

            //The smaller height pointer will move
            if(height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}