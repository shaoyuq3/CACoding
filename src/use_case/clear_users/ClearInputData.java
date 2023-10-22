package use_case.clear_users;

// TODO Complete me

public class ClearInputData {
    private int daysInactive;

    public ClearInputData() {
    }
    public ClearInputData(int daysInactive) {
        this.daysInactive = daysInactive;
    }

    public int getDaysInactive() {
        return daysInactive;
    }

    public void setDaysInactive(int daysInactive) {
        this.daysInactive = daysInactive;
    }

}
