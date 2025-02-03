class AirObject {
    private String objectName;
    private String objectDetails;
    private MonitoringUnit monitoringUnit;

    public AirObject(String objectName, String objectDetails, MonitoringUnit monitoringUnit) {
        this.objectName = objectName;
        this.objectDetails = objectDetails;
        this.monitoringUnit = monitoringUnit;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getObjectDetails() {
        return objectDetails;
    }

    public MonitoringUnit getMonitoringUnit() {
        return monitoringUnit;
    }
}