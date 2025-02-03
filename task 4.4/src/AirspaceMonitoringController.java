import java.util.List;
        import java.util.ArrayList;

class AirspaceMonitoringController extends Observable {
    private List <AirspaceAlert> alertHistory = new ArrayList<>();

    public void infoAlert() {
        System.out.println("Displaying all alerts:");
        for (AirspaceAlert alert : alertHistory) {
            System.out.println(alert);
        }
    }

    public void addAlert(AirspaceAlert alert) {
        alertHistory.add(alert);
        notifyObservers(alert);
    }
}
