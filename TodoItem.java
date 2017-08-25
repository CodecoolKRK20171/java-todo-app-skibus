/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{

    private String title;
    boolean isDone;


    public TodoItem(String title){
        this.title = title;
        this.isDone = false;
    }

    public void Mark() {
        isDone = true;
    }

    public void Unmark() {
        isDone = false;
    }

    public String getString() {
        String task = "Title: " + title + " Is done: " + isDone;
        return task;
    }
    public String getTitle() {
        return title;
    }
}
