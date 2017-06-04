package admob.learn.com.learn_git_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Test One ");
        Log.d(TAG,"First Branch One ");
        Log.d(TAG,"First Branch Two ");
        Log.d(TAG,"First Branch Three ");
        Log.d(TAG,"First Branch Four ");
        Log.d(TAG,"First Branch Five ");

        Log.d(TAG,"Second Branch One ");
        Log.d(TAG,"Second Branch Two ");
        Log.d(TAG,"Second Branch Three ");
        Log.d(TAG,"Second Branch Four ");
        Log.d(TAG,"Second Branch Five ");

        Log.d(TAG,"Third Branch One ");
        Log.d(TAG,"Third Branch Two ");
        Log.d(TAG,"Third Branch Three ");
        Log.d(TAG,"Third Branch Four ");
        Log.d(TAG,"Third Branch Five ");

        Log.d(TAG,"Fourth Branch One ");
        Log.d(TAG,"Fourth Branch Two ");
        Log.d(TAG,"Fourth Branch Three ");
        Log.d(TAG,"Fourth Branch Four ");
        Log.d(TAG,"Fourth Branch Five ");

    }
}
