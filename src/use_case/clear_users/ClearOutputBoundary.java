package use_case.clear_users;


public interface ClearOutputBoundary {

    void prepareSuccessView(ClearOutputData user);

    void presentClearUsersOutput(ClearOutputData outputData);
}
