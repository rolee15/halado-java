package enums;

public class Level {

    private Weekday sentDay;
    private final int zipCode;

    public Level(int zipCode) {
        this.zipCode = zipCode;
    }

    public Level(City city) {
        this.zipCode = city.getZipCode();
    }

    public void setWeekday(Weekday sentDay) {

        this.sentDay = sentDay;
    }

    public int getZipCode() {
        return zipCode;
    }
}
