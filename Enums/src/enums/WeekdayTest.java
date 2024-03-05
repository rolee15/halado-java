package enums;

import static enums.Weekday.MON;
import static java.lang.System.out;

public class WeekdayTest {
	public static void main(String[] args) {
//		out.println(Weekday.MON.nextDay());
		out.println(MON.nextDay());
		for (var wd : Weekday.values()) {
			out.println(wd.nextDay());
		}

		for (var wd : Weekday.values()) {
			out.println(wd.nextDay(3));
		}

		for (var wd : Weekday.values()) {
//			out.printf("%s %s %s %s\n", wd.getName("hu"));
			out.printf("%s %s %s%n",
				wd,
				wd.getName("hu"),
				wd.getName("en")
//				wd.getName("xyz"),
//				wd.getName("???")
			);
		}
	}
}
