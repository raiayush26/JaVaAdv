public class Trapping {
    public static int trap(int height[]){
        int l =height.length;

        int leftMax[] = new int[l];
        
        leftMax[0]=height[0];
        // left maximax
        for(int i =1;i<l;i++){
            leftMax[i]=Math.max(height[i],height[i-1]);
        }
        int rightMax[] =new int [l];
        rightMax[l-1]=height[l-1];
        
        for(int i =l-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater =0;
        for(int i= 0;i<l;i++){
            int waterL = Math.min(leftMax[i],rightMax[i]);
            trappedWater+= waterL-height[i];
        }
        return trappedWater;
        
    }
    
    public static void main(String[] args) {
        int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
    }
}
