package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] buddy = new char[s.length()];
		int counter = 0;
		for(int i = s.length()-1; i > -1; i--) {
			buddy[counter] = s.charAt(i);
			counter++;
		}
		String bubby = "";
		for(int g = 0; g < buddy.length; g++) {
			bubby += buddy[g];
		}
		return bubby;
	}

}
