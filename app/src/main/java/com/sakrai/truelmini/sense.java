package com.sakrai.truelmini;
import java.util.*;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class sense
{

	private int efficacymodifier;

	private int anglescope;

	private int movability;

	private int rangefallout;
	
	private int focusmodifier;

	private int discernablerangemin;

	private int discernablerangemax;

	private boolean generated = false;
	
	// info obj arraylist
	ArrayList<information> discernableinfos;

	public void generate(){
		if(this.generated = false){
			this.generated = true;
		
			information thisinfo = new information();
			thisinfo.generate();
			discernableinfos.add(0, thisinfo);
		
			int extrapool = 0;
			myrandom randgenerator = new myrandom();
			this.efficacymodifier = randgenerator.randomfromandto(efficacymodifiergenmin, efficacymodifiergenmax);
			extrapool = extrapool - (this.efficacymodifier);
			
//			if (extrapool > 0){
//				this.anglescope = randgenerator.randomfromandto(anglescopegenmin + extrapool, anglescopegenmiax);
//			} else if (extrapool < 0){
//				this.anglescope = randgenerator.randomfromandto(anglescopegenmin , anglescopegenmiax - extrapool); 
//			}
			
			this.anglescope = randgenerator.randomfromandtogoverned(anglescopegenmin, anglescopegenmiax, extrapool);
			extrapool = extrapool - (this.anglescope);
			
			this.movability = randgenerator.randomfromandtogoverned(movabilitygenmin, movabilitygenmax, extrapool);
			extrapool = extrapool - (this.movability);
			
			this.rangefallout = randgenerator.randomfromandtogoverned(rangefalloutgenmin, rangefalloutgenmax, extrapool);
			extrapool = extrapool - (this.rangefallout);
		
			this.focusmodifier = randgenerator.randomfromandtogoverned(focusmodifiergenmin, focusmodifiergenmax, extrapool);
			extrapool = extrapool - (this.rangefallout);
			
			this.discernablerangemin = randgenerator.randomfromandtogoverned(discernablerangemingenmin, discernablerangemingenmax, extrapool);
			extrapool = extrapool - (this.discernablerangemin);
		
			this.discernablerangemax = randgenerator.randomfromandtogoverned(discernablerangemaxgenmin, discernablerangemaxgenmax, extrapool);
			extrapool = extrapool - (this.discernablerangemax);
			
	
			
		}
	
		
	
		
		
	}
	// () compare one info obj with one given in the arguement
	boolean[] infocomparesolo(information discerninfo, information totest){
		
	}
	
	//iterate through all info objs and return true if sense can discern the passed info obj.
	boolean[][] infocompareall(){
		
	}

	//sense test: output as string for display a random result on one aense
	public class sensetest{
		public HashMap<Integer, Integer> sensetestgeneric(){
			
			
			
		};
		
	}
	
	//database helper
	public class senseshelper extends SQLiteOpenHelper
	{
		private static final String DB_NAME = "rollerdb";
		private static final int DB_VERSION = 1;

		private static final String TABLE_rollers = "rollertbl";

		private static final String KEY_ID = "id";

		private static final String KEY_NAME = "name";

		private static final String KEY_EFFMOD = "efficacymodifier";
		private static final String KEY_ANGSCO = "anglescope";
		private static final String KEY_NAME = "name";
		private static final String KEY_NAME = "name";



	
		ArrayList<column> columns = new ArrayList<column>();
		
		
		
		HashMap<String, String> datatypes = new HashMap<String, String>();
		
		
		@Override
		public void onCreate(SQLiteDatabase db){
		
			String CREATE_TABLE = "CREATE TABLE " + TABLE_rollers + "("
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ KEY_NAME + " TEXT,"
				+ KEY_BSI + " INTEGER"
				+ KEY_BSA + " INTEGER"
				+ KEY_BSS + " INTEGER"

				+ KEY_BOI + " INTEGER"
				+ KEY_BOA + " INTEGER"
				+ KEY_BOS + " INTEGER"

				+ KEY_DICE + " INTEGER" 
				+ ")"; 
			
//			column columnid = new column(KEY_NAME, datatypes.);
//			columns.add(columnid);
				
			db.execSQL(CREATE_TABLE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
			// Drop older table if exist
			db.execSQL("DROP TABLE IF EXISTS " + TABLE_rollers);
			// Create tables again
			onCreate(db);
		}
	}

//	public class column {
//		String columnname;
//		String datatype;
//		boolean primarykey; 
//		boolean autoincr;
//		
//		
//		column(String tcolunmname, String tdatatype, boolean tpkey, boolean taincr){
//			this.columnname = tcolunmname;
//			this.datatype = tdatatype;
//			this.autoincr = tpkey;
//			this.primarykey = taincr;
//		}
//		
//		public String instatiate
//	}

//	HashMap<String, String> datatypes = new HashMap<String, String>();
//	//datatypes.put("i", "INTEGER");
//	public static class datatypes{
//		public static final String integertype = "INTEGER";
//	
//		public static String integertypreret(){
//			return integertype;
//		}
//		
//	}

	//sense test all: output arraylist of hashmaps where the key
	//is the distance category and the value is how well the entity
	//discerns at that range as a random result for all senses 

	
	//inspect: inspect a given target and reeturn the info that yo
	//can perciev at a given distance
	
	private int efficacymodifiergenmin = -3;

	private int anglescopegenmin = -2;

	private int movabilitygenmin = -2;

	private int rangefalloutgenmin = 0;

	private int focusmodifiergenmin = -2;

	private int discernablerangemingenmin = 0;

	private int discernablerangemaxgenmin = 0;
	
	private int efficacymodifiergenmax = 3;

	private int anglescopegenmiax = 2;

	private int movabilitygenmax = 2;

	private int rangefalloutgenmax = 2;

	private int focusmodifiergenmax = 2;

	private int discernablerangemingenmax = 3;

	private int discernablerangemaxgenmax = 5;
	
}


