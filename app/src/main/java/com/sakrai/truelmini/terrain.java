package com.sakrai.truelmini;

import myrandom;

public class terrain {

	private int waterpresence;

	private int temperate;

	private int humidity;

	private int entropy;

	private int heightmin;

	private int heightmax;

	private int tableid;

	// static generate method
	public terrain(){
		this.waterpresence = randomfromandto(1, 12)
		this.temperate = randomfromandto(1, 12)
		this.humidity = randomfromandto(1, 12)
		this.entropy = randomfromandto(1, 12)
		this.heightmin = randomfromandto(1, 12)
		this.heightmax = randomfromandto(1, 12)
	}

	// generate on table
	public terrain(String game){
		this.waterpresence = randomfromandto(1, 12)
		this.waterpresence = randomfromandto(1, 12)
		this.waterpresence = randomfromandto(1, 12)
		this.waterpresence = randomfromandto(1, 12)
		this.waterpresence = randomfromandto(1, 12)
		this.waterpresence = randomfromandto(1, 12)

		// enter new item on table using game as reference for the database to be entered. The table will always be the same.

		//set the id from the id retuened when the helper enters it into the table.
	}

	public terrain getterrain(){
		return this.thisterrain
	};

	public String reveal(){

	};

	public String heightmap(){
		StringBuilder builder = new StringBuilder();
		for (int j = 12; j > 0; j--){
			StringBuilder.append(heightmapdisplayv2[randomfromandto(0, 11)])
		}

		StringBuilder.append("\n" + Integer.tostring(waterpresence))
		StringBuilder.append("\n" + Integer.tostring(temperate))
		StringBuilder.append("\n" + Integer.tostring(humidity))
		StringBuilder.append("\n" + Integer.tostring(entropy))

		return builder.tostring
	};

	private ArraList<String[]> heightmapdisplayv2 = new ArraList<String[]>;
	
	heightmapdisplayv2.add(one)
	heightmapdisplayv2.add(two)
	heightmapdisplayv2.add(three)
	heightmapdisplayv2.add(four)
	heightmapdisplayv2.add(five)
	heightmapdisplayv2.add(six)
	heightmapdisplayv2.add(seven)
	heightmapdisplayv2.add(eight)
	heightmapdisplayv2.add(nine)
	heightmapdisplayv2.add(ten)
	heightmapdisplayv2.add(eleven)
	heightmapdisplayv2.add(twelve)


	private HashMap<int, String[]> heightmapdisplay = new HashMap<int, String[]>;

	String[] one = {"&#9601;"}
	String[] two = {"&#9601;"}
	String[] three = {"&#9601;"}
	String[] four = {"&#9601;"}
	String[] five = {"&#9601;"}
	String[] six = {"&#9601;"}
	String[] seven = {"&#9601;"}
	String[] eight = {"&#9601;"}
	String[] nine = {"&#9601;"}
	String[] ten = {"&#9601;"}
	String[] eleven = {"&#9601;"}
	String[] twelve = {"&#9601;"}

	heightmapdisplay.add(1, "&#9601;")

}