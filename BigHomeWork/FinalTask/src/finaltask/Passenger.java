package finaltask;

import java.util.Random;

public class Passenger {
	boolean State = false;//�˿͵�ǰ��״̬��true��ʾ�ڳ��ϣ�false��ʾ���ڳ���
	int NumOfCar = 0;//�˿ͳ����ĳ��ı��
	int Destintion = 0;//�˿�����վ�����³�
	Road NeiborRoad = new Road();
	public boolean Dir;//�˿͵ķ���
	Random RanNum = new Random();
	int Possibility = RanNum.nextInt(100);
	void getDes(){//ȷ���˿�Ҫ�³���վ
		if(Possibility <=5) Destintion = 1;
		else if(Possibility <=11) Destintion = 2;
		else if(Possibility <=27) Destintion = 3;
		else if(Possibility <=45) Destintion = 4;
		else if(Possibility <=70) Destintion = 5;
		else if(Possibility <=100) Destintion = 6;
		else {;}
	}
	void getDown() {
		
	}
}
