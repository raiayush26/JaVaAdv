import java.util.Scanner;

public class list {
    public static void main (String[] args){
            double[] yourList= new double[4];
                createList(yourList);
                displayList(yourList);                  
    }
    public static void createList(double[] crList){
        System.out.println("Enter "+crList.length +" Double");
        try (Scanner input = new Scanner(System.in)) {
            for (int i=0; i<crList.length;i++){
                crList[i]=input.nextInt();
            }
        }
    }
    public static void displayList(double[] disList){
        System.out.println("The list are as follows ");
                for (int i=0; i<disList.length;i++){
                System.out.println(disList[i]);;
                }
    }    
}
