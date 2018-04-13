package com.example.android.madridaccessible;

/**
 * {@link Place} represents a place that the user can visit
 * It contains resource IDs for the place name, place description and
 * optional image file for that place.
 */
public class Place {

    /** String resource ID for the name of the place*/
    private int mPlaceNameId;

    /** String resource ID for the description of the place */
    private int mPlaceDescriptionId;


    /** Image resource ID for the place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param placeNameId is the string resource ID for the description
     *                             of a place to visit
     * @param placeDescriptionId is the string resource Id for a place
     */
    public Place(int placeNameId, int placeDescriptionId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;

    }

    /**
     * Create a new Place object.
     *
     * @param placeNameId is the string resource ID for the description
     *                             of a place to visit
     * @param placeDescriptionId is the string resource Id a place
     * @param imageResourceId is the drawable resource ID for the image associated with the place

     */
    public Place(int placeNameId, int placeDescriptionId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the name of a place.
     */
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    /**
     * Get the string resource ID for the description of a place.
     */
    public int getPlaceDescriptionId() {
        return mPlaceDescriptionId;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}