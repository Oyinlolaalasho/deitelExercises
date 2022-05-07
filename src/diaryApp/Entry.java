package diaryApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title;
    private String body;
    private LocalDateTime date = LocalDateTime.now();

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;

    }


    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mm a");
        return dateTimeFormatter.format(date);
    }
}
