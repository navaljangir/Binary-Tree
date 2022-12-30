import java.util.*;
public class diameterOfTree {
    static class Node{
        int data;
        Node right;
        Node left; 
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;

        }
    }
    static class BinaryTree{
        static int idx = -1; 
        public static Node buildTree(int nodes[]){
            idx++; 
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode; 
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0; 
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height(root.right) + 1;    
        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter(root));
    }
}
