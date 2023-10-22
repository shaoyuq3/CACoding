package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{
    private final ClearUserDataAccessInterface dataAccess;

    public ClearInteractor(ClearUserDataAccessInterface dataAccess, ClearOutputBoundary outputBoundary) {
        this.dataAccess = dataAccess;
    }

    @Override
    public void clearAllUsers() {
        dataAccess.clearAllUsers();
    }
}
