class SysLogNotifier implements Observer {
    private String logName;

    public SysLogNotifier(String logName) {
        this.logName = logName;
    }

    @Override
    public void notify(AirspaceAlert alert) {
        System.out.println("Log entry in " + logName + ": " + alert);
    }
}