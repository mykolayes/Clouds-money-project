package Views.ViewHolders;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import Entities.Model.Currency;
import Modules.OnCurrencySelectedListener;
import databinding.ItemCurrencyBinding;


public class CurrencyViewHolder extends RecyclerView.ViewHolder {
    ItemCurrencyBinding content;
    public CurrencyViewHolder(View itemView) {
        super(itemView);
        content = DataBindingUtil.bind(itemView);
    }

    public void onBind(final Currency model, final OnCurrencySelectedListener listener){

        content.txtNama.setText(model.getCountry());
        content.txtSymbol.setText(model.getSymbol());

        content.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onCurrencySelected(model);
            }
        });

    }
}
