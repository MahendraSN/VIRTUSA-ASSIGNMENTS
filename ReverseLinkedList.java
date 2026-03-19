import java.util.LinkedList;
import java.util.Collections;

class ReverseLinkedList {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // Reverse the LinkedList
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}
