
package enums;

import java.util.Map;

public enum Weekday2 {
//	MON("hu:hétfő", "en:Monday"),
//	TUE("en:Tuesday", "hgdikshsi:ghiuer")
	MON(Map.of("hu", "hétfő", "en", "Monday")),
	TUE(Map.of("en", "Tuesday", "hgdikshsi", "ghiuer"))
	;

	private Map<String, String> codeToName;

	Weekday2(Map<String, String> codeToName) {
		this.codeToName = codeToName;
	}

	public String getName(String langCode) {
		return codeToName.get(langCode);
	}
}
