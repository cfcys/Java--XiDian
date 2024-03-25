package castle;

public class HandlerBye extends Handler {
	public HandlerBye(Game game) {
		super(game);
	}//这就是子类的构造
	@Override
	public boolean isBye() {
		return true;
	}

	
	
}
