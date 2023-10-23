package interface_adapter.clear_users;


import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData user){
        ClearState clearState = clearViewModel.getState();
        clearState.setUserAccount(user.getname());
        this.clearViewModel.setClearState(clearState);
        clearViewModel.firePropertyChanged();
    }

    @Override
    public void presentClearUsersOutput(ClearOutputData outputData) {

    }
}
