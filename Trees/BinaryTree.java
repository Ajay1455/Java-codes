import java.util.Scanner;
public class BinaryTree {

        public class Node{
            int data ;
            Node left;
            Node right;
            // Node(){

            // }
            // Node(int value){
            //     data=value;
            //     left=right=null;
            // }
        }
        private Node root;
        Scanner sc= new Scanner(System.in);
        BinaryTree(){
            this.root=createTree();
        }

        public Node createTree(){
            int x=sc.nextInt();
            Node n =new Node();
            n.data=x;
            if(sc.nextBoolean()){
                n.left=createTree();
            }
            if(sc.nextBoolean()){
                n.right=createTree();
            }
            return n;
        }

        public void display(){
            display(this.root);
        }

        private void display(Node root) {
            if(root==null){
                return ;
            }
            String s="<--"+root.data+"-->";
            if(root.left!=null){
                s=root.left.data+s;
            }
            if(root.right!=null){
                s=s+root.right.data;
            }
            System.out.println(s);
            display(root.left);
            display(root.right);
        }

        public boolean find(int x){
            return find(this.root, x);
        }

        public boolean find(Node root, int x) {
            if(root==null){
                return false;
            }
            if(root.data==x){
                return true;
            }
            return find(root.left,x) || find(root.right,x);
        }

        public int maxValue(){
            return maxValue(this.root);
        }

        public int maxValue(Node root) {
            if(root==null)
            return -1;

            int l=maxValue(root.left);
            int r=maxValue(root.right);
            return Math.max(root.data, Math.max(l,r));
        }

        public static void main(String[] args) {
            BinaryTree tre=new BinaryTree();
            tre.display();
            // boolean a = tre.find(10);
            // int b = tre.maxValue();
            // System.out.println(b);
        }

    }
