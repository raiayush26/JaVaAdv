public class MaxSegmentTree {
    static int tree[];

    public static void init(int n){
        tree = new int[8*n];
    }
    public static  void buildST(int arr[] ,int sti, int start,int end){
        if (start==end){
            tree[sti] = arr[start];
            return;
        }
        int mid = start+(end-start)/2;
        buildST(arr, 2*sti+1, start, mid);
        buildST(arr, 2*sti+2, mid+1, end);
        tree [sti] =Math.max(tree[2*sti+1], tree[2*sti+2]);
    }
    public static void main(String[] args) {
        int arr[]= {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(tree[i]+" ");
        }
    }
}
