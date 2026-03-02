abstract class Node implements Comparable<Node> {

    //Make sure to declare type when writing constructor for child classes!!!
    protected NodeType type;
    private static int counter = -1;
    final int id;

    //Make sure subclasses call super constructor!!!
    public Node(){
        id = ++counter;
    }
    public int ID(){
        return this.id;
    }
    public NodeType type(){
        return this.type;
    }

    @Override
    public int compareTo(Node o) {
        return 0;
    }
}
