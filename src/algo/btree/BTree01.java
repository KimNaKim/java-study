package algo.btree;

public class BTree01 {

    static void main() {
        BTree btree = new BTree(3); // 차수 t = 3

        int[] values = {10, 20, 5, 6, 12, 30, 7, 17};
        for (int v : values) {
            btree.insert(v);
        }

        System.out.print("B-Tree 순회 결과: ");
        btree.traverse();
        System.out.println();

        int key = 12;
        System.out.println(
                key + " 검색 결과: " +
                        (btree.search(key) != null ? "존재함" : "없음")
        );
    }
}
