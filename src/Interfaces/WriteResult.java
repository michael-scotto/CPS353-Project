package src.Interfaces;

public interface WriteResult {

    WriteResultStatus getStatus();

    public static enum WriteResultStatus {
        SUCCESS,
        FAILURE;
    }
}
