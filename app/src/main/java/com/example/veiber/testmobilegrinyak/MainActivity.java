package com.example.veiber.testmobilegrinyak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNewItemCataloView(View view) {
        Intent intent = new Intent(this,AddNewItemCatalog.class);
        startActivity(intent);
    }
}
