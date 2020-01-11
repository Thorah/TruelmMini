package com.sakrai.truelmini;
import java.util.*;
import java.util.ArrayList;

public class terrain {

	private int waterpresence;

	private int temperate;

	private int humidity;

	private int entropy;

	private int heightmin;

	private int heightmax;

	private int tableid;

	private String heightmap;

	private String watermap;

	private String tempmap;

	// static generate method
	public terrain(){
		this.waterpresence = myrandom.randomfromandto(1, 12);
		this.temperate = myrandom.randomfromandto(1, 12);
		this.humidity = myrandom.randomfromandto(1, 12);
		this.entropy = myrandom.randomfromandto(1, 12);
		this.heightmin = myrandom.randomfromandto(1, 12);
		this.heightmax = myrandom.randomfromandto(this.heightmin, 12);
		
		// myrandom.randomfromandto(0,0);
		
		this.heightmap = genheightmap(); 
		this.watermap = genwatermap();
		this.tempmap = genheatmap();
	}

	// generate on table
	public terrain(String game){
		this.waterpresence = myrandom.randomfromandto(1, 12);
		this.waterpresence = myrandom.randomfromandto(1, 12);
		this.waterpresence = myrandom.randomfromandto(1, 12);
		this.waterpresence = myrandom.randomfromandto(1, 12);
		this.waterpresence = myrandom.randomfromandto(1, 12);
		this.waterpresence = myrandom.randomfromandto(1, 12);

		// enter new item on table using game as reference for the database to be entered. The table will always be the same.

		//set the id from the id retuened when the helper enters it into the table.
	}

	public String reveal(){
		StringBuilder builder = new StringBuilder();
		builder.append("<br> \n" + "--------------------");
		builder.append("<br> \n Heightmap: " + heightmap);
		builder.append("<br> Range: " + Integer.toString(heightmin) + "-" + Integer.toString(heightmax));
		builder.append(" | Entropy: " + Integer.toString(entropy));
	
		builder.append("<br> \n "+ "Waterpresence: " + Integer.toString(waterpresence) + " | " + watermap );
		
		builder.append("<br> \n Temperature: "+ Integer.toString(temperate) + " | " + tempmap);
		builder.append("<br> \n Humidity: " + Integer.toString(humidity));
		
		
	
	
		

		// String text = "<br> <font color=#cc0029>First Color</font> <font color=#ffcc00>Second Color</font>";
		//builder.append(text);
		
		return builder.toString();
	};

	public String genheightmap(){
		StringBuilder builder = new StringBuilder();
		for (int j = 12; j > 0; j--){
			int height = myrandom.randomfromandto(heightmin, heightmax);
			// int height = 3;
			String choice = heightmapdispv3[height-1][
				myrandom.randomfromandto(0,heightmapdispv3[height-1].length-1)
				];
			//builder.append(Integer.toString(height));
			builder.append(choice);
			
		}
		// myrandom.randomfromandto(0,0)
		// heightmapdispv3[height].length-1
//		int hieght = myrandom.randomfromandto(0, heightmapdispv3.length);
//		String choice = heightmapdispv3[hieght][
//			myrandom.randomfromandto(0, heightmapdispv3[hieght].length)
//		];
//		
//		builder.append(choice);
		
		return builder.toString();
	};

	private String genwatermap(){
		ArrayList<String> watertiles = new ArrayList<String>();
		
		String Bluetile = "<font color=#0066ff>\u2589</font>";
		//String Greytile = "<font color=#cc0029>\u2589</font>";
		for (int i = waterpresence; i >0; i-- ){
			watertiles.add(0,Bluetile);
		}
		for (int i = 12 - waterpresence; i >0; i-- ){
			watertiles.add(0,"\u2589");
		}
		int i;
		StringBuilder builder = new StringBuilder();
		while( watertiles.size()>0){
			i = myrandom.randominrange(watertiles.size());
			builder.append(watertiles.get(i));
			watertiles.remove(i);
		}
		return builder.toString();
	};
	
	private String genhumiditumap(){
	
		return "placeholder";
	};
	
	private String genheatmap(){
		StringBuilder builder = new StringBuilder();
		for (int i=this.temperate; i>0; i--){
			builder.append(temperaturetiles[this.temperate-1]);
		}
		return builder.toString();
	}

	String[] temperaturetiles =
	{"<font color=#FF1000>\u2589</font>",
		"<font color=#FF2F00>\u2589</font>",
		"<font color=#FF4F00>\u2589</font>",
		"<font color=#FF6E00>\u2589</font>",
		"<font color=#FF8D00>\u2589</font>",
		"<font color=#FFCB00>\u2589</font>",
		"<font color=#FFDC60>\u2589</font>",
		"<font color=#00E0FF>\u2589</font>",
		"<font color=#00C1FF>\u2589</font>",
		"<font color=#00A2FF>\u2589</font>",
		"<font color=#0063FF>\u2589</font>",
		"<font color=#0006FF>\u2589</font>"
		};

	
	String[] one = {"&#9601;"};
	String[] two = {"&#9601;"};
	String[] three = {"&#9601;"};
	String[] four = {"&#9601;"};
	String[] five = {"&#9601;"};
	String[] six = {"&#9601;"};
	String[] seven = {"&#9601;"};
	String[] eight = {"&#9601;"};
	String[] nine = {"&#9601;"};
	String[] ten = {"&#9601;"};
	String[] eleven = {"&#9601;"};
	String[] twelve = {"&#9601;"};
	
//	private String[][] heightmapdispv3 =
//		{
//		one,
//		two,
//		three,
//		four,
//		five,
//		six,
//		seven,
//		eight,
//		nine,
//		ten,
//		eleven,
//		twelve
//		};
	
	private String[][] heightmapdispv3 = 
		{
			{"\u2581", "\u2581", "\u2582"},
			{"\u2581", "\u2582", "\u2582"},
			{"\u2582", "\u2582", "\u2583"},
			{"\u2582", "\u2583"},
			{"\u2582", "\u2583", "\u2584"},
			{"\u2583", "\u2584", "\u2585"},
			{"\u2584", "\u2585", "\u2586"},
			{"\u2585", "\u2586", "\u2587"},
			{"\u2586", "\u2587"},
			{"\u2587", "\u2587", "\u2588"},
			{"\u2588", "\u2588", "\u2589"},
			{"\u2588", "\u2589", "\u2589"},
		
		};
	
	
	
		
	private ArrayList<String[]> heightmapdisplayv2 = new ArrayList<String[]>();

	
	//private ArrayList<Integer> test = new ArrayList();
	//test.add(1);

	/*
	heightmapdisplayv2.add(one);
	heightmapdisplayv2.add(two);
	heightmapdisplayv2.add(three);
	heightmapdisplayv2.add(four);
	heightmapdisplayv2.add(five)
	heightmapdisplayv2.add(six)
	heightmapdisplayv2.add(seven)
	heightmapdisplayv2.add(eight)
	heightmapdisplayv2.add(nine)
	heightmapdisplayv2.add(ten)
	heightmapdisplayv2.add(eleven)
	heightmapdisplayv2.add(twelve)
	*/

	// private HashMap<int, String[]> heightmapdisplay = new HashMap<int, String[]>;

	
	// heightmapdisplay.add(1, "&#9601;");

}
