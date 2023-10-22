package interface_adapter.clear_users;

import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;

// TODO Complete me
public class ClearController {
    private final SignupViewModel signupViewModel;

    // Constructor to inject the SignupViewModel
    public ClearController(SignupViewModel signupViewModel) {
        this.signupViewModel = signupViewModel;
    }

    // Public method to clear user data
    public void clearAllUserData() {
        SignupState clearedState = new SignupState();
        signupViewModel.setState(clearedState);
    }
}
