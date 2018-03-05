package edu.aubg.liverpool;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service {
    MediaPlayer mPlayer;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        return Service.START_NOT_STICKY;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mPlayer = MediaPlayer.create(this, R.raw.piano);
        mPlayer.start();
        if (mPlayer != null){
            mPlayer.setLooping(true);
            mPlayer.setVolume(100, 100);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

}
