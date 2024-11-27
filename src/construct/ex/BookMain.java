package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 기본 생성자 호출
        Book book1 = new Book();
        book1.displayInfo();

        // 생성자 오버로딩 호출
        Book book2 = new Book("Java", "Kim");
        book2.displayInfo();

        // 생성자 오버로딩 호출
        Book book3 = new Book("Python", "Lee", 300);
        book3.displayInfo();
    }
}
