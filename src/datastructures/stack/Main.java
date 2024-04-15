package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.getHeight();
        myStack.getTop();

        myStack.printStack();
        System.out.println("----------------------------");

        System.out.println("Push");
        myStack.push(2);
        myStack.printStack();
        System.out.println("----------------------------");

        System.out.println("Pop");
        myStack.printStack();
        System.out.println("Popped item: " + myStack.pop().value);
        myStack.printStack();
        System.out.println("----------------------------");
    }
}
