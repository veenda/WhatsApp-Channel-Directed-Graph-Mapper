import java.util.*;

public class Graph {
    // metadata for the graph
    private Map<String, Channel> nodes = new HashMap<>(); // channels

    // structure of the graph
    private Map<String, Set<String>> edges = new HashMap<>(); // channel id -> set of channel ids it is connected to

    public void addNode(String id, Channel channel) {
        nodes.put(channel.getId(), channel);
        edges.putIfAbsent(channel.getId(), new HashSet<>());
    }

    public void addEdge(String fromId, String toId) {
        if (nodes.containsKey(fromId) && nodes.containsKey(toId)) {
            edges.get(fromId).add(toId);
        }
    }

    public void printGraph() {
        for (String id : nodes.keySet()) {
            Channel sourceChannel = nodes.get(id);
            System.out.println(nodes.get(id));
            System.out.println("  Connected to: " + edges.get(id));
        }
    }
}