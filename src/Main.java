import java.util.Random; import java.util.Scanner;
public class Main {
	public static Random rand = new Random(); 
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Please input the times you want to throw the dice");
		/*int times = scan.nextInt();*/ //throwDice(times);
		int izvele, times=0; 
		do{ System.out.println("1-mest kaulinu | 2-apturet");
		izvele = scan.nextInt(); switch(izvele){ case 1: 
			do{ System.out.println("Please input the times you want to throw the dice");
			times = scan.nextInt(); }while(times<1);
			break;
			case 2: System.out.println("Program stopped"); 
			break;
			} 
		}while(izvele!=2); throwDice(times); scan.close(); 
			
	} 
	
	
	static void throwDice(int times){
		for(int i =0; i<times;i++) 
			System.out.print(rand.nextInt(6)+1+" "); }
	}
