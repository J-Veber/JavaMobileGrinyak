package com.example.veiber.testmobilegrinyak.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.veiber.testmobilegrinyak.Utils.Constants;

public class ListAllContractorsActivity extends AppCompatActivity {

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
        Log.d(Constants.DebugTag, "--- CREATE NEW DOCUMENT: ---");
        Intent intent = new Intent(this,AddNewContactorActivity.class);
        startActivity(intent);
    }
}
