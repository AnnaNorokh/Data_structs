package datastructures.list;

public class LinkedList<T> implements List<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    private static class Node<T> {

        Node<T> next;
        Node<T> prev;
        T nodeValue;

        public Node(T value) {
            this.nodeValue = value;
        }
    }

    @Override
    public void add(T value) {
        add(value, size);
    }

    @Override
    public void add(T value, int index) {
        Node<T> newNode = new Node<>(value);
        if (size == 0) {
            head = tail = newNode;
        } else if (index == size - 1) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public T remove(int index) {
        if (0 >= index && index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }


        return null;
    }

    @Override
    public T get(int index) {
        if (0 >= index && index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        return null;
    }

    @Override
    public T set(T value, int index) {
        if (0 >= index && index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }


        return null;
    }


    @Override
    public void clear() {
        tail = null;
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public int indexOf(T value) {
        for (int i = size - 1; i >= 0; i--) {
            if (get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = 0; i <= size; i--) {
            if (get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }

}


