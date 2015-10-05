/*
Copyright 2015 Seann Murdock

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
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

    public static gameBuzzDialog newInstance(int num) {
        gameBuzzDialog f = new gameBuzzDialog();
        Bundle args = new Bundle();
        args.putInt("num", num);
        f.setArguments(args);
        return f;
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int mNum = getArguments().getInt("num");

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_title)
                //.setMessage(mNum);
                //.setMessage(R.string.dialog_message1)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        // on dissmiss what do i do
                    }
                });
        switch (mNum) {
            case 1: builder.setMessage(R.string.dialog_message1); break;
            case 2: builder.setMessage(R.string.dialog_message2); break;
            case 3: builder.setMessage(R.string.dialog_message3); break;
            case 4: builder.setMessage(R.string.dialog_message4); break;
        }
        return builder.create();
    }
}
