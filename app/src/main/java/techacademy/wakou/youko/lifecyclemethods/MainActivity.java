package techacademy.wakou.youko.lifecyclemethods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Android","onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Android","onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Android","onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Android","onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Android","onStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("Android","onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Android","onRestart");
    }
}
