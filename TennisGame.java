import java.util.*;
import java.lang.*;
import java.io.*;

class TennisGame
{
	int playerA;
	int playerB;
	int setsWonByA;
	int setsWonByB;
	int[] scores = { 0, 15, 30, 40 };
	
	TennisGame() {
		playerA = 0;
		playerB = 0;
		setsWonByA = 0;
		setsWonByB = 0;
	}
	
	void computeScores(String scores) {
        for (int i = 0; i < scores.length(); i++) {
            if (scores.charAt(i) == 'A') {
                playerA++;
            } 
		 else if (scores.charAt(i) == 'B') {
                playerB++;   
            }
            if(isWinner()) {
                playerA = 0;
                playerB = 0;
            } 
		 else {
                    printScores();      
        	 }
	  }
    }
	
	boolean isWinner() {
        
        if (playerA > 3 && (playerA - playerB >= 2)){
            System.out.println((++setsWonByA) + "-" + setsWonByB);
            return true;
        } 
        else if (playerB > 3 && (playerB - playerA >= 2)) {
            System.out.println(setsWonByA + "-" + (++setsWonByB));
            return true;
        }
        
        return false;
    }
	
	void printScores() {
		if (playerA < 4 && playerB < 4) {
			System.out.println(scores[playerA] + "-" + scores[playerB]);
		} 
           else {
			if (playerA == playerB) {
				System.out.println("40-40");
   			}
			else if (playerA > playerB) {
				System.out.println("A-40");
			}
			else {
				System.out.println("40-A");
			}
		}
	}

    
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string of scores.\n");
		String scoreString = scanner.nextLine();
		
		TennisGame tennisGame = new TennisGame();
		tennisGame.computeScores(scoreString);
		return;
	}
}
