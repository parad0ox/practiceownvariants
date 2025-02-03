class SatelliteMonitoringStrategy implements MonitoringStrategy {
    @Override
    public void analyzeObject(AirObject object) {
        System.out.println("Satellite analyzing object: " + object.getObjectName());
    }

    @Override
    public void respondToObject(AirObject object) {
        System.out.println("Satellite responding to object: " + object.getObjectName());
    }

    @Override
    public void cleanupAfterMonitoring(AirObject object) {
        System.out.println("Satellite cleanup after monitoring: " + object.getObjectName());
    }
}
