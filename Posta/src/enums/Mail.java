package enums;

public class Mail {

    private Weekday dispatchDay;
    private final int zipCode;

    public Mail(int zipCode) {
        this.zipCode = zipCode;
    }

    public Mail(City city) {
        this.zipCode = city.getZipCode();
    }

    public void setWeekday(Weekday dispatchDay) {

        this.dispatchDay = dispatchDay;
    }

    public int getZipCode() {
        return zipCode;
    }
}
