public class GenreNode extends Node{

    private final Genre genre;
    private int numOutgoing;

    public GenreNode(Genre genre){
        super();
        this.type = NodeType.GENRE;
        this.genre = genre;
        this.numOutgoing = 0;
    }

    public Genre genre(){
        return genre;
    }

    public int numOutgoing(){
        return numOutgoing;
    }

    //Make sure to call update outgoing when adding an outgoing node from a genre node!!!
    public int updateOutgoing(){
        ++numOutgoing;
        return numOutgoing;
    }

    @Override
    public int compareTo(Node node) {
        return 0;
    }
}
