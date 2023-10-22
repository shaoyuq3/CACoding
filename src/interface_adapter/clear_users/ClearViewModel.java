package interface_adapter.clear_users;

// TODO Complete me

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel {
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);


    private ClearState clearState;

    public static final String CLEAR_BUTTON_LABEL = "Clear Users";
    public static final String CLEAR_SUCCESS_MESSAGE = "Users cleared successfully!";
    public static final String CLEAR_FAILURE_MESSAGE = "Failed to clear users.";

    public ClearViewModel() {
        this.clearState = new ClearState();
    }

    public ClearState getClearState() {
        return clearState;
    }

    public void setClearState(ClearState clearState) {
        ClearState oldState = this.clearState;
        this.clearState = clearState;
        support.firePropertyChange("clearState", oldState, clearState);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }


    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
