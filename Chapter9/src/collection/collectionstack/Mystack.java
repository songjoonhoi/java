package collection.collectionstack;

import java.util.ArrayList;

// 문자열을 저장할 스텍 구조(ArrayListy로 구현) 클래스 생성
public class Mystack {

    private ArrayList<String> arrayStack;

    public Mystack() {
        arrayStack = new ArrayList<>();
    }

    // 요소 넣기
    public void push(String data) {
        arrayStack.add(data);
    }

    // 요소의 개수
    public int getSize() {
        return arrayStack.size();
    }

    // 요소 삭제(꺼내기)
    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스텍이 비었습니다.");
            return null;
        }

        return arrayStack.remove(len - 1);
    }

}
