package ConvertBSTToGreaterTree;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ConvertBSTToGreaterTree {
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
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        convertBST(root.right);
        int temp = root.val;
        root.val += sum;
        sum += temp;
        convertBST(root.left);
        return root;
    }
}
