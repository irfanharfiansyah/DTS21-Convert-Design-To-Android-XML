package polinema.ac.id.dtschapter03_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_welcome_slide_superhero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_superhero);
    }
    public void clickGetStarted(View view) {
        Intent i = new Intent(activity_welcome_slide_superhero.this,activity_slide_assign.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(activity_welcome_slide_superhero.this, activity_slide_assign.class);
        startActivity(i);
    }
}