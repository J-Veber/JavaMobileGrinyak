package com.example.veiber.testmobilegrinyak.Model;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Veiber on 02.12.2016.
 */

public class ReceiptDocument extends RealmObject {
    @PrimaryKey
    private int         id;
    private Date        date;
    private Contractor  contractor;
    private boolean     done;

    public int           getId() {return this.id; }
    public Contractor getContractor() {return  this.contractor; }
    public boolean       getDone() {return this.done; }


}
