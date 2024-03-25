package cell;

import java.awt.Graphics;
 
public class Cell {
	private boolean alive = false;
	//为什么这里没有使用setAlive
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	//一下可能是小方格？？
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size);//去画一个线框
		if ( alive ) {
			g.fillRect(x, y, size, size);//用预定的颜色去填充一个矩形
		}
	}
}
