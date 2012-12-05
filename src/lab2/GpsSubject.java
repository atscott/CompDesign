package lab2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author marius
 * @version 1.0
 * @created 05-Dec-2012 9:54:35 AM
 */
public class GpsSubject extends Observable {

	private GPSCoordinate mGPSCoordinate;

	public GpsSubject() {

	}

	/**
	 * 
	 * @param o
	 */
	@Override
	public void addObserver(Observer o) {

	}

	public GPSCoordinate getCoordinates() {
		return null;
	}

}