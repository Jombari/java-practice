package graphstuff;



/*
   Describe here known bugs or issues in this file. If your issue spans multiple
   files, or you are not sure about details, add comments to the README.txt file.
 */


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node node){
        nodes.add(node);
    }


    /**
     * Tis is an implementation of Dijsktras Shortest Path Algorithm
     * @param graph the graph
     * @param src the src node
     * @return returns the Graph with each node containing shortest distance from the srcNode.
     */
    public static Graph calculateShortestPathFromNode(Graph graph, Node src){
        src.setDistance(0);

        Set<Node> visitedNodes = new HashSet<>();
        Set<Node> unvisitedNodes = new HashSet<>();

        unvisitedNodes.add(src);

        while(unvisitedNodes.size() !=0){
            Node curNode = getLowestDistanceNode(unvisitedNodes);
            unvisitedNodes.remove(curNode);

            for(Map.Entry< Node, Integer> adjacencyPair:
            curNode.getAdjacentNodes().entrySet()){
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();

                if(!visitedNodes.contains(adjacentNode)){
                    calculateMinimumDistance(adjacentNode,edgeWeight,curNode);
                    unvisitedNodes.add(adjacentNode);
                }
            }
            visitedNodes.add(curNode);
        }
        return graph;
    }

    private static Node getLowestDistanceNode(Set < Node > unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node: unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Node evaluationNode,
                                                 Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

}
