package com.underscoretec.colib;

/**
 * Created by sourav on 18/07/18.
 */

public class Point
{
    /**
     * Representation of a Latitude/Longitude pair Point in the map.
     */

    float mLatitude;
    float mLongitude;

    public Point(float latitude, float longitude) {
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public float getLongitude() {
        return mLongitude;
    }

}
