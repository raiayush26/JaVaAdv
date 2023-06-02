// find the1 & last occurance of an element in string
public class Recu3 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str ,int inx,char element){
        if (inx== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(inx);
        if (currChar == element){
            if(first ==-1){
                first= inx;
            }else {
                last =inx;
            }
        }
        findOccurance(str, inx+1, element);
    }
    public static void main(String[] args) {
        String str ="abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
    
}
