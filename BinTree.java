class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class process {
    Node root;

    public void insert(int data) {
        root = insertrec(root, data);
    }

    public Node insertrec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertrec(root.left, data);
        } else if (data > root.data) {
            root.right = insertrec(root.right, data);
        }
        return root;
    }

    public void Inorder() {
        inorderrec(root);
    }

    public void inorderrec(Node root) {
        if (root != null) {
            inorderrec(root.left);
            System.out.print(root.data);
            inorderrec(root.right);
        }
    }

    public void preorder() {
        preorderrec(root);
    }

    public void preorderrec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderrec(root.left);
            preorderrec(root.right);
        }
    }
}

public class BinTree {
    public static void main(String[] args) {
        process ps = new process();
        ps.insert(1);
        ps.insert(2);
        ps.insert(3);
        ps.insert(4);
        ps.insert(5);
        ps.Inorder();
        ps.preorder();

    }
}