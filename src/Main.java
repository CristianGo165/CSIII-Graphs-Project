import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        User u = new User("Bob", new Genre[]{});
        UserNode un = new UserNode(u);

        GenreNode j = new GenreNode(Genre.JAZZ);
        GenreNode p = new GenreNode(Genre.POP);

        Graph g = new Graph(un);
        g.addNode(j);
        g.addNode(p);

        g.addEdge(un.id, j.id);
        g.addEdge(un.id, p.id);

        g.DFSTraversal(un.id, new HashSet<>());
        g.BFSTraversal(un.id);

        Graph.Path path = new Graph.Path();
    }
}