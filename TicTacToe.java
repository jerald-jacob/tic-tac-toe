import java.util.*; 
import java.util.ArrayList;
public class TicTacToe  {

   public static void main(String[] args) {
   	GamePlay gameObj=new GamePlay();
   	gameObj.myMethod();
   }
}

class GamePlay {
	ArrayList<String> gameBord = new ArrayList<String>(Arrays.asList(" "," "," "," "," "," "," "," "," ") );
	Set<String> entry_dtls = new HashSet<String>(); 
 	void myMethod() {
   		Scanner myObj = new Scanner(System.in);  

		System.out.println("Enter Position");
		int userInput=0;
		while(userInput<=5){
			System.out.println("-------\n|"+(gameBord.get(0))+"|"+(gameBord.get(1))+"|"+(gameBord.get(2))+"|"+"\t  \t"+"0 1 2");
			System.out.println("-------\n|"+(gameBord.get(3))+"|"+(gameBord.get(4))+"|"+(gameBord.get(5))+"|"+"\t"+"-->"+"\t"+"3 4 5");
			System.out.println("-------\n|"+(gameBord.get(6))+"|"+(gameBord.get(7))+"|"+(gameBord.get(8))+"|"+"\t  \t"+"6 7 8");
			System.out.println("-------");

		Integer playerInput = myObj.nextInt(); 
		if(playerInput<=8 && !(entry_dtls.contains(playerInput))){
		PlayerOne(playerInput);
		}
		userInput+=1;	
		}
	}

  void PlayerOne(Integer getFrommyMethod){
		
		// PlayerOne logic
  		//call PlayerTwo
  }
  void PlayerTwo(Integer getFromPlayerOne){
	System.out.println(entry_dtls); 
  }
}