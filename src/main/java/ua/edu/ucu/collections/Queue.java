package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
        private ImmutableLinkedList queue;

        public Queue() {
            queue = new ImmutableLinkedList();
        }

        public Object peek() {
            return queue.getFirst();
        }

        public void enqueue(Object e) {
            queue = queue.addLast(e);
        }

        public Object dequeue() {
            Object e = queue.getFirst();
            queue = queue.removeFirst();
            return e;
        }
}
