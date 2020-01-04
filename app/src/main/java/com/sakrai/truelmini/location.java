package com.sakrai.truelmini;

import java.util.*

public class location
{
	private terrain thisterrain;

	private int size;

	private int tableid;

	private boolean generated = false;

	// generate random
	public location(){
		generated = true

		terrain = new terrain();
		
		size = randomfromandto(10, 15)
	};

	// generate random with size barriers
	public location(int from, int to){
		generated = true

		terrain = new terrain();
		
		size = randomfromandto(from, to)

	};

	// reconstitute
	public location(HashMap<String, int>){
		
		HashMap hashmapterrain;
		thisterrain = new terrain(hashmapterrain);
	};



	// print out info as text
	public String reveal(){
		StringBuilder outputstrb = new StringBuilder();

		outputstrb.append("Size: " + Integer.toString(this.size))

		outputstrb.append("\n" + thisterrain.reveal)
	}
}