package com.sakrai.truelmini;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;



public class dbhelperroller extends SQLiteOpenHelper
{ 
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

		db.execSQL(CREATE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
		// Drop older table if exist
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_rollers);
		// Create tables again
		onCreate(db);
	}


	private static final String DB_NAME = "rollerdb";
	private static final int DB_VERSION = 1;

	private static final String TABLE_rollers = "rollertbl";

	private static final String KEY_ID = "id";
    
	private static final String KEY_NAME = "name";
	
	private static final String KEY_BSI = "bsi"; 
	private static final String KEY_BSA = "bsa"; 
	private static final String KEY_BSS = "bss"; 
	
	private static final String KEY_BOI = "boi"; 
	private static final String KEY_BOA = "boa"; 
	private static final String KEY_BOS = "bos"; 
	
	private static final String KEY_DICE = "dc";

	public dbhelperroller(Context context){
        super(context,DB_NAME, null, DB_VERSION);
    }

	
	// **** CRUD (Create, Read, Update, Delete) Operations ***** //

    // Adding new roller details
    long insertnewperson(String name, int bsi, int bsa, int bss, int boi, int boa, int bos, int dc){
        //Get the Data Repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();
        //Create a new map of values, where column names are the keys
        ContentValues cValues = new ContentValues();
        cValues.put(KEY_NAME, name);
     
		cValues.put(KEY_BSI, bsi);
		cValues.put(KEY_BSA, bsa);
		cValues.put(KEY_BSS, bss);

		cValues.put(KEY_BOI, boi);
		cValues.put(KEY_BOA, boa);
		cValues.put(KEY_BOS, bos);
	
		cValues.put(KEY_DICE, dc);

        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(TABLE_rollers,null, cValues);

		db.close();
		return newRowId; 
    }
    // Get User Details

//    public ArrayList<person> GetPeople(){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ArrayList<person> personlist = new ArrayList<>();
//        String query = "SELECT id, name, age FROM "+ TABLE_people;
//        Cursor cursor = db.rawQuery(query,null);
//        while (cursor.moveToNext()){
//            person Person = new person();
//			// long pid = cursor.getLong(cursor.getColumnIndex(KEY_ID));
//
//			Person.setDatabaseid(cursor.getLong(cursor.getColumnIndex(KEY_ID)));
//			Person.setName(cursor.getString(cursor.getColumnIndex(KEY_NAME)));
//            Person.setAge(cursor.getInt(cursor.getColumnIndex(KEY_AGE)));
//
//            personlist.add(Person);
//        }
//        return  personlist;
//    }
    // Get User Details based on userid
//    public person GetPersonByUserId(int userid){
//        SQLiteDatabase db = this.getWritableDatabase();
//        person thisperson = new person();
//        String query = "SELECT name, age FROM "+ TABLE_people;
//        Cursor cursor = db.query(TABLE_people, new String[]{KEY_NAME, KEY_LOC, KEY_DESG}, KEY_ID+ "=?",new String[]{String.valueOf(userid)},null, null, null, null);
//        if (cursor.moveToNext()){
//            thisperson.setName(
//            user.put("name",cursor.getString(cursor.getColumnIndex(KEY_NAME)));
//            user.put("designation",cursor.getString(cursor.getColumnIndex(KEY_DESG)));
//            user.put("location",cursor.getString(cursor.getColumnIndex(KEY_LOC)));
//            userList.add(user);
//        }
//        return  userList;
//    }
    // Delete User Details
    public void DeleteRoller(long userid){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_rollers, KEY_ID+" = ?",new String[]{String.valueOf(userid)});
        db.close();
    }
    // Update User Details
    public int UpdatePersonDetails(String name, int age, long id){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cVals = new ContentValues();
        cVals.put(KEY_NAME, name);
        //cVals.put(KEY_AGE, age);
        int count = db.update(TABLE_rollers, cVals, KEY_ID+" = ?",new String[]{String.valueOf(id)});

		return  count;
    }

}

class column{
	
	
}
class table{
	
}
