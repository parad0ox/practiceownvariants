public class AICommandProcessor {
    private AirspaceMonitoringController controller;

    public AICommandProcessor(AirspaceMonitoringController controller) {
        this.controller = controller;
    }

    public void processObject(String objectId) {
        AIObjectAnalyzer.Action action = AIObjectAnalyzer.analyzeObject(objectId);

        AbstractCommand command;
        switch (action) {
            case TRACK:
                command = new TrackUnidentifiedAirObjectCommand(objectId);
                break;
            case REMOVE:
                command = new RestoreUnidentifiedAirObjectCommand(objectId);
                break;
            case RESTORE:
                command = new RestoreUnidentifiedAirObjectCommand(objectId);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + action);
        }

        controller.addCommand(command);
        controller.executeAllPendingCommands();
    }
}