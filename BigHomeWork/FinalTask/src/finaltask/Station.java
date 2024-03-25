package finaltask;

import java.util.ArrayList;
import java.util.Random;

public class Station {
	int Num;//��վ���
	int NumFromLast;//��վ������һվ�ľ���
	String Name;//��վ������
	Road NeighborRoad = new Road();
	int VolNum = 0;//��վ���е��ֶ��ֳ��͵�������
	int IveNum = 0;//��վ���е���ά�³��͵�������
	int PassengerNum = 0;//��BJվ��XNվĿǰ�ĳ˿͵�������
	//���������Ծ�Ϊ�������յ��BJ��XNվ���еġ�
	
	int Pn;//�ڱ���վ������վÿ���Ӳ����ĳ˿�����
	Random rPessengerGenerateInOneMin = new Random();
	Station(int numx,int numy,int num1,int num2,String name){
		VolNum = numx;
		IveNum = numy;
		Num = num1;
		NumFromLast = num2;
		Name = name;
	}
	void GenerateNum() {//��������˿͵ĺ���
		Pn = rPessengerGenerateInOneMin.nextInt(3);
		PassengerNum += Pn;
	}
	
	ArrayList<Passenger> GetPassenger(boolean dir) {//�õ����������ڵȴ��ĳ˿͵Ķ��������	
	ArrayList<Passenger> PList = new ArrayList<>();
		for(int i = 0;i<PassengerNum;i++) {
			Passenger temp = new Passenger();
			temp.getDes();
			temp.Dir = dir;
			PList.add(temp);
		}
		return PList;
	}
	
	ArrayList<Car> GetCar(boolean dir,Car[] C,int label){//�õ�Ŀǰ�ڸó�վ��ͣ���ĳ���
	ArrayList<Car> CList = new ArrayList<>();
		for (int i = 0; i < C.length; i++) {
			if(C[i].Dir == dir && C[i].State == 0 && C[i].Label == label) {
				CList.add(C[i]);
			}
		}
		return 	CList;	
	}
	
	boolean IsAvaiableforIve(){//�ж��Ƿ�������ά�·�������
	if(PassengerNum == 0 || IveNum == 0) {
		return false;
	}else {
		return true;
		}
	}
	
	boolean IsAvaiableforVol(){//�ж��Ƿ������ֶ��ַ�������
	if(PassengerNum == 0 || VolNum == 0) {
		return false;
	}else {
		return true;
		}
	}
	
	//�ж���ά�·��������  
	//���س�վĿǰ�����
	void StationStart(boolean Dir,Car[] CarArray,int Label) {
	if((!IsAvaiableforIve() && Label == 0) || (!IsAvaiableforVol() && Label == 1)) ;//����û��վ̨�˿ͻ���û����ά�´��ڣ��ʲ���ִ��
	else {
	ArrayList<Passenger> Temp1 = new ArrayList<>();
	ArrayList<Car> Temp2 = new ArrayList<>();				
	Temp1 = GetPassenger(Dir);
	Temp2 = GetCar(Dir,CarArray,Label);
	for(int i = 0;i<Temp2.size();i++) {
		if(Temp1.size() == 0) break;
		Car TempCar = Temp2.get(i);
		TempCar.start();//�ó�����Start��״̬
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
//	System.out.println("��"+Name+"Ŀǰ����"+PassengerNum+"���˿͡�");
	}
	
	void Depart(Car[] CarArray) {//���������ĺ���
	int Label = 99999;
	if(XiBaoHighWay.time >= 60 && (XiBaoHighWay.time % 60 == 0) ) Label = 1;	//�ֶ��ַ���ʱ���
	if(XiBaoHighWay.time >= 30 && ((XiBaoHighWay.time - 30) % 20) == 0) Label = 0;//��ά�·���ʱ���
	if(Name == "BJվ" && Label == 1) StationStart(true,CarArray,1);
	else if(Name == "XNվ" && Label == 0) StationStart(false,CarArray,0);
	else if(Name == "BJվ" && Label == 0) StationStart(true,CarArray,0);
	else if(Label != 99999) StationStart(false,CarArray,1);
	}
}
