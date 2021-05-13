package CourseSchedule;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            int startNode = prerequisite[1];
            int endNode = prerequisite[0];
            if (!adjList.containsKey(startNode)) {
                ArrayList<Integer> neighbors = new ArrayList<>();
                neighbors.add(endNode);
                adjList.put(startNode, neighbors);
            } else {
                ArrayList<Integer> neighbors = adjList.get(startNode);
                neighbors.add(endNode);
                adjList.put(startNode, neighbors);
            }
        }

        boolean[] beingVisited = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (adjList.containsKey(i) && !visited[i]) {
                if (hasCycle(i, adjList, beingVisited, visited)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasCycle(int node, HashMap<Integer, ArrayList<Integer>> adjList, boolean[] beingVisited, boolean[] visited) {
        beingVisited[node] = true;

        if (adjList.containsKey(node)) {
            for (int neighbor : adjList.get(node)) {
                if (beingVisited[neighbor]) {
                    return true;
                } else if (!visited[neighbor] && hasCycle(neighbor, adjList, beingVisited, visited)) {
                    return true;
                }
            }
        }

        beingVisited[node] = false;
        visited[node] = true;

        return false;
    }
}
