//Nama  : Kartika Aghni Safitri
//NIM   : 10119249
//Kelas : IF-6
//Tanggal Pengerjaan : 3 Juni 2022

package com.example.utspraktik_if6_10119249_kartikaaghnisafitri;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ViewDialog {
    public void showDialog(Activity activity, String msg){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.activity_dialog);

        TextView text = (TextView) dialog.findViewById(R.id.isidialog);
        text.setText(msg);

        Button dialogButton = (Button) dialog.findViewById(R.id.ok);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}