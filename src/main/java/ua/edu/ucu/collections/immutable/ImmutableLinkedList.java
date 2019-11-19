package ua.edu.ucu.collections.immutable;

public final class ImmutableLinkedList implements ImmutableList {
    private Node head;
    private int size;

    private static class Node {
        private Object value;
        private Node next;

        private Node(Object value) {
            this.value = value;
            this.next = null;
        }

        private Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
        public ImmutableLinkedList() {
            this.head = null;
            size = 0;
        }

        public ImmutableLinkedList(Object e) {
            this.head = new Node(e);
            size = 1;
        }

        public ImmutableLinkedList(Object[] c) {
            this();
            if (c.length > 0) {
                this.head = new Node(c[0]);
                Node currentNode = this.head;
                for (int i = 1; i < c.length - 1; i++) {
                    currentNode.next = new Node(c[i]);
                    currentNode = currentNode.next;
                }
                size = c.length;
            }
        }

        private ImmutableLinkedList copyOf() {
            if (this.size == 0) {
                return new ImmutableLinkedList();
            }
            Node oldNode = this.head.next;
            ImmutableLinkedList newList =
                    new ImmutableLinkedList(this.head.value);
            Node currentNode = newList.head.next;
            for (int i = 0; i < size - 1; i++) {
                currentNode.next = new Node(oldNode.value);
                currentNode = currentNode.next;
                oldNode = oldNode.next;
            }
            newList.size = size;
            return newList;
        }

        public ImmutableLinkedList addFirst(Object e) {
            return add(0, e);
        }

        public ImmutableLinkedList addLast(Object e) {
            return add(e);
        }

        public Object getFirst() {
            return get(0);
        }

        public Object getLast() {
            return get(size - 1);
        }

        public ImmutableLinkedList removeFirst() {
            return remove(0);
        }

        public ImmutableLinkedList removeLast() {
            return remove(size - 1);
        }

        public ImmutableLinkedList add(Object e) {
            return add(size, e);
        }

        public ImmutableLinkedList add(int index, Object e) {
            ImmutableLinkedList newList = this.copyOf();
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }
            if (size == 0) {
                return new ImmutableLinkedList(e);
            }
            Node currentNode = newList.getNode(index - 1);
            currentNode.next = new Node(e, currentNode.next);
            size += 1;
            return newList;
        }

        public ImmutableLinkedList addAll(Object[] c) {
            ImmutableLinkedList newList =
                    new ImmutableLinkedList(this);
            for (Object i : c) {
                newList.add(size, i);
            }
            return newList;
        }

        public ImmutableLinkedList addAll(int index, Object[] c) {
            throw new IndexOutOfBoundsException("NI");
        }

        private Node getNode(int index) {
            if (size == 0 || index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode;
        }

        public Object get(int index) {
            return getNode(index).value;
        }

        public ImmutableLinkedList remove(int index) {
            ImmutableLinkedList newList = this.copyOf();
            if (index == 0) {
                newList.head = newList.head.next;
            }
//            Node currentNode = newList.getNode(index - 1);
            Node currentNode =
                    new Node(newList.getNode(index -  1).value);
            currentNode.next = currentNode.next.next;
            size -= 1;
            return newList;
        }

        public ImmutableLinkedList set(int index, Object e) {
            ImmutableLinkedList newList = this.copyOf();
            newList.getNode(index).value = e;
            return newList;
        }

        public int indexOf(Object e) {
            Node currentNode = this.head;
            for (int i = 0; i < size; i++) {
                if (currentNode.value.equals(e)) {
                    return i;
                }
                currentNode = currentNode.next;
            }
            return -1;
        }

        public int size() {
            return size;
        }

        public ImmutableLinkedList clear() {
            return new ImmutableLinkedList();
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public Object[] toArray() {
            Object[] newArray = new Object[size];
            Node currentNode = this.head;
            for (int i = 0; i < size; i++) {
                newArray[i] = currentNode.value;
                currentNode = currentNode.next;
            }
            return newArray;
        }

        public String toString() {
            Node currentNode = this.head;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < size; i++) {
                stringBuilder.append(currentNode.value);
                currentNode = currentNode.next;
            }
            return stringBuilder.toString();
        }
}