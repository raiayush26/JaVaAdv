import java.util.Arrays;

class Main{
    public static int eraseOverlapIntervals(int[][] intervals) {
        int n =intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
              System.out.print(intervals[i][j] + " ");
            System.out.println();
          }
        return 0;
        
    }
    public static void main (String []args){
        int a[][] =  { {1,2},{2,3},{3,4},{1,3}};
        
      eraseOverlapIntervals(a);
    }
}