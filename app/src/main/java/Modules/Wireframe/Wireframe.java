package Modules.Wireframe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import Views.Activities.CurrencyActivity;
import Views.Activities.HomeActivity;
import Views.Activities.PrivacyPolicyActivity;

public class Wireframe {

    private Wireframe(){
    }

    private static class SingleTonHelper{
        private static final Wireframe INSTANCE = new Wireframe();
    }

    public static Wireframe getInstance() {
        return SingleTonHelper.INSTANCE;
    }

    public void toHomeView(Context context){
        Intent intent = new Intent(context, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
        ((Activity)context).finish();
    }

    public void toPrivacyPolicyView(Context context){
        Intent intent = new Intent(context, PrivacyPolicyActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public void toCurrencyView(Context context){
        Intent intent = new Intent(context, CurrencyActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
