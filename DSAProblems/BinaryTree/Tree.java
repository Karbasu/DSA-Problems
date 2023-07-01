public class Tree{
    public static class Node{
        int data;
        Node left;
        Node right;
       Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
       }
    }
    public static class BinaryTree{
         static int idx  = -1;
        public Node builder(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builder(nodes);
            newNode.right = builder(nodes);
            return newNode;
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,3,-1,-1,2,-1,-1,8,-1,-1};
        BinaryTree t = new BinaryTree();
        Node root = t.builder(nodes);
        System.out.print(root.data);
    }
}