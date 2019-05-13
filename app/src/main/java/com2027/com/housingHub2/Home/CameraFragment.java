package com2027.com.housingHub2.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com2027.com.housingHub2.R;

/**
 * Created by User on 5/28/2017.
 */

public class CameraFragment extends Fragment {
    private static final String TAG = "CameraFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Creates a fragment for the user to take images of their house
        View view = inflater.inflate(R.layout.fragment_camera, container, false);

        return view;
    }
}
