package interfaces;

public interface ComputeResult {

    static ComputeResult SUCCESS = () -> Status.SUCCESS;
    static ComputeResult FAILURE = () -> Status.FAILURE;

    Status getStatus();

    public static enum Status {
        SUCCESS,
        FAILURE,
        NOT_AN_INTEGER;
    }
}
