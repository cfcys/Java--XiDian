package finaltask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class XiBaoHighWay {
	//һЩ�ȶ�����֪�Ķ���
	public static int time = 0;
	public static int Carnum = 36; //��������
	public static Car[] CarArray = Func.CreatCar(Carnum);
	
	void start() throws InterruptedException {	
		//�����ѭ��
		for(time = 0;time < 630;time++) {
			//ÿ��һ��ѭ��ִ��һ�Σ�Ҳ���ǳ����ж�Ӧ��һ���ӡ�
			//time=0��Ӧ��ʵ�е�7��30��
			Thread.sleep(100);
			//�������ͱ���վ������ɳ˿�
			Resources.XN.GenerateNum();
			Resources.BJ.GenerateNum();
			Func.PrintWaitingPass();
			Func.PrintTime();	
			Func.PrintCarThings();
			Resources.getMap();
			//����
			Resources.BJ.Depart(CarArray); 
			Resources.XN.Depart(CarArray);
			Func.CarRunning();
			
		}
	}

}
