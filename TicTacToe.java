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
	String line=null;
	int userInput=0;
	ArrayList<String> gameBord = new ArrayList<String>(Arrays.asList(" "," "," "," "," "," "," "," "," ") );
	Set<Integer> entry_dtls = new HashSet<Integer>(); 
 	void myMethod() {
   		Scanner myObj = new Scanner(System.in);  

		System.out.println("Enter Position");
		
		while(userInput<9){
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
userInput+=1;
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
			checkWinOrLoast();
  }
  void checkWinOrLoast(){
  	for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = gameBord.get(0) + gameBord.get(1) + gameBord.get(2);
				break;
			case 1:
				line = gameBord.get(3) + gameBord.get(4) + gameBord.get(5);
				break;
			case 2:
				line = gameBord.get(6) + gameBord.get(7) + gameBord.get(8);
				break;
			case 3:
				line = gameBord.get(0) + gameBord.get(3) + gameBord.get(6);
				break;
			case 4:
				line = gameBord.get(1) + gameBord.get(4) + gameBord.get(7);
				break;
			case 5:
				line = gameBord.get(2) + gameBord.get(5) + gameBord.get(8);
				break;
			case 6:
				line = gameBord.get(0) + gameBord.get(4) + gameBord.get(8);
				break;
			case 7:
				line = gameBord.get(2) + gameBord.get(4) + gameBord.get(6);
				break;
			}
			if (line.equals("XXX")) {
				System.out.println("Player one win");
				//return "X";
				userInput+=9;

			} else if (line.equals("OOO")) {
				System.out.println("Player two win");
				userInput+=9;
				//return "O";
			}

		}
if (entry_dtls.size()==9 && (line!=("XXX") && line!=("OOO"))) 
				{
					System.out.println("draw");
						userInput+=9;
}

  }
}
