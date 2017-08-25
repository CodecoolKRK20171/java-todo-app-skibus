import java.util.ArrayList;
/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

    ArrayList<TodoItem> todoItems = new ArrayList<TodoItem>();

    public void addItem(String title) {
        TodoItem newItem = new TodoItem(title);
        this.todoItems.add(newItem);
    }


    public String getList() {
        String allItems = "";
        for (TodoItem item: todoItems) {
            String itemTittle = item.getString() + "\n";
            allItems += itemTittle;
        }
    return allItems;
    }
}
