class TelegramNotifier implements Observer {
    private String userId;
    private boolean isInstant;

    public TelegramNotifier(String userId, boolean isInstant) {
        this.userId = userId;
        this.isInstant = isInstant;
    }

    @Override
    public void notify(AirspaceAlert alert) {
        System.out.println("Telegram message to user " + userId + " (instant: " + isInstant + "): " + alert);
    }
}