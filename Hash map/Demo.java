import java.util.*;

public class Demo{


public static void main(String[] args) {
  HashMap <String, Integer> map = new HashMap<>();   
//   Insertion
 map.put("India",120);
 map.put("Paskistan",30);
 map.put("Sri lanka",20);
 System.out.println(map);
 
 map.put("India",150);
//  System.out.println(map);
/*Search */
 if(map.containsKey("China")){
    System.out.println("key is present in map");
 }
 else{
    System.out.println("key is not present in map");
 }
//   geeting the value of each data
 System.out.println(map.get("china"));
 System.out.println(map.get("India"));

//  Iteration of each data in map function 
for (Map.Entry<String, Integer> e: map.entrySet()){
    System.out.print(e.getKey()+"->");
    System.out.print(e.getValue());
    System.out.println();
}
Set<String> keys =map.keySet();
for(String key : keys){
    System.out.println(key+ " "+map.get(key));

}
map.remove("Paskistan");
map.isEmpty();
System.out.println(map);
//  Checking the the map function is empty or  not
System.out.println(map.isEmpty());
System.out.println(map.size());

}
}