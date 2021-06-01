package MaximumDepthOfBinaryTree;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MaximumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, 0);
    }

    private int helper(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        } else {
            return Math.max(helper(node.left, depth + 1), helper(node.right, depth + 1));
        }
    }
}
