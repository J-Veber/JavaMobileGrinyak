package com.example.veiber.testmobilegrinyak;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Veber on 02.12.2016.
 */

public class Contractors extends RealmObject {
    @PrimaryKey
    private int     id;
    private String  name;

    public String   getName() { return this.name; }
    public void     setName(String input) { this.name = input; }
}
