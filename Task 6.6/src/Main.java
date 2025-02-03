public class Main {
    public static void main(String[] args) {
        MonitoringUnit unit = new MonitoringUnit("John", "Doe");
        AirObject object = new AirObject("Drone01", "High altitude surveillance drone", unit);

        MonitoringController controller = new MonitoringController();
        controller.setAirObject(object);

        MonitoringStrategy radarStrategy = new RadarMonitoringStrategy();
        controller.setMonitoringStrategy(radarStrategy);

        MilitaryManager manager = new MilitaryManager(controller);
        manager.run();

        System.out.println("Switching to satellite monitoring...");
        MonitoringStrategy satelliteStrategy = new SatelliteMonitoringStrategy();
        controller.setMonitoringStrategy(satelliteStrategy);
        manager.run();
    }
}