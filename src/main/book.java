public class Book {
    private int id;
    private String title;
    private String author;
    private int yearPublished;

    public Book(int id, String title, String author, int yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Book [ID=" + id + ", Title=" + title + ", Author=" + author + ", Year Published=" + yearPublished + "]";
    }
}
