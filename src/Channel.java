public class Channel {
    private String id;
    private String name;
    private String description;
    private String type;
    private String link;

    public Channel(String id, String name, String description, String type, String link) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}