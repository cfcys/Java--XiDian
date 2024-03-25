package shapes;

import java.awt.Graphics;
	//有一个抽象的函数（表达概念，而无法实现具体代码），则这个类也必须是抽象的。
public abstract class Shape {
	
	public abstract void draw(Graphics g);
	//这里的draw是***抽象***的，所以不能有{}来表示其行为。
	//shape同样也不能创建其对象。
}
