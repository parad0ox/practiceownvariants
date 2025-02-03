class AirMonitoringManager {
    private Dish dish;

    public AirMonitoringManager(Dish dish) {
        this.dish = dish;
    }

    public void manageComponent(AirMonitoringComponent component) {
        component.manage();
    }

    public void manage(AirObject airObject) {
        airObject.manage();
    }
}
