package finaltask;

import java.util.Random;

public class Passenger {
	boolean State = false;//乘客当前的状态，true表示在车上，false表示不在车上
	int NumOfCar = 0;//乘客乘坐的车的编号
	int Destintion = 0;//乘客有六站可以下车
	Road NeiborRoad = new Road();
	public boolean Dir;//乘客的方向。
	Random RanNum = new Random();
	int Possibility = RanNum.nextInt(100);
	void getDes(){//确定乘客要下车的站
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
