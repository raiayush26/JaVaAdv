public class IsPrime {
    public static boolean Prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                   return false;
                }
            }
           return true;
    }
    public static void main(String[] args) {
        int n=10;
        int count =0;
        for(int i=2;i<=n;i++){
            if(Prime(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
