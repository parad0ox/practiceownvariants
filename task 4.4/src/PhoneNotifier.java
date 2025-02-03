class PhoneNotifier implements Observer {
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(AirspaceAlert alert) {
        System.out.println("SMS sent to " + phoneNumber + ": " + alert);
    }
}
