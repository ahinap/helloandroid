package com.ahinap.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.content.Intent;

public class MainActivity extends AppCompatActivity {

//    public final statis String EXTRA_MESSAGE = "com.ahinap.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
//    public void sendMessage(View view){
//        //Do something in response to button
//        Intent intent = new Intent(this,DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.Id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE,message);
//        startActivity(intent);
//    }
}
