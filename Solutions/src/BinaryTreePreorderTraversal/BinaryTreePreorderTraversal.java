package BinaryTreePreorderTraversal;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class BinaryTreePreorderTraversal {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        dfs(root, nodes, visited);
        return nodes;
    }

    private void dfs(TreeNode node, List<Integer> nodes, HashSet<TreeNode> visited) {
        if (node == null) {
            return;
        }
        visited.add(node);
        nodes.add(node.val);
        if (!visited.contains(node.left)) {
            dfs(node.left, nodes, visited);
        }
        if (!visited.contains(node.right)) {
            dfs(node.right, nodes, visited);
        }
        return;
    }
}
