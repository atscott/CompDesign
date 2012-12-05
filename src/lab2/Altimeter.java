package lab2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author moorea
 * @version 1.0
 * @created 05-Dec-2012 9:54:32 AM
 */
public class Altimeter implements Observer, Displayable {

    private int currentAltitude;

	public Altimeter() {
        currentAltitude = 0;
	}

	@Override
	public void display() {
         System.out.println("Current Altitude: " + currentAltitude);
	}

	@Override
	public void update(Observable o, Object arg) {

	}

}