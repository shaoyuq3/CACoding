package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;

public class ClearPresenter {
    private final SignupViewModel signupViewModel;

    // Constructor to inject the SignupViewModel
    public ClearPresenter(SignupViewModel signupViewModel) {
        this.signupViewModel = signupViewModel;
    }

    // Method to be called when the clear action is triggered from the view
    public void onClearAction() {
        // Clear the data in the ViewModel
        SignupState clearedState = new SignupState();
        signupViewModel.setState(clearedState);
    }
}
