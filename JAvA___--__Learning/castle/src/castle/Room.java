package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();
//    private Room northExit;
//    private Room southExit;
//    private Room eastExit;
//    private Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    
    public void setExit(String dir,Room room) {
    	exits.put(dir, room);
    }
    //�����������Ķ���Ϊʲô�ǵȼ۵�
//    public void setExits(Room north, Room east, Room south, Room west) 
//    {
//        if(north != null)
//            northExit = north;
//        if(east != null)
//            eastExit = east;
//        if(south != null)
//            southExit = south;
//        if(west != null)
//            westExit = west;
//    }

    @Override
    public String toString() 
    {
        return description;
    }
    public StringBuffer getExitDesc(){
    	StringBuffer sb = new StringBuffer();
    	for(String dir : exits.keySet()) {
    		sb.append(dir);
    		sb.append(' ');
    	}
    	return sb;
    }
    //ǰ��һ����goRoom(������ѡ��Ҫȥ���Ǹ��ط�)
    public Room getExit(String direction) {
    	return exits.get(direction);
    }
}
