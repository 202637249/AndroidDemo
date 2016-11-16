package com.lzq.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lzq.ndkdemo.ndk.Load;

public class MainActivity extends AppCompatActivity {


    private EditText oneEdit;
    private EditText twoEdit;
    private TextView strView;
    private Button StrBtn;
    private TextView sunView;
    private Button sunBtn;
    private Load load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        oneEdit = (EditText) findViewById(R.id.ev_a);
        twoEdit = (EditText) findViewById(R.id.ev_b);
        sunView = (TextView) findViewById(R.id.tv_add);
        strView = (TextView) findViewById(R.id.tv_str);
        StrBtn = (Button) findViewById(R.id.bt_str);
        sunBtn = (Button) findViewById(R.id.bt_sun);

        load = new Load();
        final String  s = load.getNdk();
        StrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strView.setText(s);
            }
        });


        sunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(oneEdit.getText().toString());
                int b = Integer.parseInt(twoEdit.getText().toString());
                final int r = load.addInt( a, b);
                sunView.setText("结果是："+ r);
            }
        });
    }


}
