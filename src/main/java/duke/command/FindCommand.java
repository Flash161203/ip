package duke.command;

import duke.tasklist.TaskList;

/**
 * Represents a command that finds the Tasks from the list of Tasks,
 * that have a particular keyword.
 */
public class FindCommand extends Command {

    private final String keyword;

    public FindCommand(String keyword) {
        super(false);
        this.keyword = keyword;
    }

    /**
     * Executes the command by displaying all Tasks from the list of Tasks,
     * that have the given keyword.
     * 
     * @param taskList The TaskList object that manages the list of Tasks.
     */
    @Override
    public void execute(TaskList taskList) {
        taskList.findKeywordInTasks(keyword);
    }
}
