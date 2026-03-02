public class UserNode extends Node{

    private final User user;

    public UserNode(User user){
        super();
        this.type = NodeType.USER;
        this.user = user;
    }

    public String name(){
        return user.name;
    }

    public Genre[] preferences(){
        return user.preferences;
    }

    @Override
    public int compareTo(Node node){
        return 0;
    }
}
