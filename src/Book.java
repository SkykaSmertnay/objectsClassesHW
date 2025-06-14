import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year ) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Название " + "\"" + title + "\"" + " автор " + author + " год " + year;
    }
    public boolean equals(Book other) {
        return year == other.year && title.equals(other.title) && author.equals(other.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}
