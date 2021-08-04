package polinema.ac.id.dtschapter03_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_slide_assign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_assign);
    }
    public void clickGetStarted(View view) {
        Intent i = new Intent(activity_slide_assign.this, activity_welcome_back.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(activity_slide_assign.this, activity_welcome_back.class);
        startActivity(i);
    }
}