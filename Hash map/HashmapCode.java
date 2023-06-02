import java.util.*;
public class HashmapCode {
    static   class HashMap<K,V>{
        private class Node {
            K key;
            V value;

            public Node ( K keys, V values){
                this.key =keys; 
                this.value = values;
            }
        
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unChecked")
        public HashMap(){
           this.N =4;
           this.buckets = new Linkedlist[4];
           for (int i = 0; i < 4; i++) {
            this.buckets[i] =new LinkedList<>();

           }

        }
        private int hashFunction(K keys){ // 0 to n-1
              int bi = keys.hashCode();
             return Math.abs(bi)  %  N;

        }
        private  int searchInLL( K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                    return i; //di
                }
                
            }
             return -1;
        }
        private  void rehash(){
            LinkedList <Node> oldBuckets[]=buckets; // storing old bucket  data to old Buckets
            buckets =new LinkedList[N*2];
            for (int i = 0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBuckets.length;i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j =0 ; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }            
        }
        public void put(K keys, V values){
                int bi = hashFunction(keys);
                int di = searchInLL(keys,bi);
               if (di ==-1) { // key doest'n ot exit
                buckets[bi].add(new Node(keys,values));
                n++;
               } else{ // key does exits
                Node node = buckets[bi].get(di);
                node.value = values;
               }
                double lambda = (double)n/N;
                if (lambda>2.0) {
                    // rehaching
                    rehash();
                }
        }
         public boolean containsKey(K keys){
            int bi = hashFunction(keys);
            int di = searchInLL(keys,bi);
           if (di ==-1) { // key doest'n ot exit
            return false;
           } else{ // key does exits
            return true;
           }

         }
         public V remove(K key){
            int bi = hashFunction(key);
                int di = searchInLL(key,bi);
               if (di ==-1) { // key doest'n ot exit
                return null;
               } else{ // key does exits
                Node node = buckets[bi].remove(di);
                 return node.value;
               }
         }
         public V get(K keys){
            int bi = hashFunction(keys);
                int di = searchInLL(keys,bi);
               if (di ==-1) { // key doest'n ot exit
                return null;
               } else{ // key does exits
                Node node = buckets[bi].get(di);
                 return node.value;
               }
         }
         public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<buckets.length; i++){
                LinkedList<Node> ll  =buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key, null);
                }
            }
            return keys;
         }

         public boolean isEmpty(){
            return n==0;
         }
    }
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();   
        //   Insertion
         map.put("India",120);
         map.put("Paskistan",30);
         map.put("Sri lanka",20);
    }
}
