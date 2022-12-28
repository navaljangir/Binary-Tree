public class heightOfTree {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++; 
            if(nodes[idx] ==-1){
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.left = buildTree(nodes);
            return newNode;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int heightLeft = height(root.left)+1;
        int heightRight = height(root.right)+1;
        int treeHeight =  Math.max(heightLeft, heightRight);
        return treeHeight;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        
        Node root = tree.buildTree(nodes);
    System.out.println( height(root));
    }
}
