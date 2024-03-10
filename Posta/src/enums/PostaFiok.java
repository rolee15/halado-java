package enums;

import java.util.Map;

public class PostaFiok {
	private final City city;
	private final Map<Integer, PostaFiok> forwardMap;
	private Weekday today;

	private final Leveleslada[] ladak;
	private int currentLada = 0;

	public PostaFiok(City city, Map<Integer, PostaFiok> forwardMap, Weekday today, int ladaCount) {
		this.city = city;
		this.forwardMap = forwardMap;
		this.today = today;

		ladak = new Leveleslada[ladaCount];
		for (int i = 0; i < ladak.length; i++) {
			ladak[i] = new Leveleslada();
		}
	}

	public void felad(Level level) {
		level.setWeekday(today);
		today = today.nextDay();

		internalTovabbit(level);
	}

	public int getZipCode() {
		return this.city.getZipCode();
	}

	private void internalTovabbit(Level level) {
		if (city.getZipCode() == level.getZipCode()) {
			levalogat(level);
		} else {
			tovabbit(level);
		}
	}

	private void tovabbit(Level level) {
		var postafiok2 = forwardMap.get(level.getZipCode());
		postafiok2.internalTovabbit(level);
	}

	private void levalogat(Level level) {
		ladak[currentLada].betesz(level);
		currentLada = (currentLada + 1) % ladak.length;
	}
}
