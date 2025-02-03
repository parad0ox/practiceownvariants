class AirMonitoringLayout extends AirMonitoringComponent {
    private int width;
    private int height;

    public AirMonitoringLayout(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void manage() {
        System.out.println ("dimensions " + width + "x" + height);
        for (AirMonitoringComponent component : nestedComponents.values()) {
            component.manage();
        }
    }
}