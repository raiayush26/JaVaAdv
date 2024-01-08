public class AddInFirst {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length + 1];

    
        System.arraycopy(arr, 0, newArr, 1, arr.length);

        // Add -1 at the beginning (0 index) of the new array
        newArr[0] = -1;

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
