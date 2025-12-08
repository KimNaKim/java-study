package ex06;

class MyLinkedList {
    Node root;

    public void searchKey(String key){
        Node n = this.root;
        while(n != null){
            if(n.getKey().equals(key)){
                System.out.println(key + "의 값은 " +n.getValue() + "입니다.");
                return;
            }
            n = n.getNext();
        }
        System.out.println(key + "의 값은 해당 리스트 안에 존재하지 않습니다.");
    }

    public void add(Node node){
        if(this.root == null){
            this.root = node;
        }
        Node n = this.root;
        while(n.getNext() != null){
            n = n.getNext();
        }
        n.setNext(node);
    }

    public void remove(Node node){
        Node n = this.root;
        while(n.getNext() != null){
            if(this.root == node){
                this.root = n.getNext();
                break;
            }
            if(n.getNext() == node){
                n.setNext(n.getNext().getNext());
                break;
            }
            n = n.getNext();
        }
    }

    public void printList(){
        Node n = this.root;
        while(n != null){
            System.out.println(n.getKey() + " : " + n.getValue());
            n = n.getNext();
        }
    }
}

class Node{
    private String key;
    private String value;
    private Node next;
    public Node(String key, String value, Node next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    //게터&세터
    public void setNext(Node next) {
        this.next = next;

    }
    public void setKey(String key) {
        this.key = key;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    public Node getNext() {
        if(this.next!= null){
            return next;
        } else {
            return null;
        }
    }
}


public class MyList01 {
    static void main() {
        //1. 첫번째 노드
        Node n1 = new Node("name","홍길동",null);

        //2. 두번째 노드
        Node n2 = new Node("age", "21", null);
        
        //3. 세번째 노드
        Node n3 = new Node("weight", "65", null);

        //4. 네번째 노드
        Node n4 = new Node("height", "180", null);

        MyLinkedList mLinkList = new MyLinkedList();
        mLinkList.root = n1;
        Node n5 = new Node("hobby", "swordFighting", null);
        mLinkList.add(n2);
        mLinkList.add(n3);
        mLinkList.add(n4);
        mLinkList.add(n5);
        mLinkList.searchKey("hobby");
        mLinkList.printList();
        System.out.println();
        mLinkList.remove(n1);
        mLinkList.remove(n2);
        mLinkList.printList();
        mLinkList.searchKey("name");


    }
}
