public class Main {
    public static void main(String[] args) {
        // MyLinkedList 객체 생성
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // 데이터 추가
        list.add(5);
        list.add(10);
        list.add(15);

        // 데이터 출력
        System.out.println("인덱스 0의 데이터: " + list.get(0)); // 출력: 5
        System.out.println("인덱스 1의 데이터: " + list.get(1)); // 출력: 10
        System.out.println("인덱스 2의 데이터: " + list.get(2)); // 출력: 15

        // 데이터 삭제
        list.delete(1); // 인덱스 1의 데이터 삭제

        // 데이터 출력
        System.out.println("삭제 후 인덱스 1의 데이터: " + list.get(1)); // 출력: 15
        System.out.println("리스트의 크기: " + list.size()); // 출력: 2
    }
}
