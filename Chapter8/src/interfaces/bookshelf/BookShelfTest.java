package interfaces.bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();

        // 요소 넣기
        shelfQueue.enQueue("귀멸의 칼날");
        shelfQueue.enQueue("원피스");

        // 요소의 개수
        System.out.println("요소의 총 개수: " + shelfQueue.getSize());

        // 요소 삭제
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
