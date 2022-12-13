import java.util.*;

//best for seaching it gives o(logn) 
// AVL for seacrging
// for insertion and deletion Red bLack tree is better but very inp. for interview
public class AVLTree {
    public class Node{
        int data, height;
        Node left,right;
        Node(int x){
            data=x;
            height=-1;
        }
       
    }
    Node root;
    public int height(Node n){
        if(n==null){
            return -1;
        }
        return n.height;
    }
    public Node insert(Node n, int x){
        if(n==null){
            return new Node(x);
        }
        if(x<n.data){
            n.left=insert(n.left, x);
        }else if(x>n.data){
            n.right=insert(n.right, x);
        }
        n.height=1+Math.max(height(n.right), height(n.left));

        int bf=height(n.left)-height(n.right);

        //right right case
        if(bf<-1 && x>n.right.data){
            return leftRotation(n);
        }
        //right left case
        if(bf<-1 && x<n.right.data){
            n.right=rightRotation(n.right);
            return leftRotation(n);
        }

        //left left case
        if(bf>0 && x>n.left.data){
            return rightRotation(n);
        }
        //left right case
        if(bf>0 && x<n.left.data){
            n.left=leftRotation(n.left);
            return rightRotation(n);
        }

        return n;
    }

    private AVLTree.Node rightRotation(AVLTree.Node n) {
        Node x=n.left;
        Node y=x.right;

        x.left=n;
        n.right=y;

        x.height=1+Math.max(height(n.right), height(n.left));
        n.height=1+Math.max(height(n.right), height(n.left));

        return x;
    }
    private AVLTree.Node leftRotation(AVLTree.Node n) {
        Node x=n.right;
        Node y=x.left;

        x.right=n;
        n.left=y;

        x.height=1+Math.max(height(n.right), height(n.left));
        n.height=1+Math.max(height(n.right), height(n.left));

        return x;
    }
    
    public void levelOrder(Node n){
        if(n==null){
            return;
        }
        LinkedList<Node> q1=new LinkedList<>();
        q1.add(n);
        while(!q1.isEmpty()){
            Node temp=q1.remove();
            if(temp.left!=null){
                q1.add(temp.left);
            }
            if(temp.right!=null){
                q1.add(temp.right);
            }
            System.out.print(temp.data+" ");
        }
    }

    public static void main(String[] args) {
        AVLTree tree=new AVLTree();
        tree.root=tree.insert(tree.root, 13);
        tree.root=tree.insert(tree.root, 10);
        tree.root=tree.insert(tree.root, 15);
        tree.root=tree.insert(tree.root, 11);
        tree.root=tree.insert(tree.root, 16);
        tree.root=tree.insert(tree.root, 4);
        tree.root=tree.insert(tree.root, 6);
        tree.levelOrder(tree.root);

        // tree.root=tree.insert(tree.root, 7);
        // tree.levelOrder(tree.root);

    }

}
