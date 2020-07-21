package _00_Text_Funkifier;

public class AllCapsString extends SpecialString{
	public AllCapsString(String s) {
		super(s);
	}

	
	public String funkifyText(String s) {
		String allCaps = "";
		
		for (int i = 0; i < s.length(); i++) {
			allCaps+=Character.toUpperCase(s.charAt(i));
		}
		
		return allCaps;
	}
}
