package tree;

public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if(root.left != null && root.right != null)
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        else if(root.right != null)
            return 1 + maxDepth(root.right);
        else if(root.left != null)
            return 1 + maxDepth(root.left);
        else
            return 1;
    }

    // [1,2,3,4,5]

    public static void main(String[] args) {
        MaximumDepthofBinaryTree104 obj = new MaximumDepthofBinaryTree104();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(obj.maxDepth(root));
    }
}