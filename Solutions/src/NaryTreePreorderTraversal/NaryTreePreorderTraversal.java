package NaryTreePreorderTraversal;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();

        if (root == null) {
            return answer;
        } else {
            return helper(root, answer);
        }
    }

    private List<Integer> helper(Node node, List<Integer> answer) {
        answer.add(node.val);

        for (Node child : node.children) {
            helper(child, answer);
        }

        return answer;
    }
}
