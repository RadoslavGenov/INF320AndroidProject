package edu.aubg.liverpool;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by radoka on 3/5/18.
 */

public class VideoFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.video_fragment, container, false);
        VideoView video = (VideoView) rootView.findViewById(R.id.VideoView);
        String path = "android.resource://" + getClass().getPackage().getName() + "/" + R.raw.liverpool;
        video.setVideoURI(Uri.parse(path));
        video.start();
        video.requestFocus();
        return rootView;
    }

}
