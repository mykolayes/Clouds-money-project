package Views.ViewHolders;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import Entities.Model.ThemeModel;
import Modules.OnThemeSelectedListener;
import Supports.Data.SimpleCache;
import databinding.ItemThemeBinding;


public class SettingThemeViewHolder extends RecyclerView.ViewHolder {

    ItemThemeBinding content;

    public SettingThemeViewHolder(View itemView) {
        super(itemView);
        content = DataBindingUtil.bind(itemView);
    }

    public void onBind(Context context, final ThemeModel model, String selectedName, final OnThemeSelectedListener listener){

        if (model.getName().equalsIgnoreCase(selectedName)){
            content.txtHarga.setText("Selected");
            content.containerHarga.setSelected(true);
        }else{
            content.txtHarga.setText("Choose me");
            content.containerHarga.setSelected(false);
        }
        content.txtNama.setText(model.getName());
        content.img.setImageResource(model.getImage());

        content.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onThemeSelected(model.getName());
            }
        });
    }
}
