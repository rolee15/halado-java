package enums;

public enum City {
	BUDAPEST(32685), NEW_YORK(56), GFYEUR(NEW_YORK), GYREGRVBD(4387);

	private final int zipCode;

	City(int zipCode) {
		this.zipCode = zipCode;
	}

	City(City other) {
		this(other.zipCode);
	}

	public int getZipCode() {
		return zipCode;
	}

	@Override
	public String toString() {
		return "%s(%d)".formatted(
			name(), getZipCode()
		);
	}
}
