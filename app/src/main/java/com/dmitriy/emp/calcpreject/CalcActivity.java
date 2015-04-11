package com.dmitriy.emp.calcpreject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Dmitriy on 11.04.2015.
 */
public class CalcActivity extends Activity {

    public static final String EMPTY_STRING = new String();
    private TextView txtEdit;
    private TextView txtEqual;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_layout);

        init();
    }

    private void init() {
        txtEdit = (TextView) findViewById(R.id.txtEdit);
        txtEqual = (TextView) findViewById(R.id.txtEquals);
        txtResult = (TextView) findViewById(R.id.txtResult);

        txtEdit.setText(EMPTY_STRING);
        txtEqual.setText(EMPTY_STRING);
        txtResult.setText(EMPTY_STRING);
    }
}
