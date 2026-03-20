import java.util.*;
class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        List<int[]> result = new ArrayList();
        int[] current = intervals[0];

        for(int i=1; i<intervals.length; i++){
            if(current[1] < intervals[i][0]) {
                result.add(current);
                current = intervals[i];
            }else {
                current[1] = Math.max(current[1], intervals[i][1]);
            }
        }
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String args[]) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }
}