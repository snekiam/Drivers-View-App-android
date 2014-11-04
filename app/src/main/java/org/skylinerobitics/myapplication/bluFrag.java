package org.skylinerobitics.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Miles on 10/28/2014.
 */
public class bluFrag extends Fragment {
    public bluFrag(){}
    public int[] blueTeams;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            ,Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.blueactivity, container, false);

       return rootView;
    }
}
