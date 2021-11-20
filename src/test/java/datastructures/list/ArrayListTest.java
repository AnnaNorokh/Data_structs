package datastructures.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*  void add(Object value);
    void add(Object value, int index);
    Object remove(int index);

    Object get(int index);

    Object set(Object value, int index);

    void clear();

    int size();

    boolean isEmpty();

    boolean contains(Object value);

    int indexOf(Object value);

    int lastIndexOf(Object value);*/

public class ArrayListTest {

    @Test
    public void testIsEmptyReturnTrueOnNewArrayList(){
        ArrayList list = new ArrayList();

        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyAfClear(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddAndIsEmptyReturnFalse(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        assertFalse(list.isEmpty());
    }

    @Test
    public void testContainsOnEmptyArrayListReturnFalse(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        assertFalse(list.contains("Cat"));

        list.clear();

        assertFalse(list.contains("Cat"));
    }

    @Test
    public void testContainsAfterRemoveReturnFalse(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        assertTrue(list.contains("Cat"));

        list.remove(0);
        assertFalse(list.contains("Cat"));
    }

    @Test
    public void testLastIndexOf(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");
        list.add("Cat");
       list.add("Butterfly");

        assertEquals(5,list.size());
        assertEquals(3,list.lastIndexOf("Cat"));
    }

    @Test
    public void testGetAndRemove(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        list.get(1);
        list.remove(1);
        assertEquals("Butterfly",list.get(1));
    }

    @Test
    public void testSetAndGet(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        list.set("Snake",1);
        list.set("Snake",2);

        assertEquals("Snake",list.get(1));
        assertEquals("Snake",list.get(2));
    }

    @Test
    public void testAddWithIndex(){
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        list.add("Snake",2);
        assertEquals("Snake",list.get(2));
        assertEquals(4,list.size());
    }
}
