import java.util.*; 
import java.util.ArrayList;
import java.util.InputMismatchException;
public class TicTacToe  {

   public static void main(String[] args) {
   	GamePlay gameObj=new GamePlay();
   	gameObj.myMethod();
   }
}

class GamePlay {
	ArrayList<String> gameBord = new ArrayList<String>(Arrays.asList(" "," "," "," "," "," "," "," "," ") );
	Set<Integer> entry_dtls = new HashSet<Integer>(); 
 	void myMethod() {
   		Scanner myObj = new Scanner(System.in);  

		System.out.println("Enter Position");
		int userInput=0;
		while(entry_dtls.size()<9){
			display();

		

		try {
				Integer playerInput = myObj.nextInt(); 
				if (!(playerInput > 0 && playerInput <= 9)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;

				}
				if(playerInput<=9&& !(entry_dtls.contains(playerInput))){
		PlayerOne(playerInput);
		}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}

		}
	}

 void PlayerOne(Integer getFrommyMethod){
		gameBord.set(getFrommyMethod-1,"X");
		entry_dtls.add(getFrommyMethod);
	display();
	PlayerTwo(getFrommyMethod);
  }
  void PlayerTwo(Integer getFromPlayerOne){
  	Scanner myObj = new Scanner(System.in);
  	Integer playerInput = myObj.nextInt(); 
  	gameBord.set(playerInput-1,"O");
  	entry_dtls.add(playerInput);
	display();
	System.out.println(entry_dtls);
  }
  void display(){
  	System.out.println("-------\n|"+(gameBord.get(0))+"|"+(gameBord.get(1))+"|"+(gameBord.get(2))+"|"+"\t  \t"+"0 1 2");
			System.out.println("-------\n|"+(gameBord.get(3))+"|"+(gameBord.get(4))+"|"+(gameBord.get(5))+"|"+"\t"+"-->"+"\t"+"3 4 5");
			System.out.println("-------\n|"+(gameBord.get(6))+"|"+(gameBord.get(7))+"|"+(gameBord.get(8))+"|"+"\t  \t"+"6 7 8");
			System.out.println("-------");
  }
}
