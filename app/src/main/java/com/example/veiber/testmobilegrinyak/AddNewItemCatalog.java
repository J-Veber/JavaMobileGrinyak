package com.example.veiber.testmobilegrinyak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.veiber.testmobilegrinyak.R.id.textEnterCatalogItemName;

public class AddNewItemCatalog extends AppCompatActivity {

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
//            здесь нужно всатвлять данные из поля в БД + поиск идентификатора + возможные ошибки
        } else {
//            здесь нужно подчеркнуть окошки ввода красным и написать красным введите то-то..
        }
    }
}
