package edu.purdue.cs.sigapp.studytables.login.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.purdue.cs.sigapp.studytables.R;

/**
 * Use this as an example for referencing activities and features that don't exist yet.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(this);
    }

    /**
     * OnClick for the Login Button.
     * @param view The login Button
     */
    @Override
    public void onClick(View view) {
        //TODO: Insert login code once we decide how to authenticate.
        //if logged in successfully
            openClassListActivity();
    }

    private void openClassListActivity() {
        //TODO: The class list activity doesnt exist yet. Update this once it exists.
        //Intent classListIntent = new Intent(this, ActivityName.class);
        //startActivity(classListIntent);
    }
}
