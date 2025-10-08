package graphs;
import java.util.*;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
    
    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    // add vertex
    public boolean addVertex(String vertex){
        // checking if the vertex/key is already present in the graph/adjList(HashMap)
        if(adjList.get(vertex)==null){
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }
    // connecting two vertices by checking if it exists and add each other to their lists
    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    // removing the edges from the vertices from its lists also checking if the vertex exists
    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adjList.get(vertex)!=null){
            ArrayList<String> ar = adjList.get(vertex);
            for (String i: ar){ // instead of creating a copy arraylist you can use the get(vertex) directly in forloop
                adjList.get(i).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
        return false;
    }
}
