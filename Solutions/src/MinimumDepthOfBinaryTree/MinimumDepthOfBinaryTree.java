package MinimumDepthOfBinaryTree;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MinimumDepthOfBinaryTree {
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

    int ans = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        helper(root, 1);
        return ans;
    }

    private void helper(TreeNode node, int currDepth) {
        if (node.left == null && node.right == null) {
            ans = Math.min(currDepth, ans);
            return;
        }

        if (node.left != null) {
            helper(node.left, currDepth + 1);
        }

        if (node.right != null) {
            helper(node.right, currDepth + 1);
        }
    }
}
