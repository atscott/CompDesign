
package lab2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author tohtz
 * @version 1.0
 * @created 05-Dec-2012 9:54:32 AM
 */
public class Direction implements Observer, Displayable {
    GpsSubject subject;

    public Direction(Observable o) {
        subject = (GpsSubject) o;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        if (subject != null) {
            System.out.println("==Location display==");
            System.out.print("Latitude: " + subject.getCoordinates().getLatitude() + ", ");
            System.out.print("Longitude: " + subject.getCoordinates().getLongitude() + "\n");
            // System.out.print("Elevation: " +
            // subject.getCoordinates().getElevation() + "\n");
        }
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o != null) {
            subject = (GpsSubject) o;
        }
        display();
    }

}
