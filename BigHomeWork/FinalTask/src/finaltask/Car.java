package finaltask;

import java.util.ArrayList;

public class Car {
	
	int Label;//车的品牌
	int Carnum;//车的编号
	int Full_capacity;//车的最大容量
	int Now_capacity;//车的当前载客量
	double Speed;//车的最大速度
	double x = 0;//车相对于上一个停靠站的位置
	int Time_Start;//车的起始时间
	int NextStation = 1;//定义下一站的站号
	Road Now_Road = new Road();//目前所在的车道（1和2状态下）
	boolean Dir;//车当前的方向
	boolean isParking;//目前该车是否会在下一站下车
	//true表示从BJ到XN；false表示从XN到BJ
	int State = 0;//车当前的状态，默认为0
	//0表示在车站，1表示在行驶中，2表示在下车中的第一分钟，3表示在下车中的第二分钟 
	ArrayList<Passenger> Sitting = new ArrayList<>();
	int StartTime = 0;
	
	public Car(double speed,int capacity,int num,boolean dir) {
		Full_capacity = capacity;
		Speed = speed;
		Carnum = num;
		Dir = dir;
	}//构造函数
	
	void getPassenger(Passenger P) {//让乘客上车
		P.State = true;
		P.NumOfCar = Carnum;
		State = 1;//表示该车的状态为行驶中
		Now_capacity++;
		Sitting.add(P);
	}
	
	void start() {//该车开始启动
		StartTime = XiBaoHighWay.time;
		if(Dir == true) Now_Road = Resources.RoadMap1.get(NextStation);
		else Now_Road = Resources.RoadMap2.get(NextStation);
		JudgeifDown();//直接判断是否会有人下车
		State = 1;//车进入行驶中的状态。
	}
	
	void JudgeifDown() {//判断是否会有人在下一站下车
		isParking = false;
		for(int i = 0;i<Sitting.size();i++) {
			Passenger temp = new Passenger();
			temp = Sitting.get(i);
			if(temp.Destintion == NextStation)//说明有人会在下一站下车 
			{
			isParking = true;
			Sitting.remove(i);//提前将这人搬走，嘿嘿
			i--;
			}
		}
	}
	
	void ArriveStation() {//车经过站选择停不停车
		NextStation++;
		x = 0;
		if(isParking == true) Parking();
		else if(isParking ==false && NextStation != 7) start();//若选择不停车，则接着跑
		else if(isParking ==false && NextStation == 7) getEnd();
	}
	
	void Parking() {//开始停车，进入状态2
		State = 2;
	}
	
	void getEnd() {//该车到达终点站，成为另外一站台的候补车辆
		State = 0;
		NextStation = 1;
		if(Dir == true) 
		{
			Dir = false;
			if(Label == 1) Resources.XN.VolNum++;
			else Resources.XN.IveNum++;
		}
		else 
		{
			Dir = true;
			if(Label == 1) Resources.BJ.VolNum++;
			else Resources.BJ.IveNum++;
		}
	}
}
