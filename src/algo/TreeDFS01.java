package algo;


class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
    }
}

public class TreeDFS01 {
    // 전위 순회 (Preorder DFS)
    static void dfs(Node node) {
        if (node == null) return;

        System.out.println(node.value); // 방문
        dfs(node.left);                 // 왼쪽 자식
        dfs(node.right);                // 오른쪽 자식
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        dfs(root);
    }
}
