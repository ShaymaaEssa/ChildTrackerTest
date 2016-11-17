package nanodegree.mal.udacity.android.childtracker.GeoFence;

/**
 * Created by MOSTAFA on 17/11/2016.
 */

//this class to save the properties of the geofence
public class GeofenceCircle {
    private double lat;
    private double lng;
    private int radius;

    public GeofenceCircle(double lat, double lng, int radius) {
        this.lat = lat;
        this.lng = lng;
        this.radius = radius;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}