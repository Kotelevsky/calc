package com.dmitriy.emp.calcpreject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Dmitriy on 11.04.2015.
 */
public class CalcActivity extends Activity {

    public static final String EMPTY_STRING = new String();
    public static final char CHAR_7 = '7';
    public static final char CHAR_8 = '8';
    public static final char CHAR_9 = '9';
    public static final char CHAR_1 = '1';
    public static final char CHAR_2 = '2';
    public static final char CHAR_3 = '3';
    public static final char CHAR_4 = '4';
    public static final char CHAR_5 = '5';
    public static final char CHAR_6 = '6';
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

    /**
     * Button 1 click
     */
    public void onClickBtn1(View view) {
        setChar(CHAR_1);
    }

    /**
     * Button 2 click
     *
     * @param view
     */
    public void onClickBtn2(View view) {
        setChar(CHAR_2);
    }

    /**
     * Button 3 click
     *
     * @param view
     */
    public void onClickBtn3(View view) {
        setChar(CHAR_3);
    }

    /**
     * Button 4 click
     *
     * @param view
     */
    public void onClickBtn4(View view) {
        setChar(CHAR_4);
    }

    /**
     * Button 5 click
     *
     * @param view
     */
    public void onClickBtn5(View view) {
        setChar(CHAR_5);
    }

    /**
     * Button 6 click
     *
     * @param view
     */
    public void onClickBtn6(View view) {
        setChar(CHAR_6);
    }

    /**
     * Button 7 click
     *
     * @param view
     */
    public void onClickBtn7(View view) {
        setChar(CHAR_7);
    }

    /**
     * Button 8 click
     *
     * @param view
     */
    public void onClickBtn8(View view) {
        setChar(CHAR_8);
    }

    /**
     * Button 9 click
     *
     * @param view
     */
    public void onClickBtn9(View view) {
        setChar(CHAR_9);
    }

    private void setChar(final char ch) {
        String value = txtEdit.getText().toString();
        txtEdit.setText(value + ch);
    }

}
