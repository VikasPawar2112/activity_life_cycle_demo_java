package s.com.activitylifecycledemojava;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ActivityLifeCycleDemo extends AppCompatActivity {

    final static String TAG = "ActivityLifeCycleDemo";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_life_cycle);
        Log.i(TAG, "==>In onCreate");

        TextView txtClick = (TextView) findViewById(R.id.textViewClick);
        txtClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLifeCycleDemo.this, SecondActivity.class);
                startActivity(intent);
            }
        });
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
