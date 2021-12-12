package datastructures.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {

    @Test
    public void testIsEmptyReturnTrueOnNewLinkedList(){
        LinkedList<Object> list = new LinkedList<>();

        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyAfClear(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddAndIsEmptyReturnFalse(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        assertFalse(list.isEmpty());
    }

    @Test
    public void testContainsReturnTrue(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        assertTrue(list.contains("Cat"));
    }

    @Test
    public void testLastIndexOfReturnTrue(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");
        list.add("Cat");

        assertEquals(3,list.lastIndexOf("Cat"));
    }

    @Test
    public void testContainsReturnFalseOnEmptyList(){
        LinkedList<Object> list = new LinkedList<>();

        assertFalse(list.contains("Cat"));
    }

    @Test
    public void testGetAfterRemove(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");
        list.add("Snake");

        list.remove(2);
        assertEquals("Snake",list.get(2));
    }

    @Test
    public void testGetAfterSet(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        list.set("Snake",1);
        assertEquals("Snake",list.get(1));
        assertEquals(3,list.size());
    }

    @Test
    public void testAddWithIndexReturnTrue(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");
        list.add("Snake",1);

        assertEquals("Snake",list.get(1));
        assertEquals(4,list.size());

    }

    @Test
    public void testContainsReturnFalse(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        assertFalse(list.contains("Snake"));
    }

    @Test
    public void testRemove(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("Cat");
        list.add("Bird");
        list.add("Butterfly");

        list.remove(1);
        assertEquals(2,list.size());
    }

}
