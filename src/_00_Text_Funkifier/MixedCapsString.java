package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixedCaps = "";
		
		for (int i= 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				mixedCaps+=Character.toUpperCase(s.charAt(i));
			}
			else {
				mixedCaps+=Character.toLowerCase(s.charAt(i));
			}
		}
		
		return mixedCaps;
	}

}
