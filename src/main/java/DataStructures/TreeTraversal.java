package DataStructures;

/*Example Tree:
 *                      1
 *                    / \
 *                  /    \
 *                2       3
 *              /  \
 *            /     \
 *          4        5
 */
public class TreeTraversal {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    /**
     * Init example tree above
     *
     * @return root of tree
     */
    public static Node createTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        return root;
    }

    /**
     * preOrder Traversal
     *
     * @param root the root of tree
     */
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * InOrder Traversal
     *
     * @param root the root of tree
     */
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    /**
     * PostOrder Traversal
     *
     * @param root the root of tree
     */
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    /* Driver Code */
    public static void main(String[] args) {
        Node root = createTree();

        inOrder(root); /* 4 2 5 1 3 */
        System.out.println();

        preOrder(root); /* 1 2 4 5 3 */
        System.out.println();

        postOrder(root); /* 4 5 2 3 1 */
        System.out.println();
    }
}
