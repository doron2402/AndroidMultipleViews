package com.segaldoron.messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    public static final String EXTRA_SUBJECT = "subject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        //Message
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        //Subject
        EditText subjectView = (EditText) findViewById(R.id.subject);
        String subjectText = subjectView.getText().toString();

        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(EXTRA_MESSAGE, messageText);
        intent.putExtra(EXTRA_SUBJECT, subjectText);
        startActivity(intent);
    }
}
