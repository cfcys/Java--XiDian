package finaltask;

public class Func {
	public static void PrintWaitingPass() {//��ӡ�ȴ��г˿͵ĺ���
		System.out.print("��"+Resources.BJ.Name+"�ȴ��ĳ˿���"+Resources.BJ.PassengerNum+"��	");
		System.out.print("��"+Resources.XN.Name+"�ȴ��ĳ˿���"+Resources.XN.PassengerNum+"��	");
	}
	/////////////////////////////////////////////////////////////////////////////
	public static void PrintTime() {//��ӡ��ǰʱ��ĺ�����
		int time = XiBaoHighWay.time + 30;
		int h = time/60 + 7;
		int m = time%60;
		if(m <= 10 && m >= 0 ) System.out.println(h+":"+0+m); 
		else System.out.println(h+":"+m+"  "+"��"+Main.Day+"��");	
	}
	/////////////////////////////////////////////////////////////////////////////
	public static void PrintCarThings() {//��ӡ�������
	Car[] temp = XiBaoHighWay.CarArray;
	System.out.println("************************************************************************************");
	System.out.println("���       "+"����         "+"״̬                "+"������һվ�ľ���            ");
	for(int i = 0;i<XiBaoHighWay.Carnum;i++) {
		System.out.printf("%-10s",temp[i].Carnum+"      ");
		if(temp[i].Label == 1) System.out.print("�ֶ���    ");
		else System.out.print("��ά��    ");
		if(temp[i].State == 0) {
			if(temp[i].Dir == true) System.out.print("��BJվͣ��              ");
			else System.out.print("��XNվͣ��              ");
			}
		if(temp[i].State == 1) 
			{if(temp[i].Dir == true)System.out.print("�ڴ�"+temp[i].Now_Road.Start+"��"+temp[i].Now_Road.End+"�ĵ�·������");
			else System.out.print("�ڴ�"+temp[i].Now_Road.End+"��"+temp[i].Now_Road.Start+"�ĵ�·������");	}
		if(temp[i].State == 2 || temp[i].State == 3)
			{if(temp[i].Dir == true) System.out.print("�г˿���"+temp[i].Now_Road.End+"ͣ����       ");
			else System.out.printf("�г˿���"+temp[i].Now_Road.Start+"ͣ����       ");}
		double d = temp[i].x;
		d = (double) Math.round(d * 100) / 100;
		System.out.printf("%10s",d);
		System.out.println("");}
	System.out.println("************************************************************************************");
	}
	/////////////////////////////////////////////////////////////////////////////
	public static Car[] CreatCar(int num) {//���������ĺ���
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
	public static void CarRunning() {//�ú������ڴ���ϳ��������
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
