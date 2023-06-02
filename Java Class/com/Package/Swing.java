package com.Package;
import javax.swing.*;
 
public class Swing {
 static JOptionPane jp;
 
 public static void main(String [] args) {
	 int a,b;
	int sum;
	 String  s= jp.showInputDialog("input no");
	 String s2 = jp.showInputDialog("hjfd");
	 b = Integer.parseInt(s);
	 a = Integer.parseInt(s2);
		sum = a + b;
		JOptionPane.showMessageDialog(null, "The sum of 2 values entered = "+sum);
 }
	
}
