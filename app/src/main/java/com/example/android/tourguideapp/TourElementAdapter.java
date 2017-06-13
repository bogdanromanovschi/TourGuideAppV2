package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bogdan on 6/11/2017.
 */

public class TourElementAdapter extends ArrayAdapter<TourElement> {

    private int mColorResource;

    public TourElementAdapter(Activity context, ArrayList<TourElement> words, int colorResource) {
        super(context, 0, words);
        mColorResource=colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TourElement currentelement = getItem(position);

        if (currentelement.hasImage()) {
            ImageView elementImage = (ImageView) listItemView.findViewById(R.id.elementImage);
            elementImage.setVisibility(View.VISIBLE);
            elementImage.setImageResource(currentelement.getElementImageResourceId());
        } else {
            ImageView elementImage = (ImageView) listItemView.findViewById(R.id.elementImage);
            elementImage.setVisibility(View.GONE);
        }

        //Set the background color of the list element (matches the element group)
        View textLayout = listItemView.findViewById(R.id.textLayout);
        int color = ContextCompat.getColor(getContext(), mColorResource);
        textLayout.setBackgroundColor(color);

        //Set the values for the Element name and the two element informations
        TextView tourElementName = (TextView) listItemView.findViewById(R.id.elementTitle);
        tourElementName.setText(currentelement.getElementName());

        TextView tourElementInfoOne = (TextView) listItemView.findViewById(R.id.elementInfoOne);
        tourElementInfoOne.setText(currentelement.getElementInfoOne());

        TextView tourElementInfoTwo = (TextView) listItemView.findViewById(R.id.elementInfoTwo);
        tourElementInfoTwo.setText(currentelement.getElementInfoTwo());

        return listItemView;
    }

}
