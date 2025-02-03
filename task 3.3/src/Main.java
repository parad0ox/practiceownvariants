public class Main {
    public static void main(String[] args) {
        AirspaceMonitoringController controller = new AirspaceMonitoringController();
        AICommandProcessor aiProcessor = new AICommandProcessor(controller);

        System.out.println("AI is analyzing air objects...");
        aiProcessor.processObject("UFO-321");
        aiProcessor.processObject("UFO-654");

        System.out.println("\nCommand history:");
        for (AbstractCommand command : controller.getCommandHistory()) {
            System.out.println(command.getClass().getSimpleName() + " executed.");
        }
    }
}