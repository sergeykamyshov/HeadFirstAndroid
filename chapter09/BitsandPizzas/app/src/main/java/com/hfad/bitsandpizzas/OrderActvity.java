package com.hfad.bitsandpizzas;

import android.app.Activity;
import android.os.Bundle;

public class OrderActvity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
