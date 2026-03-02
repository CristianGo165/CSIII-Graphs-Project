import java.util.*;

public class Graph {

    public static class Path{

        private ArrayList<Edge> path;



        @Override
        public String toString() {
            return super.toString();
        }
    }

    private final HashMap<Integer, List<Edge>> adjLists;
    private final HashMap<Integer, NodeType> typeSet;
    private final HashMap<NodeType, Integer> numTypes;
    private final HashMap<Integer, Node> nodeSet;

    public Graph(UserNode user){
        adjLists = new HashMap<>();
        typeSet = new HashMap<>();
        nodeSet = new HashMap<>();
        numTypes = new HashMap<>();
        addNode(user);
    }

    public void addNode(Node n){

        //Adds node n to graph without any connections
        if(nodeSet.containsKey(n.id)) throw new IllegalArgumentException("Node: [" + n + "] already exits in graph!!!");
        nodeSet.put(n.id, n);
        typeSet.put(n.id, n.type);
        typeSet.put(n.id, n.type);
        adjLists.put(n.id, new LinkedList<>());
        numTypes.put(n.type, numTypes.getOrDefault(n.type, 0));
    }

    public void addEdge(int src, int tar){

        //Check for valid src and tar nodes.
        if(!nodeSet.containsKey(src)) throw new IllegalArgumentException("No source node [" + src + "] exists in graph.");
        if(!nodeSet.containsKey(tar)) throw new IllegalArgumentException("No target node [" + tar + "] exists in graph.");

        //Create adjacency lists if they do not exist in the hashmap
        if(!adjLists.containsKey(src)) adjLists.put(src, new LinkedList<>());
        adjLists.get(src).add(new Edge(src, tar));

    }

    public void addBidirectionalEdge(int src, int tar){

        addEdge(src, tar);

        //Add link from tar to src
        if(!adjLists.containsKey(tar)) adjLists.put(tar, new LinkedList<>());
        adjLists.get(tar).add(new Edge(tar, src));

    }

    public void addEdge(int src, int tar, double weight){
        //Check for valid src and tar nodes.
        if(!nodeSet.containsKey(src)) throw new IllegalArgumentException("No source node [" + src + "] exists in graph.");
        if(!nodeSet.containsKey(tar)) throw new IllegalArgumentException("No target node [" + tar + "] exists in graph.");

        //Create adjacency lists if they do not exist in the hashmap
        if(!adjLists.containsKey(src)) adjLists.put(src, new LinkedList<>());
        adjLists.get(src).add(new Edge(src, tar, weight));

    }

    public void addBidirectionalEdge(int src, int tar, double weight){

        addEdge(src, tar);

        //Add link from tar to src
        if(!adjLists.containsKey(tar)) adjLists.put(tar, new LinkedList<>());
        adjLists.get(tar).add(new Edge(tar, src, weight));

    }

    public List<Edge> neighborEdges(int node){
        if(!adjLists.containsKey(node)) throw new IllegalArgumentException("No node [" + node + "] exists in the graph");
        return adjLists.get(node);
    }

    public void DFSTraversal(int start, HashSet<Integer> visited){

        //Add node to visited and process
        visited.add(start);
        System.out.println(start);

        //Recursive call on neighbors if they are not in the visited set
        for(Edge e : neighborEdges(start)){
            if(!visited.contains(e.tar)){
                DFSTraversal(e.tar, visited);
            }
        }
    }
    public void BFSTraversal(int start){

        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> traveralQueue = new LinkedList<>();

        //Add start node to visited and traversal queue
        traveralQueue.add(start);
        visited.add(start);

        //Process node
        System.out.println(start);

        while(!traveralQueue.isEmpty()){

            int current = traveralQueue.poll();

            //Add neighbors to traversal queue
            for(Edge e : neighborEdges(current)){
                if(!visited.contains(e.tar)){

                    System.out.println(e.tar);
                    visited.add(e.tar);
                    traveralQueue.add(e.tar);

                }
            }

        }

    }

    public List<Edge> buildMinSpanningTree(int start){

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparing(Edge::getWeight));
        HashSet<Integer> visited = new HashSet<>();
        List<Edge> result = new ArrayList<>();

        //Add all starting edges and add starting node to visited
        visited.add(start);
        for(Edge e : neighborEdges(start)){

            pq.add(e);

        }

        while(!pq.isEmpty()){

            Edge current = pq.poll();
            result.add(current);

            for(Edge e : neighborEdges(current.tar)){
                if(!visited.contains(e.tar)){

                    visited.add(e.tar);
                    pq.add(e);

                }
            }

        }

        return result;

    }

    public Path dijkstraFind(int start, Path result){
        PriorityQueue<Edge> traversalQueue = new PriorityQueue<>(Comparator.comparing(Edge::getWeight));
        HashMap<Integer, Double> distances = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();


        visited.add(start);
        for(Edge e : neighborEdges(start)){

            traversalQueue.add(e);

        }

        while(!traversalQueue.isEmpty()){
            Edge current 
        }

        return result;
    }

}