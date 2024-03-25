import java.util.Random;
public class Hello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand_num = new Random();
		int val = rand_num.nextInt(2);
		
		if(val == 0)
		{
			System.out.println("Ñ§python£¡");
		}
		else
		{
			System.out.printf("Ñ§java£¡");
		}
	}

}
