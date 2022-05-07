package diaryApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Test
    public void diaryCanBeCreated(){
         Diary diary = new Diary("My Personal Diary", "1234");
         assertNotNull(diary);
    }

    @Test
    public void diaryCanHaveAName() {

        Diary diary = new Diary("My Personal Diary","1234");
        assertEquals("My Personal Diary", diary.getName());
    }

    @Test
    public void diaryCanHaveAPassword() {
        Diary diary = new Diary("My Personal Diary","1234");
        assertTrue(diary.isValid("1234"));
    }

    @Test
    public void diaryHasAnEntryTest(){
        Diary diary = new Diary("My Personal Diary","1234");
        Entry entry = diary.createEntry("Java", "Java is fun");
        diary.addEntry(entry);
        assertEquals(1, diary.getNumberOfEntries());
    }

   @Test
   public void diaryEntryCanBeFound(){
       Diary diary = new Diary("My Personal Diary","1234");
       Entry entry = diary.createEntry("Java", "Java is fun");
       diary.addEntry(entry);
       Entry entry1 = diary.createEntry("Python", "Me and you");
       diary.addEntry(entry1);
       assertEquals("Sat, 07:05:2022, 03:08 pm || Java || Java is fun", diary.findEntry("Java"));
   }

   @Test
   public void diaryEntryCanBeRemoved(){
       Diary diary = new Diary("My Personal Diary","1234");
       Entry entry = diary.createEntry("Java", "Java is fun");
       diary.addEntry(entry);
       Entry entry1 = diary.createEntry("Python", "Me and you");
       diary.addEntry(entry1);
       assertTrue(diary.removeEntry("Java"));
       assertEquals(1, diary.getNumberOfEntries());
   }

   @Test
    void diaryCanBeLocked(){
       Diary diary = new Diary("My Personal Diary","1234");
       assertTrue(diary.isLock("1234"));
   }

   @Test
    void diaryCanBeUnLocked(){
       Diary diary = new Diary("My Personal Diary","1234");
       assertFalse(diary.isLock("1234"));
   }
}
