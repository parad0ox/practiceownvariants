public class Main {
    public static void main(String[] args) {
        AirspaceMonitoringController controller = new AirspaceMonitoringController();

        AbstractCommand trackCommand = new TrackUnidentifiedAirObjectCommand("UFO-123");
        AbstractCommand removeCommand = new RemoveUnidentifiedAirObjectCommand("UFO-123");
        AbstractCommand restoreCommand = new RestoreUnidentifiedAirObjectCommand("UFO-123");

        controller.addCommand(trackCommand);
        controller.addCommand(removeCommand);

        System.out.println("Executing all pending commands...");
        controller.executeAllPendingCommands();

        System.out.println("\nUndoing last operation...");
        controller.undoChanges(1);

        System.out.println("\nRestoring the object...");
        controller.addCommand(restoreCommand);
        controller.executeAllPendingCommands();
    }
}