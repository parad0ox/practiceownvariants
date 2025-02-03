import java.util.HashMap;
import java.util.Map;
abstract class AirMonitoringComponent {
    protected String name;
    protected Map<String, AirMonitoringComponent> nestedComponents = new HashMap<>();

    public AirMonitoringComponent(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addComponent(String name, AirMonitoringComponent component) {
        nestedComponents.put(name, component);
    }

    public void removeComponent(String name) {
        nestedComponents.remove(name);
    }

    public abstract void manage();
}