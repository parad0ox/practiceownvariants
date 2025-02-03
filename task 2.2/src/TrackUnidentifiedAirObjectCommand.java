public class TrackUnidentifiedAirObjectCommand extends AbstractCommand {
    private String objectId;

    public TrackUnidentifiedAirObjectCommand(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public void execute() {
        System.out.println("Tracking unidentified air object: " + objectId);
    }

    @Override
    public void undo() {
        System.out.println("Stopped tracking unidentified air object: " + objectId);
    }
}