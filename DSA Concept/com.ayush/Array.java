package com.ayush;

public class Array {
      private int[] items;
      private int count;
      public Array (int length){
          items= new int[length];
      } 
      public void insert(int items){
        items[count++] =items;
      }
      public void print(){
          for(int i=0; i<count; i++)
          System.out.println(items[i]);
      }
}
