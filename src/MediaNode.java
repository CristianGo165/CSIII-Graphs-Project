public class MediaNode extends Node{

    private final Media media;

    public MediaNode(Media media){
        super();
        this.type = NodeType.MEDIA;
        this.media = media;
    }

    public String title(){
        return media.title;
    }

    public String[] authors(){
        return media.authors;
    }

    public String author(int i){
        if(i < 0 || i >= media.numAuthors) throw new IndexOutOfBoundsException("IndexOutOfBoundsException: No such author at " + i);
        return media.authors[i];
    }

    public Genre genre(){
        return media.genre;
    }

    public int numAuthors(){
        return media.numAuthors;
    }

    @Override
    public int compareTo(Node node){
        return 0;
    }




}
