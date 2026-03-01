public class Channel {
    private String id;
    private String name;
    private String link;

    public Channel(String id, String name, String description, String type, String link) {
        this.id = id;
        this.name = name;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Node_" + this.id;
    }

    public String getId() {
        return id;
    }
}