// Find the number of way in which you can invite n people  to your party single or in pair
public class Recu13 {
     public static int callGuest(int n){
        if (n<=1){
            return 1;
        }
        // single
        int way1 = callGuest(n-1);
        // pair ways 
        int way2 = (n-1) * callGuest(n-2);
        return way1+ way2;
     }
    public static void main(String[] args) {
        int n= 4;
        System.out.print(callGuest(n));
    }
}
