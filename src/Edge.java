public class Edge {
    //source and target nodes should be passed as their integer IDs
    int src;
    int tar;
    private double weight;

    public Edge(int src, int tar){
        this.src = src;
        this.tar = tar;
        this.weight = 0.0;
    }
    public Edge(int src, int tar, double weight){
        this.src = src;
        this.tar = tar;
        this.weight = weight;
    }
    //Updates weight
    public double updateWeight(double weight){
        this.weight = weight;
        return this.weight;
    }
    //Increments weight by inc
    public double incWeight(double inc){
        this.weight += inc;
        return this.weight;
    }
    //Returns the weight
    public double getWeight(){
        return this.weight;
    }
}
