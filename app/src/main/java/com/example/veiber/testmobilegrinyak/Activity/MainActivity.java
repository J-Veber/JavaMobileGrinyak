package com.example.veiber.testmobilegrinyak.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.veiber.testmobilegrinyak.Utils.Constants;


public class MainActivity extends AppCompatActivity {

    Button addNewCatalogItem, addNewContractor;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNewCatalogItem = (Button)findViewById(R.id.addNewCatalogItem);
        addNewContractor = (Button)findViewById(R.id.addNewContractor);
    }

    public void addNewItemCatalogView(View view) {
        Log.d(Constants.DebugTag, "--- GO TO LIST OF CATALOG ITEMS: ---");
        Intent intent = new Intent(this,AddNewItemCatalogActivity.class);
        startActivity(intent);
    }

    public void addContractor(View view) {
        Log.d(Constants.DebugTag, "--- CREATE NEW CONTRACTOR(S): ---");
        Intent intent = new Intent(this,ListAllContractorsActivity.class);
        startActivity(intent);
    }

    public void addNewDocument(View view) {
        Log.d(Constants.DebugTag, "--- CREATE NEW DOCUMENT: ---");
        Intent intent = new Intent(this,AddDocumentActivity.class);
        startActivity(intent);
    }
}

