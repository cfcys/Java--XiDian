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
		System.out.println("现在"+Name+"老师在录入"+stu.name+"的成绩:");
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
		Teacher Liu = new Teacher("001","Liu","director","foreign languages institute");
		.getInfor("123456","XiaoMing","20210001");
		Liu.LuRu(XiaoMing);
		Liu.TongJi(XiaoMing);		
	}
}