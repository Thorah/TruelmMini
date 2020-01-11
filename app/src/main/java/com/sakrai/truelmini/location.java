package com.sakrai.truelmini;

import java.util.*;

public class location
{
	private terrain thisterrain;

	private int size;

	private int tableid;

	private boolean generated = false;

	// generate random
	public location(){
		generated = true;

		terrain thisterrain = new terrain();
		
		size = myrandom.randomfromandto(10, 15);
	};

	// generate random with size barriers
	public location(int from, int to){
		generated = true;

		thisterrain = new terrain();
		
		size = myrandom.randomfromandto(from, to);

	};

	// reconstitute
	public location(HashMap<String, Integer> inputhashmap){
		
		HashMap hashmapterrain;
		// thisterrain = new terrain(inputhashmap);
	};



	// print out info as text
	public String reveal(){
		StringBuilder outputstrb = new StringBuilder();

		outputstrb.append("<br> \n Size: " + Integer.toString(this.size));

		outputstrb.append("\n" + thisterrain.reveal());
		
		return outputstrb.toString();
	}
}
