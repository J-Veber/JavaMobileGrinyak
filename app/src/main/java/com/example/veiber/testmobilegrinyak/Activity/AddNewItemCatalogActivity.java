package com.example.veiber.testmobilegrinyak.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.veiber.testmobilegrinyak.R.id.textEnterCatalogItemName;

public class AddNewItemCatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_item_catalog);
    }
    public void cancel_action(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addNewItemToCatalog(View view) {
        TextView nameCatalog = (TextView)findViewById(R.id.textEnterCatalogItemName);
        TextView nameCode = (TextView)findViewById(R.id.textEnterCatalogItemCode);


        if (nameCatalog.getText() != null && nameCode.getText() != null) {
            // поиск по коду товара
            // если все ОК, добавляем товар
            Toast.makeText(this, "Товар добавлен", Toast.LENGTH_LONG).show();
        } else if (nameCatalog.getText() == null) {
            Toast.makeText(this, "Введите наименование товара", Toast.LENGTH_LONG).show();
        } else Toast.makeText(this, "Введите код товара", Toast.LENGTH_LONG).show();
    }
}
