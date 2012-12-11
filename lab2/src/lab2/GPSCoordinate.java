
package lab2;

/**
 * This class represents a GPS coordinate
 */
public class GPSCoordinate {
    private double theta; // longitude in radians
    private double phi; // latitude in radians
    private double elevation;
    private static final double RADIANS = Math.PI / 180.0;
    private static final double RADIUS = 3955 * 5280;

    /**
     * Creates a GPSCoordinate from constituent GPS polar coordinates
     * 
     * @param longitude polar coordinate representing angle (in degrees) from
     *            the Prime Meridian
     * @param latitude polar coordinate representing angle (in degrees) above
     *            the equator
     * @param elevation polar coordinate representing elevation (in feet) above
     *            sea level
     */
    public GPSCoordinate(double longitude, double latitude, double elevation) {
        theta = latitude * RADIANS; // convert to radians
        phi = longitude * RADIANS;
        this.elevation = elevation;
    }

    /**
     * Returns the cartesian distance along the x-coordinate (in feet) from the
     * current GPSCoordinate to the reference GPSCoordinate
     * 
     * @param c reference GPSCoordinate
     * @return cartesian distance along the x-coordinate (in feet) between the
     *         current GPSCoordinate to the reference GPSCoordinate
     */
    public double getDeltaX(GPSCoordinate c) {
        return RADIUS * Math.cos(theta) * (phi - c.phi);
    }

    /**
     * Returns the cartesian distance along the y-coordinate (in feet) from the
     * current GPSCoordinate to the reference GPSCoordinate
     * 
     * @param c reference GPSCoordinate
     * @return cartesian distance along the y-coordinate (in feet) between the
     *         current GPSCoordinate to the reference GPSCoordinate
     */
    public double getDeltaY(GPSCoordinate c) {
        return RADIUS * (theta - c.theta);
    }

    /**
     * Returns the cartesian distance along the z-coordinate (in feet) from the
     * current GPSCoordinate to the reference GPSCoordinate
     * 
     * @param c reference GPSCoordinate
     * @return cartesian distance along the z-coordinate (in feet) between the
     *         current GPSCoordinate to the reference GPSCoordinate
     */
    public double getDeltaZ(GPSCoordinate c) {
        return elevation - c.elevation;
    }

    /**
     * @return the latitude of this GPSCoordinate, in degrees
     */
    public double getLatitude() {
        return theta / RADIANS;
    }

    /**
     * @return the longitude of this GPSCoordinate, in degrees
     */
    public double getLongitude() {
        return phi / RADIANS;
    }

    /**
     * @return the elevation of this GPSCoordinate, in feet
     */
    public double getElevation() {
        return elevation;
    }
}
