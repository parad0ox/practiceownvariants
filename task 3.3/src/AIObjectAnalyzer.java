import java.util.Random;

public class AIObjectAnalyzer {
    public enum Action { TRACK, REMOVE, RESTORE }

    public static Action analyzeObject(String objectId) {
        Random random = new Random();
        int decision = random.nextInt(3);
        return Action.values()[decision];
    }
}