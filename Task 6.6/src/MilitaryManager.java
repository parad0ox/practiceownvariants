class MilitaryManager {
private MonitoringController monitoringController;

public MilitaryManager(MonitoringController monitoringController) {
    this.monitoringController = monitoringController;
}
    public void run() {
        monitoringController.analyzeObject();
        monitoringController.respondToObject();
        monitoringController.cleanupAfterMonitoring();
    }
}
