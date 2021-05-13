package CloneGraph;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    public Node cloneGraph(Node node) {
        HashMap<Integer, Node> visited = new HashMap<>();
        return dfs(node, visited);
    }

    private static Node dfs(Node node, HashMap<Integer, Node> visited) {
        if (node == null) {
            return node;
        }

        if (visited.containsKey(node.val)) {
            return visited.get(node.val);
        }

        Node clonedNode = new Node(node.val);
        visited.put(node.val, clonedNode);

        for (Node neighbor : node.neighbors) {
            clonedNode.neighbors.add(dfs(neighbor, visited));
        }

        return clonedNode;
    }
}
