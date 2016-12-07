package com.example.veiber.testmobilegrinyak.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddDocumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_document);
    }

    public void cancel_action(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addNewDocument(View view) {
    }

    public void chooseNewItem(View view) {
        //Intent intent = new Intent(this, )
    }
}
