package edu.aubg.liverpool;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Console;

/**
 * Created by radoka on 3/5/18.
 */

public class TextFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        System.out.print("text fragment");
        return inflater.inflate(R.layout.text_fragment, container, false);
    }
}
