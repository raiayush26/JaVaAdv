public  class Recu{
    public static int printSum(int i,int n ,int sum){
       if (i==n){
        sum += i;
        
        return sum ; 
       }
       sum += i ;
       return printSum(i+1,n ,sum);
    }

     public static void main (String[] agrs){
         int n=5 ;
         
        System.out.println( printSum(1,n,0 ));
     }
}