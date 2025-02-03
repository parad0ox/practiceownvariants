interface MonitoringStrategy {
    void analyzeObject(AirObject object);
    void respondToObject(AirObject object);
    void cleanupAfterMonitoring(AirObject object);
}
