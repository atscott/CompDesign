package lab2;

import java.util.Observable;

/**
 * @author marius
 * @version 1.0
 * @created 05-Dec-2012 9:54:35 AM
 */
public class GpsSubject extends Observable {

	private GPSCoordinate mGPSCoordinate;

	public GpsSubject() {

	}

    public void setCoordinates(GPSCoordinate newCoordinate){
        //TODO: set new coordinate. Optionally call coordinatesChanged if you want to setChanged() and notifyObservers()
        // if new coordinates meet certain criteria. Or always call coordinatesChanged.
    }

    public void coordinatesChanged(){
        //TODO: call setChanged() and notifyObservers()
    }

	public GPSCoordinate getCoordinates() {
		return mGPSCoordinate;
	}

}