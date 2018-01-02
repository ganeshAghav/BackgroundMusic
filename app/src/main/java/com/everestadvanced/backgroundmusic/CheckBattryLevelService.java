package com.everestadvanced.backgroundmusic;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Administrator on 21-11-2017.
 */

public class CheckBattryLevelService extends Service
{
    public static MediaPlayer player;


    public IBinder onBind(Intent arg0) {

        return null;
    }

    @Override
    public void onCreate() {

    }

    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.e("SERVICE","Service started");

       /* new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try
                    {
                        Thread.sleep(10000);
                    }
                    catch (Exception e)
                    {
                    }
                    //Continue call this method after 1 second
                    StratMusic();
                }
            }
        }).start();*/

        StratMusic();
        return  START_STICKY;
    }

    public void onStart(Intent intent, int startId) {
        // TO DO
    }

    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

    }

    public void onPause() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        StopMusic();
        Log.e("SERVICE","Service Destroy");
    }

    @Override
    public void onLowMemory() {

    }


    public void StratMusic() {
        try
        {
            player = MediaPlayer.create(this, R.raw.sond1);
            player.setLooping(true); // Set looping
            player.setVolume(100, 100);
            player.start();
        }
        catch (Exception e)
        {

        }
    }

    public void StopMusic() {
        try
        {
            if (player.isPlaying())
            {
                player.stop();
                player.release();
            }
        }
        catch (Exception e)
        {

        }

    }

}