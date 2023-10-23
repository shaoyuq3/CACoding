package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel{


    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("clear");
    }


    private ClearState clearState;

    public static final String CLEAR_BUTTON_LABEL = "Clear Users";
    public static final String CLEAR_SUCCESS_MESSAGE = "Users cleared successfully!";
    public static final String CLEAR_FAILURE_MESSAGE = "Failed to clear users.";


    public ClearState getClearState() {
        return clearState;
    }

    public void setClearState(ClearState clearState) {
        ClearState oldState = this.clearState;
        this.clearState = clearState;
        support.firePropertyChange("clearState", oldState, clearState);
    }


    @Override
    public void firePropertyChanged() {

    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }


    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }


}
