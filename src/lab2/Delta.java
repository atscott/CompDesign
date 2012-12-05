package lab2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author marius
 * @version 1.0
 * @created 05-Dec-2012 9:54:32 AM
 */
public class Delta implements Observer, Displayable {
    private GPSCoordinate lastCoordinate;
    private GPSCoordinate currentCoordinate;
    private Observable subject;

	public Delta(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);

	}

	@Override
	public void display() {

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}