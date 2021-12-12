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
        } else if (index == (size - 1)) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> currentNode = getNode(index - 1);
            newNode.prev = currentNode;
            currentNode.next = newNode;
            currentNode.next.prev = newNode;
        }

        size ++;

    }

    @Override
    public T remove(int index) {
        if (0 >= index && index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node<T> node = head;
        Node<T> nodePrev;
        Node<T> nodeNext ;
        Node<T> removedNode;
        if (index == 0) {
            removedNode = head;
            if (size == 1) {
                tail = head = null;
            } else {
                head = node.next;
                head.prev = null;
            }
        } else if (index == (size - 1)) {
            removedNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            nodePrev = getNode(index - 1);
            nodeNext = getNode(index + 1);
            removedNode = getNode(index );
            nodeNext.prev = removedNode.prev;
            nodePrev.next = removedNode.next;
            removedNode.prev = removedNode.next = null;
        }
        size--;
        return removedNode.nodeValue;
    }

    @Override
    public T get(int index) {
        if (0 >= index && index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node<T> node = getNode(index);
        return node.nodeValue;
    }

    @Override
    public T set(T value, int index) {
        if (0 >= index && index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node<T> node = getNode(index);
        node.nodeValue = value;

        return node.nodeValue;
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
        for (int i = 0; i < size - 1; i++){
            Node<T> node = getNode(i);
            if(value.equals(node.nodeValue)){
                return true;
            }
        }
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
        for (int i = size - 1 ; i <= size; i--) {
            if (get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }
    private Node<T> getNode(int index) {
        Node<T> current;
        if (size / 2 >= index) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = 0; i < size - index - 1; i++) {
                current = current.prev;
            }
        }
        return current;
    }

}


