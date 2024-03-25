package finaltask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class XiBaoHighWay {
	//一些稳定且已知的东西
	public static int time = 0;
	public static int Carnum = 36; //车的总数
	public static Car[] CarArray = Func.CreatCar(Carnum);
	
	void start() throws InterruptedException {	
		//大的主循环
		for(time = 0;time < 630;time++) {
			//每隔一秒循环执行一次，也就是程序中对应的一分钟。
			//time=0对应现实中的7：30。
			Thread.sleep(100);
			//在西安和宝鸡站随机生成乘客
			Resources.XN.GenerateNum();
			Resources.BJ.GenerateNum();
			Func.PrintWaitingPass();
			Func.PrintTime();	
			Func.PrintCarThings();
			Resources.getMap();
			//发车
			Resources.BJ.Depart(CarArray); 
			Resources.XN.Depart(CarArray);
			Func.CarRunning();
			
		}
	}

}
