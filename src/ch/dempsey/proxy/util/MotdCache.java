package ch.dempsey.proxy.util;

import java.util.ArrayList;
import java.util.Random;

public class MotdCache {

	private static ArrayList<String> motds = new ArrayList<String>();
	
	
	public static void add(String motd) {
		motds.add(motd);
	}
	
	public static void remove(String motd) {
		motds.remove(motd);
	}
	
	public static boolean contains(String str) {
		return motds.contains(str);
	}
	
	public static String rotate() {
		Random r = new Random();
		return motds.get(r.nextInt(motds.size()-1));
	}
	
}
