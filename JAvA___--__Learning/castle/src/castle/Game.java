package castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<>();
    
    public Game() 
    {
//    	handlers.put("go",new HandlerGo());//go是什么，想下之前的指令
    	handlers.put("bye", new HandlerBye(this));//这里new一个这个是在干啥啊
    	handlers.put("help", new HandlerHelp(this));//new了之后有啥用呢
    	handlers.put("go", new HandlerGo(this));
        createRooms();
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口(这个函数已经没有了，我们更推荐去一个一个的去设置)
        //  这样的话可以看到可以任意地去添加一些东西
        outside.setExit("east",lobby);//外面的东边是休息室
        outside.setExit("south", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north", outside);
        study.setExit("east",bedroom);
        bedroom.setExit("west", study);
        lobby.setExit("up", pub);
        pub.setExit("down",lobby);
        
        currentRoom = outside;
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();
    }

    // 以下为用户命令

   public void goRoom(String direction) 
    {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
    //showPrompt
	public void showPrompt() {
        System.out.println("你在" + currentRoom);
        System.out.print("出口有: ");
        System.out.print(currentRoom.getExitDesc());//成功替换，降低偶然性
        System.out.println();
	}
	
	public void Play() {
		Scanner in = new Scanner(System.in);
        while ( true ) {
    		String line = in.nextLine();
    		String[] words = line.split(" ");
    		Handler handler = handlers.get(words[0]);
    		String value = "";
    		if(words.length > 1)
    		{
    			value = words[1];
    		}
    		if(handler != null) {
    			handler.doCmd(value);
    			if(handler.isBye()) {
    				break;//现在就是可以bye出来了
    			}
    		}
    }
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Game game = new Game();
		game.printWelcome();
		game.Play();
        
        System.out.println("感谢您的光临。再见！");
        in.close();
	}

}
