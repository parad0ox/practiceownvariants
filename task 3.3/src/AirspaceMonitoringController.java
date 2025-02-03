import java.util.ArrayList;
import java.util.List;

public class AirspaceMonitoringController {
    private List<AbstractCommand> commandToExecute = new ArrayList<>();
    private List<AbstractCommand> commandHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commandToExecute.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commandToExecute.remove(command);
    }

    public void undoCommand(AbstractCommand command) {
        command.undo();
        commandHistory.remove(command);
    }

    public void executeAllPendingCommands() {
        for (AbstractCommand command : commandToExecute) {
            command.execute();
            commandHistory.add(command);
        }
        commandToExecute.clear();
    }

    public void undoChanges(int changesToUndo) {
        for (int i = 0; i < changesToUndo && !commandHistory.isEmpty(); i++) {
            AbstractCommand command = commandHistory.remove(commandHistory.size() - 1);
            command.undo();
        }
    }

    public List<AbstractCommand> getCommandHistory() {
        return new ArrayList<>(commandHistory);
    }
}