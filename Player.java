import java.util.ArrayList;
import java.util.Arrays;

public class Player{
	
	private ArrayList<Integer> hand = new ArrayList<Integer>();
	private int score = 0;
	private String name;
	ArrayList<String> face = new ArrayList<String>(Arrays.asList("Hearts", "Spade", "Diamonds", "Clubs"));
	
	public void describe() {
		System.out.print(name + " has the hand of: ");
		int m = 0;
		for(int num: hand) {
			Card card = new Card();
			card.setName(face.get(m));
			card.describe(num, card.getName());
			m++;
			if(m == 4)
				m=0;
		}
		System.out.print("\n");
	}
	public int flip() {
		int topValue = hand.get(0); 
		hand.remove(0); 
		return topValue;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public ArrayList<Integer> getHand() {
		return hand;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}