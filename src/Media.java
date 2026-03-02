public class Media {
    final String title;
    final String path;
    final String[] authors;
    final Genre genre;
    final int numAuthors;
    //...

    //...
    public Media(String title, String[] authors, Genre genre, String path){
        this.title = title;
        this.authors = authors;
        numAuthors = authors.length;
        this.genre = genre;
        this.path = path;
    }
}
