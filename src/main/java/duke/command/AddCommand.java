package duke.command;

import duke.task.Task;

import duke.tasklist.TaskList;

/**
 * Represents a command that adds a Task to the list of Tasks.
 */
public class AddCommand extends Command {

    private final Task task;
    private final String taskType;

    public AddCommand(Task task, String taskType) {
        super(false);
        this.task = task;
        this.taskType = taskType;

    }

    @Override
    public void execute(TaskList taskList) {
        taskList.addTask(this.task, this.taskType);
    }

}
