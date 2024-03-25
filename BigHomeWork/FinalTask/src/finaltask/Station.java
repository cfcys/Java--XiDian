package finaltask;

import java.util.ArrayList;
import java.util.Random;

public class Station {
	int Num;//车站编号
	int NumFromLast;//车站距离上一站的距离
	String Name;//车站的名字
	Road NeighborRoad = new Road();
	int VolNum = 0;//车站具有的沃尔沃车型的数量。
	int IveNum = 0;//车站具有的依维柯车型的数量。
	int PassengerNum = 0;//在BJ站和XN站目前的乘客的数量。
	//这三个属性均为在起点和终点的BJ和XN站特有的。
	
	int Pn;//在宝鸡站和西安站每分钟产生的乘客数量
	Random rPessengerGenerateInOneMin = new Random();
	Station(int numx,int numy,int num1,int num2,String name){
		VolNum = numx;
		IveNum = numy;
		Num = num1;
		NumFromLast = num2;
		Name = name;
	}
	void GenerateNum() {//随机产生乘客的函数
		Pn = rPessengerGenerateInOneMin.nextInt(3);
		PassengerNum += Pn;
	}
	
	ArrayList<Passenger> GetPassenger(boolean dir) {//得到包含有正在等待的乘客的对象的链表	
	ArrayList<Passenger> PList = new ArrayList<>();
		for(int i = 0;i<PassengerNum;i++) {
			Passenger temp = new Passenger();
			temp.getDes();
			temp.Dir = dir;
			PList.add(temp);
		}
		return PList;
	}
	
	ArrayList<Car> GetCar(boolean dir,Car[] C,int label){//得到目前在该车站的停留的车辆
	ArrayList<Car> CList = new ArrayList<>();
		for (int i = 0; i < C.length; i++) {
			if(C[i].Dir == dir && C[i].State == 0 && C[i].Label == label) {
				CList.add(C[i]);
			}
		}
		return 	CList;	
	}
	
	boolean IsAvaiableforIve(){//判断是否满足依维柯发车条件
	if(PassengerNum == 0 || IveNum == 0) {
		return false;
	}else {
		return true;
		}
	}
	
	boolean IsAvaiableforVol(){//判断是否满足沃尔沃发车条件
	if(PassengerNum == 0 || VolNum == 0) {
		return false;
	}else {
		return true;
		}
	}
	
	//判断依维柯发车的情况  
	//返回车站目前的情况
	void StationStart(boolean Dir,Car[] CarArray,int Label) {
	if((!IsAvaiableforIve() && Label == 0) || (!IsAvaiableforVol() && Label == 1)) ;//由于没有站台乘客或者没有依维柯存在，故不再执行
	else {
	ArrayList<Passenger> Temp1 = new ArrayList<>();
	ArrayList<Car> Temp2 = new ArrayList<>();				
	Temp1 = GetPassenger(Dir);
	Temp2 = GetCar(Dir,CarArray,Label);
	for(int i = 0;i<Temp2.size();i++) {
		if(Temp1.size() == 0) break;
		Car TempCar = Temp2.get(i);
		TempCar.start();//该车进入Start的状态
		if(Label == 1) VolNum--;
		else IveNum--;
		
		for(int j = 0;j<21;j++) {
			Passenger TempPass = Temp1.get(0);
			TempCar.getPassenger(TempPass);
			Temp1.remove(0);
			PassengerNum--;
			if(Temp1.size() == 0) break;
			}
		}
	}
//	System.out.println("在"+Name+"目前还有"+PassengerNum+"名乘客。");
	}
	
	void Depart(Car[] CarArray) {//汽车发车的函数
	int Label = 99999;
	if(XiBaoHighWay.time >= 60 && (XiBaoHighWay.time % 60 == 0) ) Label = 1;	//沃尔沃发车时间点
	if(XiBaoHighWay.time >= 30 && ((XiBaoHighWay.time - 30) % 20) == 0) Label = 0;//依维柯发车时间点
	if(Name == "BJ站" && Label == 1) StationStart(true,CarArray,1);
	else if(Name == "XN站" && Label == 0) StationStart(false,CarArray,0);
	else if(Name == "BJ站" && Label == 0) StationStart(true,CarArray,0);
	else if(Label != 99999) StationStart(false,CarArray,1);
	}
}
