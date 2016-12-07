package com.example.veiber.testmobilegrinyak.Model;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Veiber on 02.12.2016.
 */

public class ResidueRegister extends RealmObject {
    @PrimaryKey
    private int id;
    private Date date;
    private Item item;
    private ReceiptDocument receiptDocument;
    private int count;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ReceiptDocument getReceiptDocument() {
        return receiptDocument;
    }

    public void setReceiptDocument(ReceiptDocument receiptDocument) {
        this.receiptDocument = receiptDocument;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
