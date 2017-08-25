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
            String option = scanner.next();

            if (option.equals("1")) {
                System.out.println("Enter task to do: ");
                scanner = new Scanner(System.in);
                String title = scanner.nextLine();
                scanner.close()
                newList.addItem(title);
            }

            else if (option.equals("2")) {
                System.out.println(newList.getList());
            }

            else if (option.equals("3")) {
                System.out.println("Which task status you want to change? ");
                scanner = new Scanner(System.in);
                String task = scanner.nextLine();
                scanner.close()

                for(int i = 0; i < newList.todoItems.size(); i++) {
                    if (newList.todoItems.get(i).getTitle().equals(task)) {
                        if (newList.todoItems.get(i).isDone == false) {
                            newList.todoItems.get(i).Mark();
                        }
                        else {
                            newList.todoItems.get(i).Unmark();
                        }
                    }

                    else {
                        System.out.println("There is no such task.");
                        System.exit(0);
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
