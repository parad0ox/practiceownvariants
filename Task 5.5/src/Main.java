public class Main {
    public static void main(String[] args) {
        AirMonitoringManager manager = new AirMonitoringManager(new Dish());

        AirMonitoringLayout layout = new AirMonitoringLayout("MainLayout", 800, 600);
        AirMonitoringWindow window1 = new AirMonitoringWindow("Window1", 400, 300);
        AirMonitoringWindow window2 = new AirMonitoringWindow("Window2", 200, 150);

        layout.addComponent("Window1", window1);
        layout.addComponent("Window2", window2);

        manager.manageComponent(layout);

        AirObject airObject = new AirObject("Airplane1", "Flying");
        manager.manage(airObject);
    }
}