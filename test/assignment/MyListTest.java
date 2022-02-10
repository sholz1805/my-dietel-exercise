package assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    MyList list;

    @BeforeEach
    public void objectCreator() {
        list = new MyList();
    }

    @Test
//    Given I have a list and it is empty
    public void listIsEmpty() {
        list.isEmpty();
        assertTrue(list.isEmpty());
    }

    @Test
    //to add something to my list
    public void addSomethingToList(){
        list.add("soap");
        list.add("Powder");
        assertArrayEquals(new String[]{"soap","Powder"}, list.getMyOwnList());

        }

    @Test
/////////////   size of my list
    public void knowTheSizeOfMyList(){
        list.add("Mascara");
        list.add("Mary-K");
        assertEquals(2, list.size());
    }


    }


