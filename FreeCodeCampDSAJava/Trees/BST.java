
public class BST {

    static class Node {

        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    // Insert a node into the BST
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Inorder Traversal (Left - Root - Right)
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Search for a key in the BST
    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (key == root.data) {
            return true;
        } else if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Validate BST using min/max boundaries
    static boolean isValidBST(Node root) {
        return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isValidBSTHelper(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return isValidBSTHelper(root.left, min, root.data)
                && isValidBSTHelper(root.right, root.data, max);
    }

    /*
        15
       /  \
     12    18
    /  \   /  \
  10   13 7    20
on iteration 	7 < 15, but in right subtree → violates BST


     */
    // Find Inorder Predecessor
    static Node inorderPredecessor(Node root) {
        Node current = root.left;
        while (current != null && current.right != null) {
            current = current.right;
        }
        return current;
    }

    // Find Inorder Successor
    static Node inorderSuccessor(Node root) {
        Node current = root.right;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Delete using Inorder Predecessor
    static Node deleteUsingPredecessor(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteUsingPredecessor(root.left, key);
        } else if (key > root.data) {
            root.right = deleteUsingPredecessor(root.right, key);
        } else {
            // Node found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node pred = inorderPredecessor(root);
            root.data = pred.data;
            root.left = deleteUsingPredecessor(root.left, pred.data);
        }
        return root;
    }

    // Delete using Inorder Successor
    static Node deleteUsingSuccessor(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteUsingSuccessor(root.left, key);
        } else if (key > root.data) {
            root.right = deleteUsingSuccessor(root.right, key);
        } else {
            // Node found
            if (root.left == null) {
                return root.right;
                //note : if (root.left == null)       // true
                // return root.right;       // returns null, since right is also null

            } else if (root.right == null) {
                return root.left;
            }

            Node succ = inorderSuccessor(root);
            root.data = succ.data;
            root.right = deleteUsingSuccessor(root.right, succ.data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] keys = {50, 30, 70, 20, 40, 60, 80};

        // Insert nodes
        for (int key : keys) {
            root = insert(root, key);
        }

        System.out.println("Original BST (Inorder):");
        inorder(root);

        // Search operation
        System.out.println("\n\nSearching for 40: " + (search(root, 40) ? "Found" : "Not Found"));
        System.out.println("Searching for 100: " + (search(root, 100) ? "Found" : "Not Found"));

        // Check if valid BST
        System.out.println("\nIs valid BST? " + (isValidBST(root) ? "Yes" : "No"));

        // Delete node using Inorder Predecessor
        root = deleteUsingPredecessor(root, 50);
        System.out.println("\nBST after deleting 50 using Inorder Predecessor:");
        inorder(root);

        // Reinsert for Successor test
        root = insert(root, 50);
        System.out.println("\n\nBST after reinserting 50:");
        inorder(root);

        // Delete node using Inorder Successor
        root = deleteUsingSuccessor(root, 50);
        System.out.println("\nBST after deleting 50 using Inorder Successor:");
        inorder(root);
    }
}
