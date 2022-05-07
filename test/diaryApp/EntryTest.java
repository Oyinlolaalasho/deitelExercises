package diaryApp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {

    @Test
    public void testEntry() {

        Entry entry = new Entry("I love Java", "Why i love Java");
        assertNotNull(entry);
    }

    @Test
    public void entryHasTitleTest(){

        Entry entry = new Entry("I love Java", "Why i love Java");
        assertEquals("I love Java", entry.getTitle());
    }

    @Test
    public void entryHasBodyTest(){

        Entry entry = new Entry("I love Java", "Why i love Java");
        assertEquals("Why i love Java", entry.getBody());
    }

    @Test
    public void entryHasADateTest(){

        Entry entry = new Entry("I love Java", "Why i love Java");
        assertEquals("Sat, 07:05:2022, 02:06 pm", entry.getDate());
    }
}
