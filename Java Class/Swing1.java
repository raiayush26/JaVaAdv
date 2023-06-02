import javax.swing.*;
public class Swing1 {
    
    public static void main(String[] args) {
        int n1,n2,diff,sum,mul,divi,rem;
        String s1 = JOptionPane.showInputDialog("Enter the 1 value");
        n1= Integer.parseInt(s1);

        String s2 = JOptionPane.showInputDialog("Enter the 2 value");
        n2= Integer.parseInt(s2);
        sum = n1+n2;
        mul =n1*n2;
        if (n1>n2) {
            diff = n1-n2;
            divi =n1/n2;
            rem= n1%n2;

            
            JOptionPane.showMessageDialog(null, "The differnce between  of the no :- "+ diff+"\n"+ "The sum of the no:- "+ sum+"\n"+"The  divide of two nuber is:- "+ divi+"\nThe  multiply   two nuber is:- "+mul+"\n The Remaider of two funtion is "+rem);
           
        } else {
            diff = n2-n1;
            divi =n2/n1;
            rem= n2%n1;
            JOptionPane.showMessageDialog(null, "The differnce between  of the no :- "+ diff+"\n"+ "The sum of the no:- "+ sum+"\n"+"The  divide of two nuber is:- "+ divi+"\nThe  multiply   two nuber is:- "+mul+"\n The Remaider of two funtion is "+rem);
            
        }

    



    }
}
