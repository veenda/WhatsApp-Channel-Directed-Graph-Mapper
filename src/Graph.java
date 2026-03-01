import java.util.HashMap;

public class Graph {
    // metadata for the graph
    private Map<String, Channel> nodes = new HashMap<>(); // channels

    // structure of the graph
    private Map<String, List<String>> adjList = new HashMap<>(); // channel id -> set of channel ids it is connected to

    // methods to manipulate the graph
    public void addNode(String id, Channel channel) {
        nodes.put(id, channel);
        adjList.putIfAbsent(id, new ArrayList<>());
    }

    // add an edge from one channel to another
    public void addEdge(String fromId, String toId) {
        if (adjList.containsKey(fromId)) {
            adjList.get(fromId).add(toId);
        }
    }

    public void printGraph() {
        for (String fromId : adjList.keySet()) {
            Channel from = nodes.get(fromId);
            System.out.println(from + " is connected to:");
            for (String toId : adjList.get(fromId)) {
                System.out.println(nodes.get(toId) + ", ");
            }
            System.out.println();
        }
    }
}