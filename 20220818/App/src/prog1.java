import java.util.HashMap;

public class prog1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // put() 메소드를 이용한 요소의 저장
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        System.out.println("맵에 저장된 키들의 집합" + hm.keySet());
        // keySet() 메소드는 해당 맵에 포함된 모든 키 값들을 하나의 집합(Set)으로 반환

        for (String key : hm.keySet()) {
            System.out.println(String.format("키 : %s, 값: %s", key, hm.get(key)));
        }
    }
}
// Map 컬렉션 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식을 사용
// 여기서 키(key)란 실질적인 값(value)을 찾기 위한 이름의 역할
// Map의 특징
// 1. 요소의 저장순서를 유지하지 않는다.
// 2. 키의 중복은 허용하지 않고, 값의 중복은 허용한다.
// HashMap<K,V>
// HashTable<K,V>
// TreeMap<K,V>
