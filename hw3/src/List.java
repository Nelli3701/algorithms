public class List {
    static Node head;

    private class Node {
        private Node next;
        private int value;
    }

    //добавление в список
    public void pushFront(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    //разворот
    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    //печать
    public static void print(){
        Node cur = head;
        while(cur != null){
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }
}
