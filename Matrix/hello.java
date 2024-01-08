class hello{
    public static void createMat(int n,int m){
        int [][] mat= new int[n][m];
        for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j]);
                }
        }
    }
}