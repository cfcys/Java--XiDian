package �Զ��ۻ���;

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
		System.out.println("��ǰ�����"+Balance);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		VendingMachine Vm = new VendingMachine();
		Vm.showWel();
		Vm.insertMoney(100);
		Vm.getFood();
		Vm.showBal();
	}

}
