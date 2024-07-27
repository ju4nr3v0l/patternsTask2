public class CreateTaskCommand implements Command {
    private TaskManager taskManager;
    private Task task;

    public CreateTaskCommand(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.addTask(task);
    }

    @Override
    public void undo() {
        taskManager.removeTask(task);
    }
}