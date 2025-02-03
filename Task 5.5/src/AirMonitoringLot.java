class AirMonitoringLot extends AirMonitoringComponent {
    private int capacity;

    public AirMonitoringLot(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    @Override
    public void manage() {
        System.out.println("capacity " + capacity);
    }
}
