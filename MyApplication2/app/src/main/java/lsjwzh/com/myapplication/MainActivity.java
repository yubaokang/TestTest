package lsjwzh.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void test() {
        Log.i("aaaaaaaa", "aaaaaaaaaaaa");
    }

    private void test2() {
        Log.i("bbbbbbbb", "bbbbbbbbbbbb");
    }
}
