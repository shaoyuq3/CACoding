package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private final boolean success;
    private final String message;
    private ArrayList name;

    /**
     * Constructs the ClearOutputData.
     *
     * @param success Indicates whether the clear users action was successful.
     * @param message A message providing additional details.
     */
    public ClearOutputData(boolean success, String message, ArrayList name) {
        this.success = success;
        this.message = message;
        this.name = name;

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



    public ArrayList getname() {
        return this.name;
    }
}
