package com.ketocloud.working1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openSoupsSauces(View v)
    {
        Intent openSoupsSaucesMethod;
        openSoupsSaucesMethod = new Intent(Home.this, Calculation.class);
        startActivity(openSoupsSaucesMethod);
    }
    public void openCalculator(View v)
    {
        Intent openCalculatorMethod;
        openCalculatorMethod = new Intent(Home.this, Calculation.class);
        startActivity(openCalculatorMethod);
    }
    public void openPantry(View v)
    {
        Intent openPantryMethod;
        openPantryMethod = new Intent(Home.this, Pantry.class);
        startActivity(openPantryMethod);
    }
    public void openReferralPatient(View v)
    {
        Intent openReferralMethod;
        openReferralMethod = new Intent(Home.this, Referral.class);
        startActivity(openReferralMethod);
    }

    public void openReferralPatientTransfer(View v)
    {
        Intent openReferralMethod;
        openReferralMethod = new Intent(Home.this, Referral.class);
        startActivity(openReferralMethod);
    }

    public void openReferralDietitian(View v)
    {
        Intent openReferralMethod;
        openReferralMethod = new Intent(Home.this, Referral.class);
        startActivity(openReferralMethod);
    }
    public void openReferralPhysician(View v)
    {
        Intent openReferralMethod;
        openReferralMethod = new Intent(Home.this, Referral.class);
        startActivity(openReferralMethod);
    }
    public void openFaceToFace(View v)
    {
        Intent openFaceToFaceMethod;
        openFaceToFaceMethod = new Intent(Home.this, Questionnaire.class);
        startActivity(openFaceToFaceMethod);
    }
    public void openDataDisplay(View v)
    {
        Intent openDataDisplayMethod;
        openDataDisplayMethod = new Intent(Home.this, Display.class);
        startActivity(openDataDisplayMethod);
    }
    public void openDatabaseApproval(View v)
    {
        Intent openDatabaseApprovalMethod;
        openDatabaseApprovalMethod = new Intent(Home.this, Approval.class);
        startActivity(openDatabaseApprovalMethod);
    }
    public void openLogin(View v)
    {
        Intent openLoginMethod;
        openLoginMethod = new Intent(Home.this, Login.class);
        startActivity(openLoginMethod);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
}
