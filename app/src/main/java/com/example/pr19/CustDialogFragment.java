package com.example.pr19;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class CustDialogFragment extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("bun windows")
                .setIcon(R.drawable.baseline_auto_awesome_24)
                .setView(R.layout.dialogt)
                .setPositiveButton("OK", null)
                .setNegativeButton("Отмена", null)
                .create();
    }
}