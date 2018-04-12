package Entities.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TransaksiModels {

    @SerializedName("list")
    ArrayList<TransaksiModel> list = new ArrayList<>();

    public void setList(ArrayList<TransaksiModel> list) {
        this.list = list;
    }

    public ArrayList<TransaksiModel> getList() {
        return list;
    }
}
