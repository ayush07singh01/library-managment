public class Member {
    private int id;
    private String name;
    private String email;

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Member [ID=" + id + ", Name=" + name + ", Email=" + email + "]";
    }
}
