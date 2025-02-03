class MonitoringController {
    private AirObject airObject;
    private MonitoringStrategy monitoringStrategy;

    public void setMonitoringStrategy(MonitoringStrategy strategy) {
        this.monitoringStrategy = strategy;
    }

    public void analyzeObject() {
        if (monitoringStrategy != null) {
            monitoringStrategy.analyzeObject(airObject);
        }
    }

    public void respondToObject() {
        if (monitoringStrategy != null) {
            monitoringStrategy.respondToObject(airObject);
        }
    }

    public void cleanupAfterMonitoring() {
        if (monitoringStrategy != null) {
            monitoringStrategy.cleanupAfterMonitoring(airObject);
        }
    }

    public void setAirObject(AirObject airObject) {
        this.airObject = airObject;
    }
}
