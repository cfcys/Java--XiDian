package task3;

import java.util.Scanner;

public class main {
public static class Stu{
	String num,name,ClassNum;
	int scoreC,scoreE,scoreM,scoreAver;
	void getInfor(String num,String name,String classNum){
		this.num = num;
		this.name = name;
		this.ClassNum = classNum;
	}
	void getScore(int C,int E,int M) {
		this.scoreC = C;
		this.scoreE = E;
		this.scoreM = M;
	}
}
public static class Teacher{
	String Num,Name,Title,Department;
	Teacher(String num,String name,String title,String department){
	this.Num = num;this.Name = name;
	this.Title = title;this.Department = department;
	}
	void LuRu(Stu stu){
		System.out.println("现在"+Name+"老师在录入学号为"+stu.num+"的"+stu.name+"同学的成绩:");
		Scanner in =  new Scanner(System.in);
		stu.scoreC = in.nextInt();
		stu.scoreE = in.nextInt();
		stu.scoreM = in.nextInt();
	}
	void TongJi(Stu stu) {
		stu.scoreAver = (stu.scoreC+stu.scoreE+stu.scoreM)/3;
		System.out.println("老师统计出了"+stu.name+"的成绩:");
		System.out.println(stu.name+"的均分为"+stu.scoreAver);
	}
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stu[] stu = new Stu[10];
		float AverC = 0,AverM = 0,AverE = 0;
		Teacher Liu = new Teacher("001","Liu","director"," School of Computer Science");
		for(int i = 0;i<=9;i++) {
			stu[i] = new Stu();
		}
		stu[0].getInfor("001", "XiaoMing", "202101");
		stu[1].getInfor("002", "XiaoHong", "202101");
		stu[2].getInfor("003", "XiaoLi", "202101");
		stu[3].getInfor("004", "XiaoLan", "202101");
		stu[4].getInfor("005", "XiaoMei", "202101");
		stu[5].getInfor("006", "XiaoHei", "202101");
		stu[6].getInfor("007", "XiaoXin", "202101");
		stu[7].getInfor("008", "XiaoHua", "202101");
		stu[8].getInfor("009", "XiaoLei", "202101");
		stu[9].getInfor("010", "XiaoLing", "202101");
		for(int i = 0;i<=9;i++) {
			Liu.LuRu(stu[i]);
			AverC += stu[i].scoreC;
			AverE += stu[i].scoreE;
			AverM += stu[i].scoreM;
			Liu.TongJi(stu[i]);
		}
		AverC = AverC / 10;
		AverE = AverE / 10;
		AverM = AverM / 10;
		System.out.println("现在全班的语文均分为:"+AverC+"英语均分为:"+AverE+"数学均分为："+AverM);
	}
}