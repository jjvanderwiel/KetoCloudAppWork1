package com.newthinktank.switchingscreens2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.R;

/**
 * Created by Hans on 23/01/2015.
 */
public class SecondScreen extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle saveInstanceSate) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();

        String PreviousActivity = activityThatCalled.getExtras().getString("callingActivity");
        TextView callingActivityMessage;
        callingActivityMessage = (TextView)
                findViewById(r.id.callin_cativity_info_text_View);
        callingActivityMessage.append(" " + previousActivity);

    }

    public void onSentUsersName(View view){

        EditText UsersNameET = (EditText)
                findViewById(R.id.users_name_edit_text);

        String usersName = String.valueOf(UsersNameET.getText());

        Intent goingBack = newIntent();

        goingBack.putExtra("UsersName",usersName);

        setResult(RESULT_OK, goingBack);

        finish();


    }
    }

