package com.example.veiber.testmobilegrinyak;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Veiber on 02.12.2016.
 */

public class DocReceipt extends RealmObject {
    @PrimaryKey
    private int          id;
    private int          date;
    private Contractors  contractor;
    private boolean      done;

    public int           getId() {return this.id; }
    public Contractors   getContractor() {return  this.contractor; }
    public boolean       getDone() {return this.done; }


}
