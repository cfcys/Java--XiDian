package task3;

public class Main {
	public static void main(String[] args) {
		Student[] Stu = new Student[12];
		Undergaduate Ug1 = new Undergaduate("Jane",98,87,75,90,88,91,100);
		Undergaduate Ug2 = new Undergaduate("Lion",95,81,68,91,56,69,94);
		Undergaduate Ug3 = new Undergaduate("Herbert",91,87,92,88,68,99,78);
		Undergaduate Ug4 = new Undergaduate("Marshall",90,75,77,97,88,91,100);
		Undergaduate Ug5 = new Undergaduate("Elijah",88,61,89,81,85,85,74);
		Undergaduate Ug6 = new Undergaduate("Theodore",78,96,47,79,89,81,86);
		Undergaduate Ug7 = new Undergaduate("Baron",99,69,95,85,100,76,80);
		Postgaduate Pg1 = new Postgaduate("Roderick",96,90,78 , 65, 59, 100,96 );
		Postgaduate Pg2 = new Postgaduate("Ralap",98,95,78,88,89,99,100);
		Postgaduate Pg3 = new Postgaduate("Frederic",85,65,94,95,100,82,64);
		Postgaduate Pg4 = new Postgaduate("Alan",79,78,75,85,94,96,66);
		Postgaduate Pg5 = new Postgaduate("Kennedy",95,95,75,96,75,74,99);
		Stu[0] = Ug1;
		Stu[1] = Ug2;
		Stu[2] = Ug3;
		Stu[3] = Ug4;
		Stu[4] = Ug5;
		Stu[5] = Ug6;
		Stu[6] = Ug7;
		Stu[7] = Pg1;
		Stu[8] = Pg2;
		Stu[9] = Pg3;
		Stu[10] = Pg4;
		Stu[11] = Pg5;
		int num = 0;//
		System.out.println("开始打印成绩单：");
		for(int i = 0;i<12;i++) {
			Stu[i].getGrade();
			for(int j = 0;j<7;j++)
			{
				if(Stu[i].Grade[j] == "不合格") Stu[i].isGuaKe = true;
			}
			System.out.print(Stu[i].Name+"的七门成绩等级分别是:");
			for(int j = 0;j<7;j++) {
				System.out.print(Stu[i].Grade[j]+" ");
			}
			System.out.println();
			if(Stu[i].isGuaKe == true) num++;
		}
		System.out.println("在其中全班挂科的有"+num+"个人");		
	}
}
