
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// trees non linear , hierarchial data structure 
public class Trees {

    private TreeNode root;

    /*
    Java reads the whole class first before checking the order of members.
     So even if TreeNode is written after root, Java already knows about it when compiling.

     Why it works:
You're only telling Java: "root is of type TreeNode", not creating an object yet.

The class TreeNode is still inside the Trees class, so Java treats it as available within that scope.

 We cannot create an object of TreeNode before its definition but we're only declaring a variable of type TreeNode.
     */
    private class TreeNode {

        private int data; // generic type
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data) {
            this.data = data;
        }

    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void inorder(TreeNode root) {
        if (root == null) {

            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // preoder traversal of tree using stacks 
    public void preorderStack(TreeNode root) {
        // Base case: if the tree is empty, return
        if (root == null) {
            return;
        }

        // Create a stack and push the root node
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        // Loop until the stack is empty
        while (!stack.isEmpty()) {
            // Step 1: Pop the top node and process it
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " "); // Visit the node

            // Step 2: Push right child first (so it comes out after left)
            if (temp.right != null) {
                stack.push(temp.right);
            }

            // Step 3: Push left child
            if (temp.left != null) {
                stack.push(temp.left);
            }

            // This ensures left is processed before right, like in real preorder (Node → Left → Right)
        }
    }

    // inoder traversal of tree using stacks 
    public void inorderStack(TreeNode root) {
        // Base case: if the root is null, there's nothing to traverse
        if (root == null) {
            return;
        }

        // Create a stack to simulate the recursion
        Stack<TreeNode> stack = new Stack<>();

        // Start with the root node
        TreeNode temp = root;

        // Continue until all nodes are processed
        while (!stack.isEmpty() || temp != null) {

            // Step 1: Go as far left as possible from the current node
            if (temp != null) {
                stack.push(temp);     // Push current node onto the stack
                temp = temp.left;     // Move to left child
            } else {
                // Step 2: If there's no more left node, process the node on top of the stack
                temp = stack.pop();   // Pop the node from the stack
                System.out.print(temp.data + " "); // Visit the node (print its data)
                temp = temp.right;    // Move to right child and repeat
            }
        }
    }

    // postorder traversal of tree using stacks
    public void postorderStack(TreeNode root) {
        // Base case: if the tree is empty
        if (root == null) {
            return;
        }

        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        // Continue until all nodes are processed
        while (current != null || !stack.isEmpty()) {

            // Step 1: Go to the leftmost node
            if (current != null) {
                stack.push(current);      // Push current node onto the stack
                current = current.left;   // Move to the left child
            } else {
                // Step 2: Check the right child of the node on top of the stack
                TreeNode temp = stack.peek().right;

                if (temp == null) {
                    // If right child is null, it means left and right are already processed
                    temp = stack.pop();                   // Pop the node and visit it
                    System.out.print(temp.data + " ");

                    // Check if the popped node was the right child of the next node on the stack
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();               // Pop and visit parent nodes
                        System.out.print(temp.data + " ");
                    }
                } else {
                    // If right child exists, process it next
                    current = temp;
                }
            }
        }
    }

    //  level order traversal of binary tree
    //  traverse level by level 
    public void levelOrder() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }

    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }

    public static void main(String[] args) {
        Trees obj = new Trees();

        obj.createBinaryTree();

        System.out.print("\nLevel order traversal : ");
        obj.levelOrder();
        System.out.print("\nInorder traversal     : ");
        obj.inorder(obj.root);
        System.out.print("\nPostorder traversal   : ");
        obj.postorder(obj.root);
        System.out.print("\nPreorder traversal    : ");
        obj.preorder(obj.root);

        System.out.print("\nInorder stack traversal     : ");
        obj.inorderStack(obj.root);
        System.out.print("\nPostorder stack traversal   : ");
        obj.postorderStack(obj.root);
        System.out.print("\nPreorder stack traversal    : ");
        obj.preorderStack(obj.root);

    }
}
