package com.example.veiber.testmobilegrinyak.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Veiber on 02.12.2016.
 */

// Номенклатура
public class Item extends RealmObject {
    @PrimaryKey
    private int     id;
    private String  name;

    public String   getName() { return this.name; }
    public void     setName(String input) { this.name = input; }
    public int      getId() {return this.id; }
    public void     setId(int input) {this.id = input; }
}
