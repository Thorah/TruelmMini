package com.sakrai.truelmini;

import java.util.Random;
import java.lang.Math;

public class myrandom
{
	public static int randominrange(int max){
        Random random = new Random();
        return random.nextInt(max);
	}
	
	public static int randomfromandto(int from, int to){
		if(from == to){
			return from;
		}else{
			int shiftvalue = 0 + from;
			int maxgenerate = to - from;
			int result = randominrange(maxgenerate+1);
			result = result + shiftvalue;
			return result;
		}
	
	}
	


	public int randomfromandtogoverned(int from, int to, int governor){
		int result = 0;
	
		if (governor > 0){
			result = randomfromandto(from + governor, to);
		} else if (governor < 0){
			result = randomfromandto(from , to - governor); 
		}
		
		return result;
	}
}
