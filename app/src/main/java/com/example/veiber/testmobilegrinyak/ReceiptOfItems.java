package com.example.veiber.testmobilegrinyak;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Veiber on 02.12.2016.
 */

public class ReceiptOfItems extends RealmObject {
    @PrimaryKey
    private Items                  item;
    private int                    count;
    private int                    prise;
    private RealmList<DocReceipt>  doc_link;

    public void                    setCount(int input) {this.count = input; }
    public int                     getCount() {return this.count; }
    public void                    setPrise(int input) {this.prise = input; }
    public int                     getPrise() {return this.prise; }
    public Items                   getItem() {return this.item; }
}
