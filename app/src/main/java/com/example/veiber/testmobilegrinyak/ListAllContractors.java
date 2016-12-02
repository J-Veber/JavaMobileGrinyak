package com.example.veiber.testmobilegrinyak;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListAllContractors extends AppCompatActivity {

    final String LOG_TAG = "myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_all_contractors);


        ListView contractorList = (ListView)findViewById(R.id.listContractors);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_list_all_contractors);
        // присваиваем адаптер списку
        contractorList.setAdapter(adapter);
    }

    public void gotoAddNewContractor(View view) {
        Log.d(LOG_TAG, "--- CREATE NEW DOCUMENT: ---");
        Intent intent = new Intent(this,AddNewContactor.class);
        startActivity(intent);
    }
}
