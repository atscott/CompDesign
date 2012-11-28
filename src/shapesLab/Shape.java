package shapesLab;
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

	/**
	 * 
	 * @param fillColor
	 * @param lineColor
	 * @param originPoint
	 */
	public Shape(int fillColor, int lineColor, Point originPoint){

	}

	protected abstract void calcSize();

	@Override
	public void draw(){

	}

	public abstract double getSize();

}