public class Main {


    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой" );
        Author author2 = new Author("Николай","Карамзин");
        Author author3 = new Author("Лев", "Толстой" );
        Book book3 = new Book("Война и мир", author3,1865 );
        Book book1 = new Book("Война и мир", author1,1865 );
        System.out.println("\nКнига 1");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println(book1.getYear());
        book1.setYear(1869);
        book3.setYear(1869);
        System.out.println(book1.getYear());
        System.out.println("\nКнига 2");
        Book book2 = new Book("Бедная Лиза", author2, 1792);
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        System.out.println(book2.getYear());
        System.out.println(book1);
        System.out.println(author1.equals(author3));
        System.out.println(book1.equals(book2));


    }
}