package com.example.veiber.testmobilegrinyak.Model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Veber on 02.12.2016.
 */

// Контрагент
public class Contractor extends RealmObject {
    @PrimaryKey
    private int     id;
    private String  name;
    private RealmList<ReceiptDocument> receiptDocuments;

    public String   getName() {
        return this.name;
    }

    public void setName(String input) {
        this.name = input;
    }

    public RealmList<ReceiptDocument> getReceiptDocuments() {
        return this.receiptDocuments;
    }

    public void setReceiptDocuments(RealmList<ReceiptDocument> receiptDocuments) {
        this.receiptDocuments = receiptDocuments;
    }
}
