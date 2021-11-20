package datastructures.list;

public class ArrayList implements List {
    private Object[] list;
    private int size;

    public ArrayList() {
        list = new Object[5];
    }

    @Override
    public void add(Object value) {
        list[size] = value;
        size++;
    }

    public void ensureCapacity(){
        Object[] increasedList =  new Object[(int) (list.length * 1.5)];
        System.arraycopy(list, 0, increasedList, 0, list.length);
        list = increasedList;
    }

    @Override
    public void add(Object value, int index) {
        if (value == null) {
            throw new NullPointerException("You can`t add null");
        }
        ensureCapacity();
        System.arraycopy(list, index, list, index + 1, size - index);
        size++;
        list[index] = value;
    }

    @Override
    public Object remove(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        Object removedElement = list[index];
        System.arraycopy(list, index + 1, list, index, size - index - 1);
        list[size - 1] = null;
        size--;
        return removedElement;
    }

    @Override
    public Object get(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list[index];
    }

    @Override
    public Object set(Object value, int index) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        Object setValue = list[index];
        list[index] = value;
        return setValue;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
           if(list[i].equals(value)) {
               return i;
           }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object value) {
        for (int i = size - 1; i > 0; i--) {
            if(list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
/*
    public String toString(){
        return "value='" + value +
                '}';
    }
*/
}
