class Findgcd{
    static int  gcd(int a, int b){
        if(b==0){
            return a;
        }        
        return gcd(b,a%b);
        
    }
    public static void main(String[] args) {
        // int a= 2;
        // int b=10;
        int nums[]= {2,5,6,9,10};
         int smallest =Integer.MAX_VALUE;
         int largest = Integer.MIN_VALUE;
        for(int i= 0;i<nums.length;i++ ){
            smallest=Math.min(nums[i],smallest);
            largest= Math.max(nums[i],largest);

        }
    System.out.println(gcd(smallest, largest));
    }
}