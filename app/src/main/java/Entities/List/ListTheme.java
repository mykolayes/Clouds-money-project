package Entities.List;

import java.util.ArrayList;

import candra.bukupengeluaran.Entities.Model.ThemeModel;
import candra.bukupengeluaran.R;

public class ListTheme {

    ArrayList<ThemeModel> arrayList = new ArrayList<>();

    public ListTheme(){
        arrayList.add(new ThemeModel("Beach", R.drawable.beach, true));
        arrayList.add(new ThemeModel("Bridge", R.drawable.bridge, true));
        arrayList.add(new ThemeModel("Cape", R.drawable.cape, true));
        arrayList.add(new ThemeModel("Castle", R.drawable.castle, true));
        arrayList.add(new ThemeModel("Cityscape", R.drawable.cityscape, true));
        arrayList.add(new ThemeModel("Fields", R.drawable.fields, true));
        arrayList.add(new ThemeModel("Forest", R.drawable.forest, true));
        arrayList.add(new ThemeModel("Hills", R.drawable.hills, true));
        arrayList.add(new ThemeModel("Home", R.drawable.home, true));
        arrayList.add(new ThemeModel("Iceberg", R.drawable.iceberg, true));
        arrayList.add(new ThemeModel("Island", R.drawable.island, true));
    }

    public ArrayList<ThemeModel> getArrayList() {
        return arrayList;
    }
}
