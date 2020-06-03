package _00_Text_Funkifier;

public class Poggers extends SpecialString{

	public Poggers(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String Alphabet = "abcdefghijklmnopqrstuvwxyz";
		String holder = "";
		s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			for(int g = 0; g < Alphabet.length(); g++) {
				if(s.charAt(i) == (Alphabet.charAt(g))) {
					holder += g;
				}
			}
		}
		
		return holder;
		
	}
	
	
}
