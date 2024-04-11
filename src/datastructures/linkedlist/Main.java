package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.printList();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.append(5);
        linkedList.append(2);
        linkedList.printList();

        LinkedList.Node node = linkedList.removeLast();
        System.out.println(node.value);
        linkedList.printList();

        System.out.println("Prepend");
        linkedList.prepend(9);
        linkedList.printList();
        System.out.println("------------------------");

        System.out.println("Remove first");
        System.out.println("First:" + linkedList.removeFirst().value);
        linkedList.printList();
        System.out.println("------------------------");

        System.out.println("Get");
        linkedList.append(7);
        linkedList.printList();
        System.out.println("Node at given index: "+ linkedList.get(2).value);
        System.out.println("------------------------");

        System.out.println("Set");
        linkedList.printList();
        linkedList.set(1, 10);
        System.out.println("After setting: ");
        linkedList.printList();
        System.out.println("------------------------");

        System.out.println("Insert");
        linkedList.printList();
        linkedList.insert(1, 15);
        System.out.println("After inserting: ");
        linkedList.printList();
        System.out.println("------------------------");

        System.out.println("Reverse");
        linkedList.reverse();
        linkedList.printList();
        System.out.println("------------------------");
    }
}