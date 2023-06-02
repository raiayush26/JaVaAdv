public class Sudoku {
      public static boolean isSafe(int sudoku[][] ,int row ,int col ,int digit){
        // colume
        for(int i = 0; i<=8;i++){
            if(sudoku[i][col] ==digit){
                return false;
            }
            
        }
        //  For Row 
        for(int j= 0; j<=8;j++){
            if(sudoku[row][j] ==digit){
                return false;
            }
            
        }

       
        
        //grid
        int sr= (row/3) * 3;
        int sc= (col/3) * 3;
        // 3X3 grid
        for(int i= sr;i<=sr+3;i++){
            for (int j = sc; j < sc+3; j++) {
                if(sudoku[i][j] == digit){
                    return false;
                }  
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][] ,int row ,int col){
        //base case
      
        if (row==9 ){
            return true;
        }
        // recusion
        int nextrow=row ,nextcol= col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextrow, nextcol);
        }
        
        for(int digit =1; digit<=9 ; digit++){
            if(isSafe(sudoku, row ,col,digit)){
                sudoku[row][col] =digit;
                if(sudokuSolver(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col]='.';
            }
        }
        return false;
    }

  
    
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
 public static void main(String [] args){
    int sudoku[][] ={
        {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
        {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
        {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
        {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
        {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
        {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
        {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
        {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
        {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };
    if(sudokuSolver(sudoku, 0, 0)){
        System.out.println("solution  exits");
        printSudoku(sudoku);
    }else{
        System.out.println("solution doest not exits");
    }

 }
}