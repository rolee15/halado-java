
package enums;

public enum Weekday {
	MON("hétfő", "Monday"),
	TUE(new String[]{ "kedd", "Tuesday" }),
	WED("szerda", "Wednesday", "xyz"),
	THU,
	FRI(),
	SAT(new String[0]),
	SUN(new String[] {});

//	private String huName;
//	private String enName;
	private String[] names;
//	private static String[] nameCodes = {"hu", "en", "xyz"};
	private static final String[] nameCodes = "hu en xyz".split(" ");

	Weekday(String... names) {
		this.names = names;
	}

//	Weekday(String huName, String enName) {
//		this.huName = huName;
//		this.enName = enName;
//	}

	public Weekday nextDay() {
		return nextDay(1);
	}

//	public Weekday nextDay(int dayCount = 1) {
	public Weekday nextDay(int dayCount) {
		int idx = this.ordinal();
		var weekdays = Weekday.values();
		var weekDaysCount = weekdays.length;
		int nextIdx = (idx + dayCount) % weekDaysCount;
		return weekdays[nextIdx];
	}

	public String getName(String langCode) {
		int idx = findIdx(langCode);
//		int idx = Arrays.asList(nameCodes).indexOf(langCode);
//		int idx = asList(nameCodes).indexOf(langCode);
//		var idx = Arrays.indexOf(langCode);

//		if (idx == -1)    throw new IllegalArgumentException();

//		if (idx == -1)    return "???";
//		return names[idx];

//		return "???" if idx == -1 else names[idx];
		return idx == -1 ? "???" : names[idx];
	}

	private static int findIdx(String langCode) {
		int idx = 0;
		for (String nameCode : nameCodes) {
			if (nameCode.equals(langCode))   return idx;
			++idx;
		}

		return -1;
//		return Integer.MIN_VALUE;
	}

//	public String getHuName() {
//		return huName;
//	}
//
//	public String getEnName() {
//		return enName;
//	}
}
