class AirMonitoringWindow extends AirMonitoringComponent {
    private int width;
    private int height;

    public AirMonitoringWindow(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void manage() {
        System.out.println(" dimensions " + width + "x" + height);
    }
}