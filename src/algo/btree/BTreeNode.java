package algo.btree;

//노드 (BTree의 구성요소)
public class BTreeNode {
    int t;                 // 차수
    int n;                 // 현재 키 개수
    int[] keys;            // 키 배열
    BTreeNode[] children;  // 자식 노드
    boolean isLeaf;        // 노드에 자식 노드가 존재하는지(가지가 뻗어 있는지)

    BTreeNode(int t, boolean isLeaf) {
        this.t = t;
        this.isLeaf = isLeaf;
        this.keys = new int[2 * t - 1];
        this.children = new BTreeNode[2 * t];
        this.n = 0;
    }

    //키 검색 함수
    BTreeNode search(int key) {
        int i = 0;
        while (i < n && key > keys[i]) {
            i++;
        }

        if (i < n && keys[i] == key) {
            return this;
        }

        if (isLeaf) {
            return null;
        }

        return children[i].search(key);
    }

    //노드가 가득 차지 않았을 때, 추가 노드를 삽입하는 함수
    void insertNonFull(int key) {
        int i = n - 1;

        if (isLeaf) {
            // 키를 오른쪽으로 이동
            while (i >= 0 && keys[i] > key) {
                keys[i + 1] = keys[i];
                i--;
            }
            keys[i + 1] = key;
            n++;
        } else {
            while (i >= 0 && keys[i] > key) {
                i--;
            }
            i++;

            if (children[i].n == 2 * t - 1) {
                splitChild(i, children[i]);

                if (key > keys[i]) {
                    i++;
                }
            }
            children[i].insertNonFull(key);
        }
    }

    // 자식 노드 분할
    void splitChild(int i, BTreeNode y) {
        BTreeNode z = new BTreeNode(y.t, y.isLeaf);
        z.n = t - 1;

        // 키 복사
        for (int j = 0; j < t - 1; j++) {
            z.keys[j] = y.keys[j + t];
        }

        // 자식 복사
        if (!y.isLeaf) {
            for (int j = 0; j < t; j++) {
                z.children[j] = y.children[j + t];
            }
        }

        y.n = t - 1;

        // 자식 이동
        for (int j = n; j >= i + 1; j--) {
            children[j + 1] = children[j];
        }
        children[i + 1] = z;

        // 키 이동
        for (int j = n - 1; j >= i; j--) {
            keys[j + 1] = keys[j];
        }
        keys[i] = y.keys[t - 1];
        n++;
    }

    //B-tree 안에 저장된 모든 키들을 출력하기 위한 메서드
    void traverse() {
        int i;
        for (i = 0; i < n; i++) {
            // 리프 노드가 아니면 자식부터 방문
            if (!isLeaf) {
                children[i].traverse();
            }
            System.out.print(keys[i] + " ");
        }
        // 마지막 자식 방문
        if (!isLeaf) {
            children[i].traverse();
        }
    }
}