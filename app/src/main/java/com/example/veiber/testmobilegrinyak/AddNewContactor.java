package com.example.veiber.testmobilegrinyak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class AddNewContactor extends AppCompatActivity {

    final String LOG_TAG = "myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_contactor);

    }
    public void cancel_action(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addNewItemTableContractors(View view) {
        //---- add contractor --
        //Log.d(LOG_TAG, "по this.name ищем контрагента с таблице КОНТРАГЕНТЫ");
        //----- if contractor.name exists -----
        Log.d(LOG_TAG, "Контрагент добавлен");
        Toast.makeText(this, "Контрагент с таким именем уже существует", Toast.LENGTH_LONG).show();
        // ----- ELSE -----
        //...
        //Toast.makeText(this, "Контрагент добавлен", Toast.LENGTH_LONG).show();


    }
}
