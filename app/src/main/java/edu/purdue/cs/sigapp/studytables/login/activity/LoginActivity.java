package edu.purdue.cs.sigapp.studytables.login.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import edu.purdue.cs.sigapp.studytables.HomescreenActivity;
import edu.purdue.cs.sigapp.studytables.R;
import edu.purdue.cs.sigapp.studytables.classes.activity.ClassesActivity;

/**
 * Use this as an example for referencing activities and features that don't exist yet.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mLoginButton;

    @Bind(R.id.location_activity_toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(this);

        setSupportActionBar(mToolbar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setTitle("Login");
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
        Intent classListIntent = new Intent(this, HomescreenActivity.class);
        startActivity(classListIntent);
    }
}
