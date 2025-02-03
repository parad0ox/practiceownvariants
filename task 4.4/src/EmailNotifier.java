class EmailNotifier implements Observer {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void notify(AirspaceAlert alert) {
        System.out.println("Email sent to " + email + ": " + alert);
    }
}
