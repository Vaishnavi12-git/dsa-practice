import java.util.Arrays;
class RepeatAndMissingNum {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n*n + 1];
        int repeatNum = 0;
        int missingNum = -1;

// Count Frequency 
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                freq[grid[i][j]]++;

                if(freq[grid[i][j]] == 2) {
                    repeatNum = freq[grid[i][j]];
                }
            }
        }

// Find missing number 
        for(int i=1; i<freq.length; i++) {
            if(freq[i] == 0) {
                missingNum = i;
                break;
            }
        }

        int[] ans = {repeatNum, missingNum};

        return ans;
    }

    public static void main(String args[]){
        int[][] grid = {{1,3},{2,2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }
}