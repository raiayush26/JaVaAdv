// Place Tiles of size 1xm in a floor of size nXm
public class Recu12{
     public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // Place verticaly
        int verPlacement = placeTiles(n-m, m);
         // Place horizonalt
        int horPlacement  = placeTiles(n-1, m);
        return verPlacement+ horPlacement;
     }
     public static void main(String[] args) {
        int n =4 ,m=2;
        System.out.println( placeTiles(n, m));
     }
}