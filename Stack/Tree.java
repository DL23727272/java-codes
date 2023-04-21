import java.io.*;

public class Tree {
    private Node root;

    Tree() {
        root = null;
    }

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        void displayData() {
            System.out.print(value + " ");
        }
    }

    void insert(int i) {
        root = insert(root, i);
    }

    Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    Node find(int searchedValue) {
        Node current = root;
        while (current.value != searchedValue) {
            if (searchedValue < current.value)
                current = current.left;
            else
                current = current.right;
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            node.displayData();
            inOrder(node.right);
        }
    }

    void preOrder(Node node) {
        if (node != null) {
            node.displayData();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            node.displayData();
        }
    }


    public static void main(String... args) throws IOException {

        BufferedReader DL = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first node: ");
        int A = Integer.parseInt(DL.readLine());

        System.out.print("Enter Second node: ");
        int B = Integer.parseInt(DL.readLine());

        System.out.print("Enter Third node: ");
        int C = Integer.parseInt(DL.readLine());

        System.out.print("Enter Fourth node: ");
        int D = Integer.parseInt(DL.readLine());

        System.out.print("Enter Fifth node: ");
        int E = Integer.parseInt(DL.readLine());


        Tree tree = new Tree();
        tree.root = new Node(A);
        tree.root.left = new Node(B);
        tree.root.right = new Node(C);
        tree.root.left.left = new Node(D);
        tree.root.left.right = new Node(E);

        System.out.print("Inorder traversal of binary tree is: ");
        tree.inOrder(tree.root);

        System.out.print("\nPreorder traversal of binary tree is: ");
        tree.preOrder(tree.root);

        System.out.print("\nPostorder traversal of binary tree is: ");
        tree.postOrder(tree.root);
    }
}