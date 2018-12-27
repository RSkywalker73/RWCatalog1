package com.example.android.rwcatalog;

public class Producto {

    /** Default translation for the word */
    private String mNombreProducto;

    /** Miwok translation for the word */
    private String mBreveDescrip;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Producto object.
     *
     * @param nombreProducto is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param breveDescrip is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Producto(String nombreProducto, String breveDescrip, int imageResourceId) {
        mNombreProducto = nombreProducto;
        mBreveDescrip = breveDescrip;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getNombreProducto() {
        return mNombreProducto;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getBreveDescrip() {
        return mBreveDescrip;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
