package stacks;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(8);
        myStack.push(88);
        myStack.push(888);
        myStack.push(8888);
        myStack.push(88888);
        myStack.printStack();
        
        System.out.println("POPed item: "+myStack.pop().value);
        myStack.printStack();
    }
}
