import java.io.*;
import java.util.*;

public class Main {
    public static void Main(String[] args) {
        Graph graph = new Graph();

        try (BufferedReader br = new BufferedReader(new FileReader("channels.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                graph.addNode(data[0], new Channel(data[0], data[1], data[2], data[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading nodes.csv: " + e.getMessage());
    }

    try (BufferedReader br = new BufferedReader(new FileReader("edges.csv"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            graph.addEdge(data[0], data[1]);
        }
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Error reading edges.csv: " + e.getMessage());
    }

    System.out.println("Graph structure:");
    graph.printGraph();
}