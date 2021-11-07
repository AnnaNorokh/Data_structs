package datastructures.queue;

public class ArrayQueue implements Queue {

    private  int size;
    int startQ, endQ;
    private Object[] array;

    public ArrayQueue (){
        array = new Object[10];
    }

    public ArrayQueue(int size) {
        array = new Object[size];
    }

    @Override
    public void enqueue(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        Object result = array[size-1];
        size--;
        return result;
    }

    @Override
    public Object peek() {//взять елемент
        if(isEmpty()) {
            System.out.printf("No objects to peek");
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
        return false;
    }   //вклюсает

    @Override
    public void clear() {
        size =0;
    }
}
