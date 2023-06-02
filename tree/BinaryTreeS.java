import java.util.ArrayList;



public class BinaryTreeS {
    static ArrayList al = new ArrayList<>();
    static class Node{
        int data;
        Node left;
        Node right;
    
        Node(int data){
            this.data= data;
            
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(idx == nodes.length){
                return null;
            }
            if(nodes[idx]==-1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            
            return newNode;
        }

        public static  void  Preorder(Node root){
            if(root == null){
               return ;
            }
            if (root.data == -1){
                al.add(-1);
            }
            al.add(root.data);
            Preorder(root.left);
            Preorder(root.right);
        }
    
    
    
        boolean isBST(Node root,Node min, Node max ){
        if(root== null){return true;}
        if(min!= null && root.data<=min.data){
            return false;
        }
        if(max!= null && root.data>= max.data){
            return false;
        }
        return isBST(root.left,min,root) && isBST(root.right,root,max);
        }
    }   
    public static void main(String[] args) {
        int nodes[]= {2,1,3};
       BinaryTree tree = new BinaryTree();
       Node root= tree.buildTree(nodes);
     //  System.out.println(tree.isBST(root, null, null));

       //System.out.println(root.data);
        tree.Preorder(root);
        

    }
}
