package task3;

public class Postgaduate extends Student{

	Postgaduate(String name, int C1, int C2, int C3, int C4, int C5, int C6, int C7) {
		super(name, C1, C2, C3, C4, C5, C6, C7);
		// TODO 自动生成的构造函数存根
	}

	public void getGrade() {
		for(int i = 0;i<7;i++) {
			if(Course[i] <= 100 && Course[i] >= 95) Grade[i] = "A";
			if(Course[i] < 95 && Course[i] >= 85) Grade[i] = "B";
			if(Course[i] < 85 && Course[i] >= 70) Grade[i] = "C";
			if(Course[i] < 70) Grade[i] = "不合格";
		}
	}
}
