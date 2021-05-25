package com.example.snowball;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragmentSnowbord extends Fragment {


    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static BlankFragmentSnowbord newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        BlankFragmentSnowbord fragment = new BlankFragmentSnowbord();
        fragment.setArguments(args);
        return fragment;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPage = getArguments().getInt(ARG_PAGE);
        }
    }


}
