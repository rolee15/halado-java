package enums;

public class CityMain {
	public static void main(String[] args) {
		int zip = City.BUDAPEST.getZipCode();
		System.out.println(zip);

		for (var city : City.values()) {
			System.out.println(city);
			System.out.println(city.getZipCode());
		}
	}
}
