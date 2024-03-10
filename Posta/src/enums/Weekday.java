
package enums;

public enum Weekday {
	MON("hétfő", "Monday"),
	TUE("kedd", "Tuesday"),
	WED("szerda", "Wednesday", "xyz"),
	THU,
	FRI(),
	SAT(),
	SUN();

	private final String[] names;
	private static final String[] nameCodes = "hu en xyz".split(" ");

	Weekday(String... names) {
		this.names = names;
	}

	public Weekday nextDay() {
		return nextDay(1);
	}

	public Weekday nextDay(int dayCount) {
		int idx = this.ordinal();
		var weekdays = Weekday.values();
		var weekDaysCount = weekdays.length;
		int nextIdx = (idx + dayCount) % weekDaysCount;
		return weekdays[nextIdx];
	}

	public String getName(String langCode) {
		int idx = findIdx(langCode);
		return idx == -1 ? "???" : names[idx];
	}

	private static int findIdx(String langCode) {
		int idx = 0;
		for (String nameCode : nameCodes) {
			if (nameCode.equals(langCode)) return idx;
			++idx;
		}

		return -1;
	}
}
