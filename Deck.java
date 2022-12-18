import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Deck {
	
	ArrayList<Integer> cards = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14, 2,3,4,5,6,7,8,9,10,11,12,13,14, 2,3,4,5,6,7,8,9,10,11,12,13,14, 2,3,4,5,6,7,8,9,10,11,12,13,14));
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public int draw(){
		int topValue = cards.get(0); 
		cards.remove(0); 
		return topValue;
	}
	

}