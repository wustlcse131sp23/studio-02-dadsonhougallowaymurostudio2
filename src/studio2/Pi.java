package studio2;
import java.util.Scanner;
public class Pi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

double boardArea = 1.0;
double arcArea = 3.141/4;
int hits = 0;
int misses = 0;

for(int i=0; i<500; i++) {

double dartThrow = Math.random();
boolean hitOrMiss = (dartThrow - arcArea < 0);
if (hitOrMiss == true) {
	hits++;
}
if (hitOrMiss == false) {
	misses++;
}

}

double onBoardPercentage = 100.0000*hits/(hits+misses);
System.out.println("The arc was hit " + hits + " times out of " + (hits+misses) + " attempts. This means the board was hit " + onBoardPercentage + "% of the time.");
System.out.println("To estimate the value of pi, let's multiply the on-board percentage by 4, since our board is only 1/4 of a circle:");
System.out.println(onBoardPercentage/100.0 + " * 4 = " + 4 * onBoardPercentage/100);
double accuracy = Math.round((100-314.10/(4.0*onBoardPercentage))*100.0)/100.0;
System.out.println("The real value of pi, rounded the 1000th place, is 3.141, making our estimate " + accuracy + "% accurate");
}
}
