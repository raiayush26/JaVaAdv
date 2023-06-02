// import java.io.*;
// import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args)  {
       int a=5;
      Solution  sol = new Solution();
    //    sol.printStarpattern(a);
       sol.Floyds_tringle(a);
    //    sol.printTriang(a);
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
      for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void printNumber(int n) {
      for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void printStarpattern(int n) {
      for(int i=1; i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void  Floyds_tringle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}