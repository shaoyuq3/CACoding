package interface_adapter.clear_users;

import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearInputBoundary;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUseCaseInteractor){
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute(){
        clearUseCaseInteractor.execute();
    }
}
