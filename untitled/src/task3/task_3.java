package task3;



/*
Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими свойствами и методами:

Класс "Книга" (Book):

Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).
Класс "Библиотека" (Library):

Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит на консоль
информацию о книгах данного автора, находящихся в каталоге библиотеки.
* */
public class task_3 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Облако в штанах", "Владимир Владимирович Маяковский"));
        lib.addBook(new Book("Люблю ваш сумрак неизвестный…", "Пушкин"));
        lib.addBook(new Book("Я живу на Большой Пресне...", "Владимир Владимирович Маяковский"));
        lib.addBook(new Book("Война объявлена", "Владимир Владимирович Маяковский"));
        lib.addBook(new Book("Автостопом по Галактике", "Дуглас Адамс"));
        lib.addBook(new Book("Мышь отсюда, или Кыш сюда!", "Тим Собакин"));
        lib.addBook(new Book("Капитал", "Карл Маркс"));
        lib.addBook(new Book("Искусство управления переменами", "Виногродский"));
        lib.addBook(new Book("Повесть о настоящем человеке","Полевой"));
        lib.addBook(new Book("Мурзилка", "Фёдорова-Давыдов"));
        lib.addBook(new Book("Как разговаривать с му*аками", "Марк Гоулстон"));
        lib.removeBook(new Book("Повести покойного Ивана Петровича Белкина", "Пушкин"));
        lib.displayAvailableBooks();
//        lib.searchByAuthor("Лю");

        lib.displayAvailableBooks("Пушкин");

        lib.searchByAuthor("Пушкин");

    }
}