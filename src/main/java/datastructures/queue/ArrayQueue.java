package datastructures.queue;

public class ArrayQueue implements Queue {

    private int size;
    private Object[] array;
    public ArrayQueue (){
        array = new Object[10];
    }

    public ArrayQueue(int startQ,int endQ) {
        array = new Object[startQ-endQ];
    }
    
    @Override
    public void enqueue(Object value) {
        if (value == null) {
            throw new NullPointerException("Can`t add null value in queue");
        }
        updateSize();
        Object[] updatQueue = new Object[size + 1];
        updatQueue[0] = value;
        for (int i = 0; i < size; i++) {
            updatQueue[i + 1] = array[i];
        }
        array = updatQueue;
        size++;
    }

    private void updateSize (){
        if (size == array.length) {
            Object[] updatedArray = new Object[array.length * 2];
            System.arraycopy(array, 0, updatedArray, 0, array.length);
            array = updatedArray;
        }
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = array[size - 1];
        size--;
        return result;
    }

    @Override
    public Object peek() {//взять елемент
        if(isEmpty()) {
            System.out.print("No objects to peek");
        }
        return array[size-1];
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
    public boolean contains(Object value) {
        if (value == null) {
            throw new NullPointerException("No such value");
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;

    }
}
