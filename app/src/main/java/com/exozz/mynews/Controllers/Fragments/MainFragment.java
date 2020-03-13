package com.exozz.mynews.Controllers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.exozz.mynews.R;


public class MainFragment extends Fragment  {

    public MainFragment() {
        // Required empty public constructor
        executeHttpRequest();
    }




    // ------------------
    //  HTTP REQUEST
    // ------------------

    private void executeHttpRequest(){
       // new NetworkAsyncTask(this).execute("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=o6yIHhGmWFATwt9lma0sLPYGVC2LHzrG");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }


}
