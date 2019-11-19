package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList stack;

    public Stack() {
        stack = new ImmutableLinkedList();
    }

    Object peek() {
        return stack.getFirst();
    }

    Object pop() {
        Object element = stack.getFirst();
        stack = stack.removeFirst();
        return element;
    }

    void push(Object e) {
        stack = stack.addFirst(e);
    }
}
