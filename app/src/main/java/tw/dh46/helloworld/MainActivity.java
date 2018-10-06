package tw.dh46.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  要控制的是textView, 不用new物件, 因為該物件已經在版面上
        textView = findViewById(R.id.lottery);
    }

    public void test(View view) {
        //  按下按鈕跑這裡
        HashSet<Integer> set = new HashSet<>();

        while ( set.size() < 6) {
            set.add((int)(Math.random()*49+1));
        }

        String temp = set.toString();
        textView.setText(temp);
    }


}
