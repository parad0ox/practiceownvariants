import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class AirspaceAlert {
    private AlertSeverity severity;
    private String message;
    private String objectId;
    private LocalDate timestamp;
    private String actionRequired;

    public AirspaceAlert(AlertSeverity severity, String message, String objectId, LocalDate timestamp, String actionRequired) {
        this.severity = severity;
        this.message = message;
        this.objectId = objectId;
        this.timestamp = timestamp;
        this.actionRequired = actionRequired;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public String getObjectId() {
        return objectId;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getActionRequired() {
        return actionRequired;
    }

    @Override
    public String toString() {
        return "AirspaceAlert{" +
                "severity=" + severity +
                ", message='" + message + '\'' +
                ", objectId='" + objectId + '\'' +
                ", timestamp=" + timestamp +
                ", actionRequired='" + actionRequired + '\'' +
                '}';
    }
}
