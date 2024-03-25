package finaltask;

public class Func {
	public static void PrintWaitingPass() {//打印等待中乘客的函数
		System.out.print("在"+Resources.BJ.Name+"等待的乘客有"+Resources.BJ.PassengerNum+"个	");
		System.out.print("在"+Resources.XN.Name+"等待的乘客有"+Resources.XN.PassengerNum+"个	");
	}
	/////////////////////////////////////////////////////////////////////////////
	public static void PrintTime() {//打印当前时间的函数。
		int time = XiBaoHighWay.time + 30;
		int h = time/60 + 7;
		int m = time%60;
		if(m <= 10 && m >= 0 ) System.out.println(h+":"+0+m); 
		else System.out.println(h+":"+m+"  "+"第"+Main.Day+"天");	
	}
	/////////////////////////////////////////////////////////////////////////////
	public static void PrintCarThings() {//打印车的情况
	Car[] temp = XiBaoHighWay.CarArray;
	System.out.println("************************************************************************************");
	System.out.println("编号       "+"车型         "+"状态                "+"距离上一站的距离            ");
	for(int i = 0;i<XiBaoHighWay.Carnum;i++) {
		System.out.printf("%-10s",temp[i].Carnum+"      ");
		if(temp[i].Label == 1) System.out.print("沃尔沃    ");
		else System.out.print("依维柯    ");
		if(temp[i].State == 0) {
			if(temp[i].Dir == true) System.out.print("在BJ站停靠              ");
			else System.out.print("在XN站停靠              ");
			}
		if(temp[i].State == 1) 
			{if(temp[i].Dir == true)System.out.print("在从"+temp[i].Now_Road.Start+"到"+temp[i].Now_Road.End+"的道路上运行");
			else System.out.print("在从"+temp[i].Now_Road.End+"到"+temp[i].Now_Road.Start+"的道路上运行");	}
		if(temp[i].State == 2 || temp[i].State == 3)
			{if(temp[i].Dir == true) System.out.print("有乘客在"+temp[i].Now_Road.End+"停车中       ");
			else System.out.printf("有乘客在"+temp[i].Now_Road.Start+"停车中       ");}
		double d = temp[i].x;
		d = (double) Math.round(d * 100) / 100;
		System.out.printf("%10s",d);
		System.out.println("");}
	System.out.println("************************************************************************************");
	}
	/////////////////////////////////////////////////////////////////////////////
	public static Car[] CreatCar(int num) {//创建车辆的函数
		Car[] CarArray = new Car[num];
		for(int i = 0;i<num;i++) {
			if(i < Resources.BJ.VolNum) CarArray[i] = new Volvo(i+1,true);
			else if(i < Resources.BJ.VolNum+Resources.BJ.IveNum) CarArray[i] = new Iveco(i+1, true);
			else if(i < Resources.BJ.VolNum+Resources.BJ.IveNum+Resources.XN.VolNum) CarArray[i] = new Volvo(i+1,false);
			else CarArray[i] = new Iveco(i+1, false);
		}
		return CarArray;
	}
	/////////////////////////////////////////////////////////////////////////////
	public static void CarRunning() {//该函数用于大街上车辆的情况
		for(int i = 0;i<XiBaoHighWay.CarArray.length;i++) {
			Car temp = XiBaoHighWay.CarArray[i];
			if(temp.State == 1) {temp.x += temp.Speed;//
			if(temp.x >= temp.Now_Road.length) { temp.ArriveStation();}}
			else if(temp.State == 2) {temp.State++;}
			else if(temp.State == 3 && temp.NextStation != 7) {temp.start();}
			else if(temp.State == 3 && temp.NextStation == 7) {temp.getEnd();}
		}
		System.out.println();
	}
}
