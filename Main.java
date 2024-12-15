public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Создание книг
        Book book1 = new Book("1984", "George Orwell", 1949, "Dystopia");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");

        // Добавление книг в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Вывод всех книг
        System.out.println("Все книги в библиотеке:");
        library.printLibrary();

        // Поиск книг по автору
        System.out.println("\nКниги Харпер Ли:");
        for (Book book : library.findBooksByAuthor("Harper Lee")) {
            System.out.println(book);
        }

        // Обновление информации о книге
        System.out.println("\nОбновление книги '1984'...");
        Book updatedBook1 = new Book("1984", "George Orwell", 1949, "Science Fiction");
        library.updateBook(book1, updatedBook1);

        // Вывод всех книг после обновления
        System.out.println("\nВсе книги в библиотеке после обновления:");
        library.printLibrary();

        // Удаление книги
        System.out.println("\nУдаление книги 'The Great Gatsby'...");
        library.removeBook(book3);

        // Вывод всех книг после удаления
        System.out.println("\nВсе книги в библиотеке после удаления:");
        library.printLibrary();
    }
}
