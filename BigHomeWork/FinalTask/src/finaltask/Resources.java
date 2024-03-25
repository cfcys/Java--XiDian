package finaltask;

import java.util.ArrayList;
import java.util.HashMap;

public class Resources {
	public static Station BJ = new Station(4,15,4,15,"BJվ");
	public static Station GZ = new Station(0,0,24,24,"GZվ");
	public static Station CP = new Station(0,0,45,21,"CPվ");
	public static Station WG = new Station(0,0,107,62,"WGվ");
	public static Station XP = new Station(0,0,128,21,"XPվ");
	public static Station XY = new Station(0,0,152,24,"XYվ");
	public static Station XN = new Station(5,12,174,22,"XNվ");
	public static Road R1 = new Road(BJ,GZ);
	public static Road R2 = new Road(GZ,CP);
	public static Road R3 = new Road(CP,WG);
	public static Road R4 = new Road(WG,XP);
	public static Road R5 = new Road(XP,XY);
	public static Road R6 = new Road(XY,XN);
	public static HashMap<Integer,Road> RoadMap1 = new HashMap<>();
	public static HashMap<Integer,Road> RoadMap2 = new HashMap<>();
	public static void getMap() {
		RoadMap1.put(1, R1);
		RoadMap1.put(2, R2);
		RoadMap1.put(3, R3);
		RoadMap1.put(4, R4);
		RoadMap1.put(5, R5);
		RoadMap1.put(6, R6);
		RoadMap2.put(1, R6);
		RoadMap2.put(2, R5);
		RoadMap2.put(3, R4);
		RoadMap2.put(4, R3);
		RoadMap2.put(5, R2);
		RoadMap2.put(6, R1);
	}
}
