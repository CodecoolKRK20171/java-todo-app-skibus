import java.util.Scanner;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{

    static Scanner scanner;
    static TodoList newList = new TodoList();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Press 1 to add task.\nPress 2 to show all tasks.\nPress 3 to change task's status.");
            scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter task to do: ");
                String title = scanner.nextLine();
                newList.addItem(title);
            }

            else if (option.equals("2")) {
                System.out.println(newList.getList());
            }

            else if (option.equals("3")) {
                System.out.println("Which task status you want to change? ");
                String task = scanner.nextLine();

                for(TodoItem item: newList.todoItems) {
                    if (item.getTitle().equals(task)) {
                        if (item.isDone == false) {
                            item.Mark();
                        }
                        else {
                            item.Unmark();
                        }
                    }
                }

            }

            else {
                System.out.println("There is no such option.");
                System.exit(0);
            }

        }
    }
}
