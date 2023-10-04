package com.main.myproject.may29_b;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // static String text = "" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView textView = findViewById(R.id.textView);
        // textView.setText(text);
        Toast.makeText(this,"On Create",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"On Start",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"On Resume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"On Pause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // TextView textView = findViewById(R.id.textView);
        // text = textView.getText().toString();
        Toast.makeText(this,"On Destroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"On Restart",Toast.LENGTH_SHORT).show();
    }

    public void set(View view){
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello Android !");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        TextView textView = findViewById(R.id.textView);
        outState.putString("text",textView.getText().toString());

        Toast.makeText(this,"On Save Instance State",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String text = savedInstanceState.getString("text");
        TextView textView = findViewById(R.id.textView);
        textView.setText(text);

        Toast.makeText(this,"On Restore Instance State",Toast.LENGTH_SHORT).show();
    }
}