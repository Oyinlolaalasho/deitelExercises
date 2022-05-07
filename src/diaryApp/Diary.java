package diaryApp;

import java.util.ArrayList;
import java.util.Objects;

public class Diary {

    private String name;
    private String password;
    private ArrayList <Entry> entries;
    private int numberOfEntries;
    private boolean isLock = true;

    public Diary(String name, String password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<Entry>();
    }

    public String getName() {
        return name;
    }
    
    public boolean isValid(String password) {
        return Objects.equals(password, this.password);
    }

    public Entry createEntry(String title, String body) {
        return new Entry(title, body);
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
        numberOfEntries++;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public String findEntry(String entryTitle) {
        for (Entry entry : entries) {
            if (Objects.equals(entryTitle, entry.getTitle()))
                return entry.getDate() + " || " + entry.getTitle() + " || " + entry.getBody();
        }
        return "Not found";
    }

    public boolean removeEntry(String entryTitle) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (Objects.equals(entryTitle, entry.getTitle())) {
                entries.remove(entry);
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    public boolean isLock(String password){
        if (isValid(password))
            return isLock = false;
        return isLock = true;
    }
}
