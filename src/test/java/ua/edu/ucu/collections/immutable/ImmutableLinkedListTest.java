package ua.edu.ucu.collections.immutable;
import org.junit.Test;
//import static org.junit.Assert.assertEquals;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    
    @Test
    public void testaddFirst() {
        ImmutableLinkedList newList = new ImmutableLinkedList("oldhead");
        String testValue = "newhead";
        ImmutableLinkedList testList = newList.addFirst(testValue);
        assertEquals(testValue, testList.getFirst());
    }

    @Test
    public void testAddLast() throws Exception {
        ImmutableLinkedList newList = new ImmutableLinkedList("oldtail");
        String testValue = "newtail";
        ImmutableLinkedList testList = newList.addLast(testValue);
        System.out.println("Entering testing phase");
        assertEquals(testValue, testList.getLast());
    }

    @Test
    public void testGetFirst() throws Exception {
        ImmutableLinkedList newList = new ImmutableLinkedList("First Element");
        ImmutableLinkedList testList = newList.addFirst("Second Element");
        testList.addLast("Third Element");
        testList.addLast("Fourth Element");
        assertEquals("Second Element", testList.getFirst());
    }

    @Test
    public void testGetLast() throws Exception {
        ImmutableLinkedList newList = new ImmutableLinkedList("First Element");
        ImmutableLinkedList testList = newList.addLast("Last Element");
        assertEquals("Last Element", testList.getLast());
    }

    @Test
    public void testAdd() throws Exception {
        ImmutableLinkedList newList = new ImmutableLinkedList("First Element");
        ImmutableLinkedList testList = newList.add("Last Element");
        assertEquals("Last Element", testList.getLast());
    }

    @Test
    public void testAddIndex() throws Exception{
//        Object[] testArray = new Object[]{8, 29, 10, 32, 54, 13};
        ImmutableLinkedList newList = new ImmutableLinkedList("First element");
        ImmutableLinkedList testList = newList.add(0, "New Element");
        assertEquals("New Element", testList.getFirst());
    }

    @Test
    public void testAddAll() throws Exception {
        Object[] testArray = new Object[]{8, 29, 10, 32, 54, 13};
        ImmutableLinkedList newList = new ImmutableLinkedList();
        ImmutableLinkedList testList = newList.addAll(testArray);
        assertEquals(testArray, testList.toArray());
    }

    public void testAddAllIndex() throws Exception {
        Object[] testArray = new Object[]{8, 29, 10, 32, 54, 13};
        ImmutableLinkedList newList = new ImmutableLinkedList();
        ImmutableLinkedList testList = newList.addAll(testArray);
        assertEquals(testArray, testList);
    }

//    @Test
//    public void testGet() throws Exception {
//        ImmutableLinkedList newList = new ImmutableLinkedList(25);
//
////        System.out.println("testGet size:" + newList.size());
////        System.out.println("Last element:" + newList.getLast());
////        System.out.println(Arrays.toString(newList.toArray()));
//
//        ImmutableLinkedList firstList = newList.addLast("New element 1");
//
//        System.out.println("testGet size:" + firstList.size());
//        System.out.println("Last element:" + firstList.getLast());
//        System.out.println(Arrays.toString(firstList.toArray()));
//
//        ImmutableLinkedList testList = firstList.addLast("New element 2");
//
//        System.out.println("testGet size:" + testList.size());
//        System.out.println("Last element:" + testList.getLast());
//        System.out.println(Arrays.toString(testList.toArray()));
//
//        assertEquals("New element 1", testList.get(1));
//    }

    @Test
    public void testRemove(){

    }

    @Test
    public void testSet(){

    }

    @Test
    public void testIndexOf(){

    }

    @Test
    public void testSize(){
                ImmutableLinkedList newList = new ImmutableLinkedList() ;
//        ImmutableLinkedList newList = new ImmutableLinkedList(500) ;
//        ImmutableLinkedList testList = newLIst.addFirst(208);
        assertEquals(0, newList.size());
    }

    @Test
    public void testClear(){

    }

    @Test
    public void testIsEmpty(){

    }

    @Test
    public void testToArray(){
        ImmutableLinkedList newList = new ImmutableLinkedList(25);
        Object[] testArray = newList.toArray();
        assertEquals(new Object[]{25}, testArray);
    }

    @Test
    public void testToString(){

    }
}
