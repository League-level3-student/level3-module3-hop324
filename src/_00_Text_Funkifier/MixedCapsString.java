package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String shiny = s;
		String tynamo = "";
		for(int i = 0; i< s.length(); i++) {
			if(i%2 == 1) {
				System.out.println(shiny.substring(i, i+1).toUpperCase());
				 tynamo += shiny.substring(i, i+1).toUpperCase();
				//System.out.println(shiny);
			}
			else {
				tynamo += shiny.substring(i, i+1).toLowerCase();
				//System.out.println(shiny);
			}
		}
		//System.out.println(shiny);
		return tynamo;
	}

}
