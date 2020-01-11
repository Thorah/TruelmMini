package com.sakrai.truelmini;
import java.util.*;

public class entity
{

	//list of attributes such as mobility and the deacriptors for each

	
	//truel value attrubutes.
	int intelligence;

	int agility;

	int strength;

	//list of senses.
	ArrayList<sense> EntitySenses = new ArrayList<>();

	//()generate all
	public void generate(){
		// generate senses
		int numsenses = myrandom.randominrange(4) + 1;
		for(int i=0; i >= numsenses; i++){
			
		}
	}
	//() variois testa sich as movement twat and generic test
	public String reveal(){
		return "placehokder";
	}
}
