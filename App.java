
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player player1 = new Player();
		
		Player player2 = new Player();
		
		deck.shuffle();
		
		player1.setName("Player 1");
		player2.setName("Player 2");
		
		for(int i = 0; i < 52; i++) {
			if(i %2 == 0) {
				player1.draw(deck);
				
			}
			else {
				player2.draw(deck);
			}
		}
		player1.describe();
		player2.describe();
		
		for(int n = 0; n < 26; n++) {
			int p1Value = player1.flip();
			int p2Value = player2.flip();
			System.out.print("Round " + (n+1));
			
			if( p1Value> p2Value) {
				player1.incrementScore();
				System.out.println(" - Player 1 won the draw! \n The score is: Player 1: " + player1.getScore() + " vs Player 2: " + player2.getScore());
			}
			else if ( p2Value > p1Value) {
				
				player2.incrementScore();
				System.out.println(" - Player 2 won the draw! \n The score is: Player 1: " + player1.getScore() + " vs Player 2: " + player2.getScore());
			}
			else
				System.out.println(" ****Tie!****");
		}
		System.out.println("");
		System.out.println("************** END OF GAME *************");
		System.out.println("**************************************");
		if(player1.getScore() > player2.getScore())
			System.out.println(player1.getName() + ", won! Total score is: " + player1.getScore());
		else if(player2.getScore() > player1.getScore())
			System.out.println(player2.getName() + ", won! Total score is : " + player2.getScore());
		else
			System.out.println("It's a tie");
		System.out.println("*************************");
	}
}