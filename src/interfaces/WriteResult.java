package src.interfaces;

public interface WriteResult {

    WriteResultStatus getStatus();

    public static enum WriteResultStatus {
        SUCCESS,
        FAILURE;
    }
}
