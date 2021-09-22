package main;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Part 1");
		
	    String chikapuName = "Chikapu";
	    float chikapuAttack = 38.5f;
	    float chikapuDefense = 20.0f;
	    float chikapuHP = 200f;

	    String zarichardName = "Zarichard";
	    float zarichardAttack = 25f;
	    float zarichardDefense = 12.5f;
	    float zarichardHP = 200f;
		//createbattle object
	    Battle battle = new Battle(chikapuName, chikapuAttack, chikapuDefense, chikapuHP,
	                               zarichardName, zarichardAttack, zarichardDefense, zarichardHP);

	    while (!battle.isMonster1Dead() && !battle.isMonster2Dead()) {
	        battle.simulateRound();
	    }

	    if (battle.isMonster1Dead()) {
	        System.out.printf("\n%s has fainted!\n", chikapuName);
	    } else {
	        System.out.printf("\n%s has fainted!\n", zarichardName);
	    }
	    ///////////////////////////////
	    System.out.println("Part 2");

		int numIterations = 10;
		System.out.printf("e^1 = %.8f\n", TaylorSeries.approximateExp(1, numIterations));
		System.out.printf("e^2 = %.8f\n", TaylorSeries.approximateExp(2, numIterations));
	}
}
