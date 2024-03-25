package 自动售货机;

public class VendingMachine {
	int Price = 80;
	int Balance = 0;
	int Total = 0;
	void showWel() {
		System.out.println("Welcome!!!");
	}
	void insertMoney(int amount) {
		if(amount >= Price) {
		Balance = Balance + amount - Price;
		Total = Total + Price;
		}
	}
	void getFood() {
		System.out.println("Here you are!!!");
	}
	void showBal() {
		System.out.println("当前余额是"+Balance);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		VendingMachine Vm = new VendingMachine();
		Vm.showWel();
		Vm.insertMoney(100);
		Vm.getFood();
		Vm.showBal();
	}

}
