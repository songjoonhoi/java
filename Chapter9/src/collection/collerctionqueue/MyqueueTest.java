package collection.collerctionqueue;

public class MyqueueTest {
    public static void main(String[] args) {
        // Myqueue 객체 생성
        Myqueue queue = new Myqueue();

        // 요소 추가 - 순서 A-> B-> C
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        // 요소 삭제 순서 A -> B-> C
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
