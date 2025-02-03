public class UnidentifiedAirObject {
    private String name;
    private double altitude;
    private double speed;
    private String type;

    public UnidentifiedAirObject(String name, double altitude, double speed, String type) {
        this.name = name;
        this.altitude = altitude;
        this.speed = speed;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "UnidentifiedAirObject{name='" + name + "', altitude=" + altitude +
                ", speed=" + speed + ", type='" + type + "'}";
    }
}

