//  Search in Rotated Sorted Array 
public class Sorted {
    public static int Search( int arr[],int tar, int si,int ei){

        int mid = si +(ei-si)/2;
        // case found
        if(arr[mid]==tar){
            return mid;
        }
        // found on l1 fgbg
        if(arr[si]<= arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return Search(arr, tar, si, mid-1);
            }else{
                return Search(arr, tar, mid+1, ei);
            }
        }
        // found on line 2
        else{
            if(arr[mid]<=tar&& tar<=arr[ei]){
                return Search(arr, tar, mid+1, ei);
            }else{
              return  Search(arr, tar, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
       int target=0;
      System.out.println(  Search(arr, target, 0, arr.length-1));

    }
}
