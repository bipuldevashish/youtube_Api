package com.example.bipuldevashish.youtube_api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class MainActivity extends YouTubeBaseActivity {


    Button btn;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView =(YouTubePlayerView) findViewById(R.id.youtube_player_view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadPlaylist("RDQMgEzdN5RuCXE");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider , YouTubeInitializationResult youTubeInitializationResult){

            }
        };

        btn = (Button)findViewById(R.id.button_youtube);
        btn.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View view){
                youTubePlayerView.initialize("AIzaSyDY83F-NahjVCQpotXDJBPfAeIvG7J5m8E",onInitializedListener);
          }
        });
    }
}
