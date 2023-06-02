import javax.swing.tree.TreeNode;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
    
        Node(int data){
            this.data= data;
            
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left= insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;

    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
     public static boolean isBST(Node root,Node min, Node max ){
        if(root== null){return true;}
        if(min!= null &&root.data<=min.data){
            return false;
        }
        if(max!= null && root.data>= max.data){
            return false;
        }
        return isBST(root.left,min,root) && isBST(root.right,root,max);
    }

    public static void main(String[] args) {
        int values[]= {1,4,3,2,4,2,5,0,0,0,0,0,0,4,6};
        Node root =null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        } 
        inorder(root); 
        System.out.println();
        System.out.println(isBST(root, null, null));
    }
}
