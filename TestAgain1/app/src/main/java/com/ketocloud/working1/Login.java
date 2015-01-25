package com.ketocloud.working1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSendUserName(View v) {

//* start insert
        // Get the users name from the EditText
        EditText usersNameET = (EditText) findViewById(R.id.users_name_edit_text);

        // Get the name typed into the EditText
        String usersName = String.valueOf(usersNameET.getText());

        // Define our intention to go back to ActivityMain
        Intent goingBack = new Intent();

        // Define the String name and the value to assign to it
        goingBack.putExtra("UsersName", usersName);

        // Sends data back to the parent and can use RESULT_CANCELED, RESULT_OK, or any
        // custom values starting at RESULT_FIRST_USER. RESULT_CANCELED is sent if
        // this Activity crashes
        setResult(RESULT_OK, goingBack);

        // Close this Activity
        //finish();
            Intent openNextActivityMethod;
            openNextActivityMethod = new Intent(Login.this, Home.class);
            startActivity(openNextActivityMethod);
    }
        @Override

        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Create the TextView so I can put the users name on it
        TextView usersNameMessage = (TextView) findViewById(R.id.users_name_message);

        // Get the users name from the previous Activity
        String nameSentBack = data.getStringExtra("UsersName");

        // Add the users name to the end of the textView
        usersNameMessage.append(" " + nameSentBack);



    //* end insert




    }

    public void openDemoOnClick(View v)
    {
        Intent openDemoOnClickMethod;
        openDemoOnClickMethod = new Intent(Login.this, Demo.class);
        startActivity(openDemoOnClickMethod);

    }

    public void openForgotPasswordOnClick(View v)
    {
        Intent openForgotPasswordOnClickMethod;
        openForgotPasswordOnClickMethod = new Intent(Login.this, Password.class);
        startActivity(openForgotPasswordOnClickMethod);

    }

    public void openHelpOnClick(View v)
    {
        Intent openHelpOnClickMethod;
        openHelpOnClickMethod = new Intent(Login.this, Help.class);
        startActivity(openHelpOnClickMethod);

    }
}
