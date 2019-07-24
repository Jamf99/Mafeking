package principal.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Window;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }
}
