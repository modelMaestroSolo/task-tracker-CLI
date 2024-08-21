import java.util.Arrays;

public class TaskCLI {

    public static void main(String[] args) {
        if(args.length == 0){
            printUsage();
            return;
        }

        String command = args[0];
        String[] commandArgs = Arrays.copyOfRange(args, 1, args.length);

        switch (command){
            case "add":
                handleAdd(commandArgs);
                break;
            case "list done":
                handleDone(commandArgs);
                break;
            case "list todo":
                handleTodo(commandArgs);
                break;
            case "list in-progress":
                handleInProgress(commandArgs);
                break;
        }


    }

    private static void printUsage(){
        System.out.println("Usage:");
        System.out.println("  task-cli add <task description>");
        System.out.println("  task-cli update <id> <new task description>");
        System.out.println("  task-cli delete <id>");
        System.out.println("  task-cli mark-in-progress <id>");
        System.out.println("  task-cli mark-done <id>");
        System.out.println("  task-cli list [done|todo|in-progress]");
    }

    private static void handleAdd(String[] commandArgs){
        // add implementations
        System.out.println("Add command received with args: " + String.join(" ", commandArgs));
    }

    private static void handleDone(String[] commandArgs){
        // list done implementation
        System.out.println("list done command received with args: " + String.join(" ", commandArgs));
    }

    private  static void handleTodo(String[] commandArgs){
        //list to do implementation
        System.out.println("list to do command received with args: " + String.join(" ", commandArgs));
    }

    private static void handleInProgress(String[] commandArgs){
        // list in progress implementation
        System.out.println("list in progress command received with args: " + String.join(" ", commandArgs));
    }
}
