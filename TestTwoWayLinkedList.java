import java.util.ListIterator;

public class TestTwoWayLinkedList {
    public static void main(String[] args) {
        TwoWayLinkedList<String> list = new TwoWayLinkedList<>();
        list.add("London");
        list.add("Paris");
        list.add("New York");
        list.add("San Francisco");
        list.add("Beijing");

        System.out.println("List size: " + list.size());

        ListIterator<String> iterator = list.listIterator();
        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Backward traversal:");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }
}
