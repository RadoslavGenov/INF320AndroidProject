package edu.aubg.liverpool;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by radoka on 3/5/18.
 */

public class VideoFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        System.out.print("video fragment");
        return inflater.inflate(R.layout.video_fragment, container, false);
    }
}
