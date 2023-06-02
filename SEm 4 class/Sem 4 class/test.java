public class test {
    public static void main (String [] args){
        
                    int [] list1= {20,25,21,25,26};
                    int [] list2= new int [4];
                    list2=mymethod(list1);
                    for (int i=0; i<4;i++){
                        System.out.println(list2[i]);
                    }
                                          
            }
            public static int[] mymethod(int[] crList){
                int [] result= new int[crList.length];
                for (int i=0; i<crList.length;i++){
                        result[i] = crList[i]; 
                   }
                return result;
                
            }
            
    
}
