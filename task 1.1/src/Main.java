public class Main {
    public static void main(String[] args) {
        AirspaceMonitoringSystem system = AirspaceMonitoringSystem.getInstance("MainSystem");

        UnidentifiedAirObject ufo1 = new UnidentifiedAirObject("UFO-1", 1200.5, 800.0, "Unknown");
        UnidentifiedAirObject ufo2 = new UnidentifiedAirObject("UFO-2", 1500.0, 600.0, "Drone");

        system.addAirObject(ufo1);
        system.addAirObject(ufo2);

        System.out.println("Total Air Objects: " + system.getAirObjectCount());

        for (UnidentifiedAirObject obj : system.getAirObjects()) {
            System.out.println(system.describeAirObject(obj));
        }

        system.removeAirObject(ufo1);
        System.out.println("Total Air Objects after removal: " + system.getAirObjectCount());
    }
}