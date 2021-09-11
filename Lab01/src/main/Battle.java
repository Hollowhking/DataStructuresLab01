package main;

public class Battle {
	String combatant1name, combatant2name;
	float combatant1HP,combatant2HP,combatant1Attack,combatant2Attack,combatant1Defense,combatant2Defense;
	int count=1;
	Battle(String combatant1name,float combatant1Attack, float combatant1Defense, float combatant1HP, String combatant2name, float combatant2Attack, 
			float combatant2Defense, float combatant2HP ){
		//set combatant 1 values
		this.combatant1name=combatant1name;
		this.combatant1Attack=combatant1Attack;
		this.combatant1Defense=combatant1Defense;
		this.combatant1HP=combatant1HP;
		//set combatant 2 values
		this.combatant2name=combatant2name;
		this.combatant2Attack=combatant2Attack;
		this.combatant2Defense=combatant2Defense;
		this.combatant2HP=combatant2HP;
	}
	
	public void simulateRound(){
		float damage;
		System.out.println("Round "+ count);
		//
		damage = this.combatant1Attack - this.combatant2Defense;
		System.out.println(this.combatant1name+" does "+(int)damage+" points of damage to "+this.combatant2name);
		this.combatant2HP=this.combatant2HP-damage;
		//
		damage = this.combatant2Attack - this.combatant1Defense;
		System.out.println(this.combatant2name+" does "+(int)damage+" points of damage to "+this.combatant1name);
		this.combatant1HP=this.combatant1HP-damage;
		//print HP
		System.out.println(this.combatant1name+": "+(int)this.combatant1HP);
		System.out.println(this.combatant2name+": "+(int)this.combatant2HP);
		//add count value
		this.count=this.count+1;
	}
	
	public boolean isMonster1Dead() {
		if (this.combatant1HP<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isMonster2Dead() {
		if (this.combatant2HP<=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
