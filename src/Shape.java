/**
 * @author moorea
 * @version 1.0
 * @created 28-Nov-2012 10:09:27 AM
 */
public abstract class Shape extends Drawable {

	protected int fillColor;
	protected int lineColor;
	protected double size;
	protected Point originPoint;

	public Shape(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param fillColor
	 * @param lineColor
	 * @param originPoint
	 */
	public void Shape(int fillColor, int lineColor, Point originPoint){

	}

	protected abstract void calcSize();

	public void draw(){

	}

	public abstract double getSize();

}