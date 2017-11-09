package mumayank.reactivenews.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import mumayank.reactivenews.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The program will work in the following way:
        // 1. App Open
        // 2. Check if cache hit or cache miss
        // 3. if Cache hit -> fetch from DB -> show remaining unseen news
        // 4. if cache miss -> fetch from url -> store new news in DB -> show remaining unseen news

        // We treat onStart as our App Open so that whenever user puts the app in foreground,
        // We show latest news
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Check if cache hit or cache miss
        if (Util.isCacheValid(getApplicationContext())) {
            // cache hit
        } else {
            // cache miss
        }
    }
}
