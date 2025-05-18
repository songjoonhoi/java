package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // Map 자료형으로 HashMap을 생성
        // 이름과 점수 저장
        Map<String, Integer> map = new HashMap<>();
        
        // 요소 추가
        map.put("이홍시", 80);
        map.put("홍쿠", 75);
        map.put("길동", 50);

        // 요소의 개수
        System.out.println("요소 소 - " + map.size() + "개");

        // 요소 검색 - 순서가 없어서 인덱싱 못하고, key로 검색함
        System.out.println("이홍시의 점수: " + map.get("이홍시") + "점");
        
        // 요소 추가(수정)
        map.put("홍쿠", 90);

        // map 객체 출력
        System.out.println(map);

        // 요소 삭제
        if(map.containsKey("길동")){
        map.remove("길동");}


        // 전체 출력 - 반복자 클래스(Iterator) 사용, while문 사용
        Iterator<String> ir = map.keySet().iterator();
        while(ir.hasNext()){ // 요소가 없다면(비어 있지 않다면)
            String key = ir.next(); // 요소를 가져와서 key에 저장
            Integer value = map.get(key); // 키를 검색한 점수를 저장
            System.out.println(key + " : "+ value);
        }

    }
}
