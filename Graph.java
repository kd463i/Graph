import java.util.*;
public class Graph{
    private int V;
    private List<List<Integer>> adjList;
    public Graph(int V){
        this.V=V;
        adjList=new ArrayList<>();
        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
    }
    
    public void addEdge(int u ,int v){
        adjList.get(u).add(v);
    }
    public void PrintGraph(){
        for(int i=0;i<V;i++){
            System.out.print("vertex "+i+":");
            for(int neighbour:adjList.get(i)){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.PrintGraph();
    }
}