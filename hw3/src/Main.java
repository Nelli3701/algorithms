public class Main {
    public static void main(String[] args) {
        List list = new List();
        for(int i = 1; i <= 10; i++) {
            list.pushFront(i);
        }
        list.print();
        list.revert();
        list.print();
    }
}