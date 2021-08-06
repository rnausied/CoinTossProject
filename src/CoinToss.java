import java.util.Random;

public class CoinToss{
	
	//a change has been made
	//another change
	//a specific message is best
	
	public int tossACoin(){
		
		Random rand = new Random();
		
		int toss = Math.abs(rand.nextInt()) % 2;
		
		return toss;
		
		
	}
	
	public static void main(String args[]){
		
		CoinToss game = new CoinToss();
		
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
		System.out.println(game.tossACoin());
			
			
		}
		
	}
