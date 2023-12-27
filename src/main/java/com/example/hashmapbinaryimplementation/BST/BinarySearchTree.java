package com.example.hashmapbinaryimplementation.BST;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(T data) {
        root = insertRec(root, data);
    }

    private Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node<T> root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public int countBST(Node<T> root) {
        if (root == null) {
            return 0;
        }
        return countBST(root.left) + 1 + countBST(root.right);
    }

    public void size() {
        System.out.println(countBST(root));
    }


    public Node<T> search(Node<T> root, T key) {

        if (root == null || root.data == key)
            return root;
        if (root.data.compareTo(key) < 0)
            return search(root.right, key);
        return search(root.left, key);
    }

    public boolean findInBst(T key) {
        return search(root, key) != null;
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
//        UC1
        binarySearchTree.insert(56);
        binarySearchTree.insert(30);
        binarySearchTree.insert(70);

//        UC2
        binarySearchTree.insert(22);
        binarySearchTree.insert(40);
        binarySearchTree.insert(60);
        binarySearchTree.insert(95);
        binarySearchTree.insert(11);
        binarySearchTree.insert(65);
        binarySearchTree.insert(3);
        binarySearchTree.insert(16);
        binarySearchTree.insert(63);
        binarySearchTree.insert(67);

        System.out.print("Inorder traversal->");
        binarySearchTree.inOrderTraversal();
        System.out.print("\nCount of BST: ");
        binarySearchTree.size();

        System.out.println("Is 63 Present In BST: " + binarySearchTree.findInBst(63));
    }
}
