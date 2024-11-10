public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System");

        // Create a sample book and member
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Member member1 = new Member(1, "Alice", "alice@example.com");

        // Display the book and member details
        System.out.println(book1);
        System.out.println(member1);
    }
}
