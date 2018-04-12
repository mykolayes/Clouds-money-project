package Entities.Model;

import java.util.ArrayList;

public class Quotes {

    ArrayList<QuoteModel> arrayList = new ArrayList<>();

    public void setArrayList(ArrayList<QuoteModel> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<QuoteModel> getArrayList() {
        return arrayList;
    }
}
