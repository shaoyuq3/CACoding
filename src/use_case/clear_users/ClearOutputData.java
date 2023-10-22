package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private final boolean success;
    private final String message;

    /**
     * Constructs the ClearOutputData.
     *
     * @param success Indicates whether the clear users action was successful.
     * @param message A message providing additional details.
     */
    public ClearOutputData(boolean success, String message) {
        this.success = success;  // Explicitly initialize here
        this.message = message;
    }

    /**
     * Checks if the clear users action was successful.
     *
     * @return True if successful; false otherwise.
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Retrieves the message.
     *
     * @return The message.
     */
    public String getMessage() {
        return message;
    }
}
