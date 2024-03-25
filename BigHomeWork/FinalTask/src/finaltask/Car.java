package finaltask;

import java.util.ArrayList;

public class Car {
	
	int Label;//����Ʒ��
	int Carnum;//���ı��
	int Full_capacity;//�����������
	int Now_capacity;//���ĵ�ǰ�ؿ���
	double Speed;//��������ٶ�
	double x = 0;//���������һ��ͣ��վ��λ��
	int Time_Start;//������ʼʱ��
	int NextStation = 1;//������һվ��վ��
	Road Now_Road = new Road();//Ŀǰ���ڵĳ�����1��2״̬�£�
	boolean Dir;//����ǰ�ķ���
	boolean isParking;//Ŀǰ�ó��Ƿ������һվ�³�
	//true��ʾ��BJ��XN��false��ʾ��XN��BJ
	int State = 0;//����ǰ��״̬��Ĭ��Ϊ0
	//0��ʾ�ڳ�վ��1��ʾ����ʻ�У�2��ʾ���³��еĵ�һ���ӣ�3��ʾ���³��еĵڶ����� 
	ArrayList<Passenger> Sitting = new ArrayList<>();
	int StartTime = 0;
	
	public Car(double speed,int capacity,int num,boolean dir) {
		Full_capacity = capacity;
		Speed = speed;
		Carnum = num;
		Dir = dir;
	}//���캯��
	
	void getPassenger(Passenger P) {//�ó˿��ϳ�
		P.State = true;
		P.NumOfCar = Carnum;
		State = 1;//��ʾ�ó���״̬Ϊ��ʻ��
		Now_capacity++;
		Sitting.add(P);
	}
	
	void start() {//�ó���ʼ����
		StartTime = XiBaoHighWay.time;
		if(Dir == true) Now_Road = Resources.RoadMap1.get(NextStation);
		else Now_Road = Resources.RoadMap2.get(NextStation);
		JudgeifDown();//ֱ���ж��Ƿ�������³�
		State = 1;//��������ʻ�е�״̬��
	}
	
	void JudgeifDown() {//�ж��Ƿ����������һվ�³�
		isParking = false;
		for(int i = 0;i<Sitting.size();i++) {
			Passenger temp = new Passenger();
			temp = Sitting.get(i);
			if(temp.Destintion == NextStation)//˵�����˻�����һվ�³� 
			{
			isParking = true;
			Sitting.remove(i);//��ǰ�����˰��ߣ��ٺ�
			i--;
			}
		}
	}
	
	void ArriveStation() {//������վѡ��ͣ��ͣ��
		NextStation++;
		x = 0;
		if(isParking == true) Parking();
		else if(isParking ==false && NextStation != 7) start();//��ѡ��ͣ�����������
		else if(isParking ==false && NextStation == 7) getEnd();
	}
	
	void Parking() {//��ʼͣ��������״̬2
		State = 2;
	}
	
	void getEnd() {//�ó������յ�վ����Ϊ����һվ̨�ĺ򲹳���
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
