package algo.btree;

//BTreeNode를 노드로 사용하는 B-Tree 컬렉션
public class BTree {
    //맨 꼭대기 노드
    BTreeNode root;
    //차수
    int t;

    BTree(int t) {
        //BTree 생성자
        this.t = t;
        root = new BTreeNode(t, true);
    }

    void insert(int key) {
        BTreeNode r = root;
        if (r.n == 2 * t - 1) {
            BTreeNode s = new BTreeNode(t, false);
            root = s;
            s.children[0] = r;
            s.splitChild(0, r);
            s.insertNonFull(key);
        } else {
            r.insertNonFull(key);
        }
    }

    BTreeNode search(int key) {
        return root == null ? null : root.search(key);
    }

    void traverse() {
        if (root != null) {
            root.traverse();
        }
    }
}
