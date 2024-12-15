import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Конструктор
    public Library() {
        this.books = new ArrayList<>();
    }

    // Добавить книгу
    public void addBook(Book book) {
        books.add(book);
    }

    // Удалить книгу
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Найти книгу по названию
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Найти книги по автору
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // Найти книги по жанру
    public ArrayList<Book> findBooksByGenre(String genre) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    // Найти книги по году
    public ArrayList<Book> findBooksByYear(int year) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    // Обновить информацию о книге
    public void updateBook(Book oldBook, Book newBook) {
        int index = books.indexOf(oldBook);
        if (index != -1) {
            books.set(index, newBook);
        }
    }

    // Вывести все книги
    public void printLibrary() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
