class AirObject {
    private String status;
    private String objectIdentifier;

    public AirObject(String objectIdentifier, String status) {
        this.objectIdentifier = objectIdentifier;
        this.status = status;
    }

    public void trackObject(String identifier) {
        System.out.println("Tracking object: " + identifier);
    }

    public void removeObject() {
        System.out.println("Removing object: " + objectIdentifier);
    }

    public void manage() {
        System.out.println("Managing object: " + objectIdentifier + " with status " + status);
    }
}