public class RestoreUnidentifiedAirObjectCommand extends AbstractCommand {
    private String objectId;

    public RestoreUnidentifiedAirObjectCommand(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public void execute() {
        System.out.println("Removing unidentified air object: " + objectId);
    }

    @Override
    public void undo() {
        System.out.println("Restoring unidentified air object: " + objectId);
    }
}