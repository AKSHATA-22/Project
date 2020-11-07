package com.example.miniproject_java;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pb,vp,pp,bh,tot=0;
    public void pbOrder(View view) {
        pb++;
        tot=tot+30;
        display1(pb);
    }

    public void vpOrder(View view) {
        vp++;
        tot=tot+12;
        display2(vp);
    }

    public void ppOrder(View view) {
        pp++;
        tot=tot+20;
        display3(pp);
    }

    public void bhOrder(View view) {
        bh++;
        tot=tot+12;
        display4(bh);
    }

    public void display1(int pb){
        TextView calc1=(TextView) findViewById(R.id.pv_price);
        if(pb!=0)
            calc1.setText(pb+" || "+30*pb+" ₹");
        else
            calc1.setText("30 ₹");
    }
    public void display2(int vp){
        TextView calc1=(TextView) findViewById(R.id.vp_price);
        if(vp!=0)
            calc1.setText(vp+" || "+12*vp+" ₹");
        else
            calc1.setText("12 ₹");

    }
    public void display3(int pp){
        TextView calc1=(TextView) findViewById(R.id.pp_price);
        if(pp!=0)
            calc1.setText(pp+" || "+20*pp+" ₹");
        else
            calc1.setText("20 ₹");

    }
    public void display4(int bh){
        TextView calc1=(TextView) findViewById(R.id.bh_price);
        if(bh!=0)
            calc1.setText(bh+" || "+12*bh+" ₹");
        else
            calc1.setText("12 ₹");

    }

    public void placeOrder(View view) {
        if(pb==0 &vp==0 &bh==0 & pp==0) {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "YOU HAVE NOT ORDERED ANYTHING YET", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            TextView total = (TextView) findViewById(R.id.price_text_view);
            total.setText("   You have to pay " + tot + " Rupees" );
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "ORDER PLACED SUCCESSFULLY", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void reOrder(View view) {
        pb=vp=pp=bh=tot=0;
        display1(pb);
        display2(vp);
        display3(pp);
        display4(bh);
        TextView total=(TextView) findViewById(R.id.price_text_view);
        total.setText("Total Price will be displayed here once the order is placed");
    }
}