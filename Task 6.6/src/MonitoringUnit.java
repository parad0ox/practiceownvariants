class MonitoringUnit {
    private String firstName;
    private String lastName;

    public MonitoringUnit(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}


class RadarMonitoringStrategy implements MonitoringStrategy {
    @Override
    public void analyzeObject(AirObject object) {
        System.out.println("Radar analyzing object: " + object.getObjectName());
    }

    @Override
    public void respondToObject(AirObject object) {
        System.out.println("Radar responding to object: " + object.getObjectName());
    }

    @Override
    public void cleanupAfterMonitoring(AirObject object) {
        System.out.println("Radar cleanup after monitoring: " + object.getObjectName());
    }
}
