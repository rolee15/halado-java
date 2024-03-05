package enums;

import java.util.Map;

public class PostaFiok {
	private City city;
	private Map<Integer, PostaFiok> tovabbitas;
	private Weekday today;

	private Leveleslada[] ladak;
//	private int currentLada;
	private int currentLada = 0;

	public PostaFiok(City city, Map<Integer, PostaFiok> tovabbitas, Weekday today, int ladaCount) {
		this.city = city;
		this.tovabbitas = tovabbitas;
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

	private void internalTovabbit(Level level) {
		if (city.getZipCode() == level.getZipCode()) {
//			if (city.getZipCodes().contains(level.getZipCode())) {
			levalogat(level);
		} else {
			tovabbit(level);
		}
	}

	private void tovabbit(Level level) {
		var postafiok2 = tovabbitas.get(level.getZipCode());
		postafiok2.internalTovabbit(level);
	}

	private void levalogat(Level level) {
		ladak[currentLada].betesz(level);
		currentLada = (currentLada + 1) % ladak.length;
//		currentLada = currentLada == ladak.length - 1 ? 0 : currentLada + 1;
	}
}
