// package com.ayush;
public class Asii{
    public static void main(String[] args)throws Exception{
        //  Conver the charther to ascci
        int i= System.in.read();// It take only one charther  at time
        System.out.println(i);
        System.out.println((char)i);
        String str="";
        while((i= System.in.read())!=48)
        {
            str = str +(char)i;
            
        }
        System.out.println(str);
        
    }
}