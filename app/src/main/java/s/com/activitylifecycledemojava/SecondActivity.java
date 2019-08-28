package s.com.activitylifecycledemojava;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    final static String TAG = "SecondActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "==>In onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "==>In onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "==>In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "==>In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "==>In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "==>In onDestroy");
    }
}
