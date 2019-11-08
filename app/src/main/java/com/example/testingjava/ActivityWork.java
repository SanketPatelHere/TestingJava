package com.example.testingjava;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
public class ActivityWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        Log.i("MyLog onCreate = ",1+" onCreate");
        Toast.makeText(getApplicationContext(), "onCreate()-1",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyLog onStart = ",2+" onStart");
        Toast.makeText(getApplicationContext(), "onStart()-2",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyLog onResume = ",3+" onResume");
        Toast.makeText(getApplicationContext(), "onResume()-3",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyLog onPause = ",4+" onPause");
        Toast.makeText(getApplicationContext(), "onPause()-4",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyLog onStop = ",5+" onStop");
        Toast.makeText(getApplicationContext(), "onStop()-5",Toast.LENGTH_SHORT).show();
    }

    @Override         
    protected void onRestart() {
        super.onRestart();
        Log.i("MyLog onRestart = ",6+" onRestart");
        Toast.makeText(getApplicationContext(), "onRestart()-6",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyLog onDestroy = ",7+" onDestroy");
        Toast.makeText(getApplicationContext(), "onDestroy()-7",Toast.LENGTH_SHORT).show();
    }
}
