package com.seannmurdock.murdock_reflex;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by murdock on 10/2/15.
 */
public class gameBuzzDialog extends DialogFragment {
    int mNum;


    public static gameBuzzDialog newInstance(int num) {
        gameBuzzDialog f = new gameBuzzDialog();

        Bundle args = new Bundle();
        args.putInt("num", num);
        f.setArguments(args);

        return f;

    }
    public Dialog onCreateDialong(Bundle savedInstanceState) {
        int mNum = getArguments().getInt("mNum");

        //int player = 0;
       /* switch (mNum) {
            case 1: player = R.string.dialog_message1; break;
            case 2: player = R.string.dialog_message2; break;
            case 3: player = R.string.dialog_message3; break;
            case 4: player = R.string.dialog_message4; break;
        }
        */
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_title)
                //.setMessage(mNum)
                .setMessage(R.string.dialog_message1);
                /*.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        // on dissmiss what do i do
                    }
                });*/
        return builder.create();





    }
}
