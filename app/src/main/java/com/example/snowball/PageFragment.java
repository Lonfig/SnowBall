package com.example.snowball;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {

    private int pageNumber;

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args=new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result;
        switch (pageNumber) {
            case 0:
                result = inflater.inflate(R.layout.fragment_snowbord, container, false);
                break;
            case 1:
                result = inflater.inflate(R.layout.fragment_lizy, container, false);
                break;
            case 2:
                result = inflater.inflate(R.layout.fragment_odejda, container, false);
                break;
            case 3:
                result = inflater.inflate(R.layout.fragment_zashita, container, false);
                break;


            default:
                result = inflater.inflate(R.layout.fragment_snowbord, container, false);
        }

    


        return result;
    }
}
