package com.techno.simplewidgetappdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by arbaz on 21/7/16.
 */
public class Demo extends Activity {

    int count = 0;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        setContentView(R.layout.activity_demo);


        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.activity_demo, null);

        // Find the Linear For Display
        LinearLayout ll_v_top = (LinearLayout) v.findViewById(R.id.ll_v_top);
        LinearLayout ll_h = (LinearLayout) v.findViewById(R.id.ll_h);
        LinearLayout ll_v_bottom = (LinearLayout) v.findViewById(R.id.ll_v_bottom);

        //Dynamically  Buind
        LinearLayout ll_dialog_ver_top = new LinearLayout(this);
        ll_dialog_ver_top.setOrientation(LinearLayout.VERTICAL);

        LinearLayout ll_dialog_hori = new LinearLayout(this);
        ll_dialog_hori.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout ll_dialog_ver_bottom = new LinearLayout(this);
        ll_dialog_ver_bottom.setOrientation(LinearLayout.VERTICAL);

        TextView tv1 = new TextView(this);
        TextView tv2 = new TextView(this);
        TextView tv3 = new TextView(this);
        TextView tv4 = new TextView(this);

        tv1.setTextSize(20);
        tv2.setTextSize(20);
        tv3.setTextSize(20);
        tv4.setTextSize(20);

        tv1.setGravity(Gravity.CENTER);
        tv2.setGravity(Gravity.CENTER);
        tv3.setGravity(Gravity.CENTER);
        tv4.setGravity(Gravity.CENTER);

        tv1.setText("Top");
        tv2.setText("Center");
        tv3.setText("Center");
        tv4.setText("Bottom");

        ll_dialog_ver_top.addView(tv1);
        ll_dialog_hori.addView(tv2);
        ll_dialog_hori.addView(tv3);
        ll_dialog_ver_bottom.addView(tv4);

        //For Display
        ll_v_top.addView(ll_dialog_ver_top);
        ll_h.addView(ll_dialog_hori);
        ll_v_bottom.addView(ll_dialog_ver_bottom);

        setContentView(v);

    }
}
