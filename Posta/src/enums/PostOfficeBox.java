package enums;

import java.util.Map;

public class PostOfficeBox {
	private final City city;
	private final Map<Integer, PostOfficeBox> forwardMap;
	private Weekday today;

	private final Leveleslada[] ladak;
	private int currentLada = 0;

	public PostOfficeBox(City city, Map<Integer, PostOfficeBox> forwardMap, Weekday today, int ladaCount) {
		this.city = city;
		this.forwardMap = forwardMap;
		this.today = today;

		ladak = new Leveleslada[ladaCount];
		for (int i = 0; i < ladak.length; i++) {
			ladak[i] = new Leveleslada();
		}
	}

	public void dispatch(Mail mail) {
		mail.setWeekday(today);
		today = today.nextDay();

		internalTovabbit(mail);
	}

	public int getZipCode() {
		return this.city.getZipCode();
	}

	private void internalTovabbit(Mail mail) {
		if (city.getZipCode() == mail.getZipCode()) {
			levalogat(mail);
		} else {
			tovabbit(mail);
		}
	}

	private void tovabbit(Mail mail) {
		var postafiok2 = forwardMap.get(mail.getZipCode());
		postafiok2.internalTovabbit(mail);
	}

	private void levalogat(Mail mail) {
		ladak[currentLada].betesz(mail);
		currentLada = (currentLada + 1) % ladak.length;
	}
}
