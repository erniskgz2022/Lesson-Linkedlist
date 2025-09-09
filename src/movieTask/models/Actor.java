package movieTask.models;

public class Actor {
    private String actorFullName;
    private String role;

    public Actor() {
    }

    public Actor(String actorFullName, String role) {
        this.actorFullName = actorFullName;
        this.role = role;
    }
    public String getActorFullName() {
        return actorFullName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "\nActor: " + actorFullName + "\nRole: " + role;
    }


}
