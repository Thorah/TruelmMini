package com.sakrai.truelmini;

public class truelvalue{
	int intellect = 0;
	int agility = 0;
	int strength = 0;

	int[]  values = {intellect, agility, strength};

	public int[] returnvalues(){
		int[] thesevalues = {intellect, agility, strength};
		return thesevalues;
	}
	public int[] combine(int[] toadd){
		int[] thesevalues = {intellect, agility, strength};
		thesevalues[0] = thesevalues[0] + toadd[0];
		thesevalues[1] = thesevalues[1] + toadd[1];
		thesevalues[2] = thesevalues[2] + toadd[2];
		return thesevalues;
	}

	public void setvalues(int[] newvalues){
		intellect = newvalues[0];
		agility = newvalues[1];
		strength = newvalues[2];
	}

	public int[] multiplier(int[] reference){
		int tempint = this.intellect*reference[0];
		int tempagi = this.agility*reference[1];
		int tempstr = this.strength*reference[2];

		int[] mvalues = {tempint, tempagi, tempstr};
		return mvalues;
	}
}
