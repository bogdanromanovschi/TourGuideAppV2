package com.example.android.tourguideapp;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class TourElement {

    //Element name
    private String mElementName;

    //Info Line 1
    private String mElementInfoOne;

    //Info Line 2
    private String mElementInfoTwo;

    //Image
    private static final int HAS_NO_IMAGE = -1;
    private int mElementImageResourceId = HAS_NO_IMAGE;

    public TourElement(String elementName, String elementInfoOne, String elementInfoTwo) {
        mElementName=elementName;
        mElementInfoOne=elementInfoOne;
        mElementInfoTwo=elementInfoTwo;
    }

    public TourElement(String elementName, String elementInfoOne, String elementInfoTwo,
                       int elementImageResourceId) {
        mElementName=elementName;
        mElementInfoOne=elementInfoOne;
        mElementInfoTwo=elementInfoTwo;
        mElementImageResourceId = elementImageResourceId;
    }

    public String getElementName () {
        return mElementName;
    }

    public String getElementInfoOne () {
        return mElementInfoOne;
    }

    public String getElementInfoTwo () {
        return mElementInfoTwo;
    }

    public int getElementImageResourceId()  {
        return mElementImageResourceId;
    }

    public boolean hasImage() {return mElementImageResourceId != HAS_NO_IMAGE;}

    @Override
    public String toString() {
        return "Element{" +
                "mElementName='" + mElementName + '\'' +
                ", mElementInfoOne='" + mElementInfoOne + '\'' +
                ", mElementInfoTwo=" + mElementInfoTwo +
                ", mElementImageResourceId=" + mElementImageResourceId +
                '}';
    }


}
