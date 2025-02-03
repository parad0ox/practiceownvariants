class DroneMonitoringStrategy implements MonitoringStrategy {
    @Override
    public void analyzeObject(AirObject object) {
        System.out.println("Drone analyzing object: " + object.getObjectName());
    }

    @Override
    public void respondToObject(AirObject object) {
        System.out.println("Drone responding to object: " + object.getObjectName());
    }

    @Override
    public void cleanupAfterMonitoring(AirObject object) {
        System.out.println("Drone cleanup after monitoring: " + object.getObjectName());
    }
}
