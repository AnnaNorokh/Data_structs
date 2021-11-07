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

    }

    @Override
    public Object dequeue() {
        return null;
    }

    @Override
    public Object peek() {//взять елемент
        if(isEmpty()) {
            System.out.printf("");
        }
        return array[startQ-1];
    }

    @Override
    public int size() {
        return endQ - startQ;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }   //вклюсает

    @Override
    public void clear() {
        array = new Object[0];
        endQ = 0;
        startQ = 0;

    }
}
