import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println("Task Manager Menu: ");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");

            System.out.println("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTask();
                    break;
                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void addTask() {
        scanner.nextLine();
        System.out.println("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully");
    }

    private static void removeTask() {
        System.out.println("Enter the task number to remove: ");
        int taskNumber =  scanner.nextInt();
        if (isValidTaskNumber(taskNumber)) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number. Please enter a valid task number.");
        }
    }

    private static void listTask() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Task List: ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >= 1 && taskNumber <= tasks.size();
    }

}
