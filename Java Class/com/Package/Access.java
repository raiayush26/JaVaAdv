package com.Package;

class A{

     void showClassD(){
        System.out.println("This is Default class");
    }
      public void showClassPu(){
         System.out.println("This is Public class");
     }

    private void showClassP(){
        System.out.println("This is private class");
    }
    protected void showClasspr(){
        System.out.println("This is private class");
    }
}
public class Access {
	 public static void main(String[] args) {
	        A newA= new A();
	       
	    
	        	 newA.showClassD();
	        	 newA.showClassPu();
	        	 
	        	    }
}
