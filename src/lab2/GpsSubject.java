package lab2;

import java.util.Observable;

/**
 * @author marius
 * @version 1.0
 * @created 05-Dec-2012 9:54:35 AM
 */
public class GpsSubject extends Observable {

	private GPSCoordinate mGPSCoordinate;

	public void setCoordinates(GPSCoordinate newCoordinate) {
		mGPSCoordinate = newCoordinate;
		coordinatesChanged();
	}

	public void coordinatesChanged() {
		setChanged();
		notifyObservers(mGPSCoordinate);
	}

	public GPSCoordinate getCoordinates() {
		return mGPSCoordinate;
	}

}