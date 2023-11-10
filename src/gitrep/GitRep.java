package gitrep;

import java.util.Scanner;

public class GitRep {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
		
        int opt;
        int botPts = 0;
        int urPts = 0;
	int roundsToWin = 2;
        
        do {
            System.out.println("\nWelcome to Rock, Paper, Scissors. Please choose an option:\n1. Start Game\n2. Change number of rounds (default: 2)\n3. Exit application");
            opt = sc.nextInt();
        
            switch (opt) {
                case 1 -> {
                    System.out.println("\nThis match will be first to " + roundsToWin + " wins.");
                    while (botPts < roundsToWin && urPts < roundsToWin){
                        int rdNum = (int)(Math.random() * 3);
                        Move botMove;
                        botMove = switch (rdNum) {
                            case 0 -> rock;
                            case 1 -> paper;
                            default -> scissors;
                        };
                    
                        System.out.println("\nThe computer has selected its move. Select your move:\n1. Rock\n2. Paper\n3. Scissors");
                    
                        int urNum = sc.nextInt();
                        Move urMove;
                        urMove = switch (urNum) {
                            case 1 -> rock;
                            case 2 -> paper;
                            default -> scissors;
                        };
                    
                        int result = Move.compareMoves(botMove, urMove);
                        String winner;
                        switch (result) {
                            case 0 -> {
                                winner = "Computer";
                                botPts++;
                            }
                            case 1 -> {
                                winner = "Player";
                                urPts++;
                            }
                            default -> winner = "No one";
                        }
                        
                        System.out.println("\nPlayer chose " + urMove.getName() + ". Computer chose " + botMove.getName() + ". " + winner + " wins Round!");
                        System.out.println("Player: " + urPts + " - Computer: " + botPts);
                        
                        if(botPts == roundsToWin || urPts == roundsToWin){
                            System.out.println("\n" + winner + " wins the game!");
                            opt = 3;
                        }
                    }
                }
                case 2 -> {
                    System.out.print("\nHow many wins are needed to win a match?: ");
                    roundsToWin = sc.nextInt();
                    System.out.println("\nNew setting has been saved! Wins needed: " + roundsToWin);
                }
                default -> System.out.print("Thank you for playing!");
            }
        } while (opt==1 || opt==2);
        
        sc.close();
    }
    
}
