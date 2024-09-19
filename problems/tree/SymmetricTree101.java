package tree;

public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;
        if(root.val != root.val) return false;

        return isMiror(root.left, root.right);
    }

    private boolean isMiror(TreeNode left, TreeNode right) {
        if(left == null && right != null) return false;
        if(left != null && right == null) return false;
        if(left == null && right == null) return true;
        if(left.val != right.val) return false;

        return isMiror(left.left, right.right) && isMiror(left.right, right.left);
    }

}