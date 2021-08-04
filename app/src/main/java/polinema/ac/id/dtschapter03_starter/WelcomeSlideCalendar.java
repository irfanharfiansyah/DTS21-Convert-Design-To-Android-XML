package polinema.ac.id.dtschapter03_starter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideCalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calendar);


    }
    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, activity_welcome_slide_superhero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, activity_welcome_back.class);
        startActivity(i);
    }
}