package BinaryTreeLevelOrderTraversal;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
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

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return ans;
        }
        bfs(root);
        return ans;
    }

    private void bfs(TreeNode root) {
        Queue<TreeNode> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);

        while (!bfsQueue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int numNodesInLevel = bfsQueue.size();

            for (int i = 0; i < numNodesInLevel; i++) {
                TreeNode node = bfsQueue.poll();
                levelList.add(node.val);

                if (node.left != null) {
                    bfsQueue.add(node.left);
                }
                if (node.right != null) {
                    bfsQueue.add(node.right);
                }
            }

            ans.add(levelList);
        }
    }
}
