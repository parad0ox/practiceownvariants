import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirspaceMonitoringSystem {
    private List<UnidentifiedAirObject> objects = new ArrayList<>();
    private String name;
    private String identifier;
    private static Map<String, AirspaceMonitoringSystem> instances = new HashMap<>();

    private AirspaceMonitoringSystem(String name) {
        this.name = name;
    }

    public static AirspaceMonitoringSystem getInstance(String name) {
        return instances.computeIfAbsent(name, AirspaceMonitoringSystem::new);
    }

    public boolean addAirObject(UnidentifiedAirObject object) {
        return objects.add(object);
    }

    public boolean removeAirObject(UnidentifiedAirObject object) {
        return objects.remove(object);
    }

    public String describeAirObject(UnidentifiedAirObject object) {
        return object.toString();
    }

    public UnidentifiedAirObject getAirObject(String name) {
        return objects.stream()
                .filter(obj -> obj.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<UnidentifiedAirObject> getAirObjects() {
        return new ArrayList<>(objects);
    }

    public long getAirObjectCount() {
        return objects.size();
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}