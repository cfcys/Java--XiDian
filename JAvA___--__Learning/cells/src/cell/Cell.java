package cell;

import java.awt.Graphics;
 
public class Cell {
	private boolean alive = false;
	//Ϊʲô����û��ʹ��setAlive
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	//һ�¿�����С���񣿣�
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size);//ȥ��һ���߿�
		if ( alive ) {
			g.fillRect(x, y, size, size);//��Ԥ������ɫȥ���һ������
		}
	}
}
