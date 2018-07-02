class Qien{

	public static void main(String[] args){
		
		int leeftijd = 16;
		int geenAlcohol = 16;
		int alleenBierOfWijn = 18;
		
		if(leeftijd < geenAlcohol){
			System.out.println("Je mag helaas geen alcohol, je bent jonger dan 16");		
		}else{
			if(leeftijd >= geenAlcohol && leeftijd <= alleenBierOfWijn){
				System.out.println("Je mag alleen bier of wijn, je bent tussen de 16 en 18");
			}else{
				System.out.println("Je mag drinken wat je wil, proost");
			}
			System.out.println("extra lijn");		
		}
	}
}