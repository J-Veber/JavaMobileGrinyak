package com.example.veiber.testmobilegrinyak;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";
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
        Log.d(LOG_TAG, "--- GO TO LIST OF CATALOG ITEMS: ---");
        Intent intent = new Intent(this,AddNewItemCatalog.class);
        startActivity(intent);
    }

    public void addContractor(View view) {
        Log.d(LOG_TAG, "--- CREATE NEW CONTRACTOR(S): ---");
        Intent intent = new Intent(this,ListAllContractors.class);
        startActivity(intent);
    }

    public void addNewDocument(View view) {
        Log.d(LOG_TAG, "--- CREATE NEW DOCUMENT: ---");
        Intent intent = new Intent(this,AddDocument.class);
        startActivity(intent);
    }
}

