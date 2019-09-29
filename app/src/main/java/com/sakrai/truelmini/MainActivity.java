package com.sakrai.truelmini;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
//import android.view;
import android.view.View.*;
import android.view.View;
import android.text.*;
import org.w3c.dom.*;
import java.util.Random;
//import android.widget.EditText; 


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
		Button addrollerbutton = (Button) findViewById(R.id.addrollerbutton);
		addrollerbutton.setOnClickListener(new OnClickListener () {
				public void onClick(View v){
					//addview();
					addrollerv2(); 
				};
		});
		
    };
	
	public void toasttest(View v){
		Toast.makeText(this, "This is a toast test", Toast.LENGTH_SHORT);
	}

	public void addview(){
		LinearLayout alpha = (LinearLayout)findViewById(R.id.rollercase);
		LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
		ImageView iv = new ImageView(this);
		iv.setBackgroundResource(R.drawable.ic_launcher);
		iv.setLayoutParams(imageParams);
		alpha.addView(iv);
	}

	public int edittexttoint(EditText inputview){
		EditText theview = inputview; 
		int theint = Integer.parseInt(theview.getText().toString());
		
		return theint;
		
	}; 
		

	public void addrollerv2(){
		LayoutInflater myinflater = LayoutInflater.from(this);
		final LinearLayout layout = (LinearLayout) myinflater.inflate(R.layout.rollertemplate, null, false);

		LayoutInflater newinflater = LayoutInflater.from(this);

		anentity thisroller = new anentity();
		layout.setTag(thisroller);
	
		
	
		LinearLayout rollercase = findViewById(R.id.rollercase);
		rollercase.addView(layout);
	
		Button setatrbutton = (Button) layout.findViewById(R.id.attributes); 
		setatrbutton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View q) {
				//finish();
				adjustrollerdlog(q);
			};
			
		}); 
		
		Button rollbuttonobj = (Button) layout.findViewById(R.id.rollbutton);
		rollbuttonobj.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v){
				TextView output = findViewById(R.id.Output);
				LinearLayout thishereroller = (LinearLayout) v.getParent().getParent();
				EditText baseint = thishereroller.findViewById(R.id.baseint);
				EditText baseagi = thishereroller.findViewById(R.id.baseagi);
				EditText basestr = thishereroller.findViewById(R.id.basestr);
		
				EditText boostint = thishereroller.findViewById(R.id.boostint);
				EditText boostagi = thishereroller.findViewById(R.id.boostagi);
				EditText booststr = thishereroller.findViewById(R.id.booststr);
		
				EditText dice = thishereroller.findViewById(R.id.dice);
				
				// get the entity
				anentity thishereentity = (anentity) thishereroller.getTag(); 
				
				//find the views
			
				//update the entity from the textviews
				thishereentity.setattirbutes(
				edittexttoint(baseint),
				edittexttoint(baseagi),
				edittexttoint(basestr),
				edittexttoint(boostint),
				edittexttoint(boostagi),
				edittexttoint(booststr),
				edittexttoint(dice)
				
				);
			
				int[][] thisroll = thishereentity.doroll();
				
				
				output.append("\n Your roll sir;");
				
             	output.append("\n I: ");
                for (int j = thisroll.length -1; j > 0; j--){

					output.append(Integer.toString(thisroll[j - 1][0]));
             	 	output.append(""); 
					if (j>=1){
						output.append(":");
					}
				}
				output.append(" = ");
				output.append(Integer.toString(thisroll[thisroll.length-1][0]));
				
				output.append("\n A: ");
                for (int j = thisroll.length -1; j > 0; j--){

					output.append(Integer.toString(thisroll[j - 1][1]));
             	 	output.append(""); 
					if (j>=1){
						output.append(":");
					}
				}
				output.append(" = ");
				output.append(Integer.toString(thisroll[thisroll.length-1][1]));
				
				output.append("\n S: ");
                for (int l = thisroll.length -1; l > 0; l--){

					output.append(Integer.toString(thisroll[l - 1][2]));
             	 	output.append(""); 
					if (l>=1){
						output.append(":");
					}
				}
				output.append(" = ");
				output.append(Integer.toString(thisroll[thisroll.length-1][2]));
				               	
			};
		
		});
		
		
	
	}
	
	public void incrementedittext(EditText focus){
		//int toincrement = edittexttoint(focus);
		int toincrement = 1;
		focus.setText(Integer.toString(toincrement)); 
		
	}

	public void incrfrombutton(View t){
		Button thisclick = (Button) t;
		TableRow thisrow = (TableRow) t.getParent();
		//EditText location = dthisroller.findViewById(R.id.dbaseint);
		EditText location = (EditText) thisrow.getChildAt(thisrow.getChildCount()-2);
		String theintasstring = location.getText().toString();
		int theint = Integer.parseInt(theintasstring);
		
	
		if (t.getTag() == "-"){
			theint -= 1; 
		}
		if (t.getTag() == "+"){
			theint += 1;
		}
	
		
		location.setText(Integer.toString(theint));
	}

	
	public void adjustrollerdlog(View theclicked){
		final Dialog dialog = new Dialog(this);
		dialog.setContentView(R.layout.adjustrollerdialogue);
	
		// find the rolle
		final LinearLayout dthisroller = (LinearLayout) theclicked.getParent();
		
		
		
		//increment edittext up method
		Button bsiplus = (Button) dialog.findViewById(R.id.bsiplus);
		bsiplus.setTag("+"); 
//		bsiplus.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View t) {
//				Button thisclick = (Button) t;
//				TableRow thisrow = (TableRow) t.getParent();
//				//EditText location = dthisroller.findViewById(R.id.dbaseint);
//				EditText location = (EditText) thisrow.getChildAt(2);
//				String theintasstring = location.getText().toString();
//				int theint = Integer.parseInt(theintasstring);
//				//if t.gett
//				theint += 1;
//				location.setText(Integer.toString(theint));
//				//thevalue += 1; 
//			};
//		}); 
		
		Button bsiminus = dialog.findViewById(R.id.bsiminus);
		bsiminus.setTag("-");
		
		
//		View woofie = (View) theclicked;
//		ViewGroup parentview = (ViewGroup) woofie.getParent().getParent();
//		TextView namebox = (TextView) parentview.getChildAt(0);
//
		//dialog.setTitle(namebox.toString());
		dialog.setTitle("name");
		//final anentity thisentity = (anentity) dthisroller.getTag(); 
		


		
		// set the custom dialog components - text, image and button
//		EditText text = (EditText) dialog.findViewById(R.id.text);
//		text.setText(currentname);
//		ImageView image = (ImageView) dialog.findViewById(R.id.image);
//		image.setImageResource(R.drawable.ic_launcher);
		
//		final String newname = currentname;
//		final TextView texttochange = namebox;
//		final int bsi =
		

		//Button dialogButton = (Button) dialog.findViewById(R.id.dbaseint);
//		// if button is clicked, close the custom dialog
//		dialogButton.setOnClickListener(new OnClickListener() {
//				@Override
//				public void onClick(View v) {
//					View alpha = (View) v;
//
//					ViewGroup parentview = (ViewGroup) alpha.getParent();
//					TextView gamma = (TextView) parentview.getChildAt(1);
//					//TextView gamma1 = (TextView) gamma;
//					String newname = gamma.getText().toString();
//
//					//TextView tobechanged = findViewById(1235);
//					String oldname = texttochange.getText().toString();
//
//					TextView theoutput = findViewById(R.id.output);
//					theoutput.append("\n the dog " + oldname + " was renamed to" + newname);
//
//					//tobechanged.setText(newname1);
//					texttochange.setText(newname);
//
//					ddog.setname(newname);
//					dialog.dismiss();
//     			}
//			});

		dialog.show();
	};





public final int[][] dierolls = {{1,1,1}, {1,1,0}, {1,0,1}, {0,1,1}};
	
	static int randominrange(int max){
        Random random = new Random();
        return random.nextInt(max);
    }




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

	
public class anentity{
		int baseintellect = 1;
        int baseagility = 1;
        int basestrength = 1;
	
		int boostintellect = 1;
        int boostagility = 1;
        int booststrength = 1;

		int dice = 1;
	
		String name = "";
		
		public void setattirbutes(int bsi, int bsa, int bss, int boi, int boa, int bos, int dc) {
			this.baseintellect = bsi;
			this.baseagility = bsa;
			this.basestrength = bss;
			this.boostintellect = boi;
			this.boostagility = boa;
			this.booststrength = bos;
			this.dice = dc;
		}
	
		public void setname(String newname){
			this.name = newname;
		}
		
        public int[] returnbasevalues(){
            int[] thesevalues = {this.baseintellect, this.baseagility, this.basestrength};
            return thesevalues;
        }

        public int[] returnboostvalues(){
            int[] thesevalues = {this.boostintellect, this.boostagility, this.booststrength};
            return thesevalues;
        }

		public int[][] doroll(){
		    int[][] finalroll = new int[this.dice +1][3];

		    truelvalue basevalues = new truelvalue();
		    basevalues.setvalues(this.returnbasevalues());
			
			truelvalue totalroll = new truelvalue();
			
		    for (int i = this.dice; i > 0; i--){
                int dieroll = randominrange(dierolls.length);
                int[] rollresult = dierolls[dieroll];

				truelvalue thisbaseroll = new truelvalue(); 
                thisbaseroll.setvalues(this.returnbasevalues()); 
				thisbaseroll.setvalues(thisbaseroll.multiplier(rollresult)); 

				thisbaseroll.setvalues(thisbaseroll.combine(this.returnboostvalues()));
				totalroll.setvalues(totalroll.combine(thisbaseroll.returnvalues()));
				
                finalroll[i-1] = thisbaseroll.returnvalues();
			
				
				thisbaseroll.setvalues(this.returnbasevalues());
            }
		
			finalroll[finalroll.length-1] = totalroll.returnvalues();
			
            return finalroll;
        }

	}
	
//	public void addroller (){
//		//create the table layout for the block of information
//		LinearLayout dicebag = new LinearLayout (this);
//		LinearLayout.LayoutParams mainparams = new LinearLayout.LayoutParams(200, LinearLayout.LayoutParams.MATCH_PARENT);
//		dicebag.setLayoutParams(mainparams);
//		dicebag.setOrientation(1);
//		
//		//create the fiekda and the roll history button
//		LinearLayout basesection = new LinearLayout (this);
//		LinearLayout.LayoutParams columnparams = new LinearLayout.LayoutParams(100, LinearLayout.LayoutParams.FILL_PARENT);
//		basesection.setLayoutParams(columnparams);
//		basesection.setGravity(Gravity.CENTER | Gravity.BOTTOM);
//		basesection.setOrientation(1);
//	
//		LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(10, 10);
//		TextView basename = new TextView (this);
//		basename.setText(R.string.base);
//		basename.setLayoutParams(btnParams);
//	
//		TextView baseint = new TextView (this);
//		baseint.setText("1");
//		baseint.setLayoutParams(btnParams);
//		
//		TextView baseagi = new TextView (this);
//		baseagi.setText("1");
//		baseagi.setLayoutParams(btnParams);
//		
//		TextView basestr = new TextView (this);
//		basestr.setText("1");
//		basestr.setLayoutParams(btnParams);
//		
//		basesection.addView(basename);
//		basesection.addView(baseint);
//		basesection.addView(baseagi);
//		basesection.addView(basestr);
//	
//		//create the textfoeld for the name and make it clickabe 
//		TextView rollername = new TextView (this);
//		rollername.setText("a roller");
//		LinearLayout.LayoutParams rollernameparams = new LinearLayout.LayoutParams(100, LinearLayout.LayoutParams.WRAP_CONTENT);
//		rollername.setLayoutParams(rollernameparams);
//	
//		//add them to the dicebag
//		dicebag.addView(rollername);
//		dicebag.addView(basesection);
//	
//		//find the parent layout
//		LinearLayout rollercase = (LinearLayout)findViewById(R.id.rollercase);
//		
//		//add in the views and layouta to their parents
//		rollercase.addView(dicebag);
//		
//	
//		
//	}
}
