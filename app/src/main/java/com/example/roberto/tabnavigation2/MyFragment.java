package com.example.roberto.tabnavigation2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment { //Note: Fragment is taken from the support library

    public static final String ARG_OBJECT = "object";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState
    )
    {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View view = inflater.inflate(R.layout.fragment, container, false);
        Bundle args = getArguments();

        TextView textView;
        textView =  (TextView) view.findViewById(R.id.tv);
        textView.setText(Integer.toString(args.getInt(ARG_OBJECT)))
        ;
        return view;
    }
}
