package com.sakrai.truelmini;

import java.util.Random;
import java.util.*;


public class information
{

	private String mediumtype;
	
	private String mediumsubtype;
	
	private String encodingstyle;
	
	private String mediumform;

	private String focalstate;
	
	static final String[] mediumforms = {"Matter", "Energy"};
	
	static final String[] mediumtypes = {"Matter", "Energy"};
	
	static final String[] mediumsubtypes = {"Matter", "Energy"};
	
	static final String[] focalstates = {"Matter", "Energy"};
	
	static final String[] encodingstyles = {"Matter", "Energy"};
	
	void generate(){
		this.mediumform = mediumforms[randominrange(1)];
		
		if (this.mediumform == mediumforms[0]){
			this.focalstate = focalstates[randominrange(focalstates.length)];
		}
		if (this.mediumform == mediumforms[1]){
			this.mediumtype = mediumtypes[randominrange(mediumtypes.length)];
			this.mediumsubtype = mediumsubtypes[randominrange(mediumsubtypes.length)];
			
		}
		this.encodingstyle = encodingstyles[randominrange(encodingstyles.length)];
	}
	
	
	
	void setvalues(
		String imediumform,
		String imediumtype,
		String imediumsubtype,
		String iencodingstyle,
		String ifocalstate)
		{
		this.mediumform = imediumform;
		this.mediumtype = imediumtype;
		this.mediumsubtype = imediumsubtype;
		this.encodingstyle = iencodingstyle; 
		this.focalstate = ifocalstate;
		
	}
	
	
	public int randominrange(int max){
        Random random = new Random();
        return random.nextInt(max);
	}


	
	public ArrayList<String> returninformation() {
		
		ArrayList<String> info = new ArrayList<String>();
		info.add(this.mediumform);
		info.add(this.mediumtype);
		info.add(this.mediumsubtype);
		info.add(this.focalstate);
		info.add(this.encodingstyle);
		
		return info;
	}
	
	public class randinformationmatter {
		private String mediumform;
		
		private String mediumtype;

		private String mediumsubtype;
		
//		public String[] getdetails (){
//			String[] details;
//
//
//
//
//
//			return details;
//		}
		

	}
	
	class randinformationenergy {
		private String mediumform;

		private String focalstate;
		
//		public String[] getdetails (){
//			String[] details;
//
//
//
//
//
//			return details;
//		}
//
	}
	
	
	
}


	




