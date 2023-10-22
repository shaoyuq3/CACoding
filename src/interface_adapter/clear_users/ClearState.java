package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    // A flag to indicate if the clear action was successful
    private boolean isSuccess;

    // An error message to store any error occurred during clearing
    private String errorMessage;

    // Default constructor
    public ClearState() {
        // By default, we haven't done any clear action, so we assume it's not successful
        this.isSuccess = false;
        this.errorMessage = null;
    }

    // Getter and Setter for isSuccess
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    // Getter and Setter for errorMessage
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
