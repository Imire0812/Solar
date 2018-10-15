package com.test.testing.solar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnVpered = (Button) findViewById(R.id.btnVpered);
        btnVpered.setOnClickListener(this);

    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnVpered:
                intent = new Intent(MainActivity.this, GridViewImageTextActivity.class);
                startActivity(intent);
                break;
        }
    }
}
