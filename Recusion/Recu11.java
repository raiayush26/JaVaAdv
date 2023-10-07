// Count total paths in maze to moove from (0,0) to (n,m)

public class Recu11 {
    public static int countPath(int i, int j, int n, int m){
        if (i==n || j==m) {
            return 0;
        }
        if (i== n-1 && j== m-1) {
            return 1;
        }
        // move downward
        int downPath = countPath(i+1, j, n, m);
        //  move right warf

        int rightPath = countPath(i, j+1, n, m);
        return downPath + rightPath;
    }

    public static void main(String[] args) {
        int n= 3, m=3;
        int totalpath=countPath(0, 0, n, m);
        System.out.println(totalpath);
        
    }
    
}
