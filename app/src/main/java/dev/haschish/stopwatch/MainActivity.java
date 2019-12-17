package dev.haschish.stopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int seconds;

    public void setSeconds (int value) {
        seconds = value;
        updateTimeView();
    }

    private void updateTimeView () {
        int ss = seconds % 60;
        int minutes = seconds / 60;
        int mm = minutes % 60;
        int hh = minutes / 60;
        String timeString = String.format("%02d:%02d:%02d", hh, mm, ss);

        TextView timeView = (TextView)findViewById(R.id.timeTextView);
        timeView.setText(timeString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSeconds(7);
    }

    public void onClickStart (View v) {
        setSeconds(++seconds);
    }

    public void onClickStop (View v) {

    }

    public void onClickReset (View v) {

    }
}
