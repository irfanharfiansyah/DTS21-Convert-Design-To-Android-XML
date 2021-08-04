package polinema.ac.id.dtschapter03_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_welcome_back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);
    }
    public void clickForgot(View view) {
        Intent i = new Intent(activity_welcome_back.this, activity_forgot_password.class);
        startActivity(i);
    }

    public void postLogin(View view) {
        Intent i = new Intent(activity_welcome_back.this, activity_success.class);
        startActivity(i);
    }
}