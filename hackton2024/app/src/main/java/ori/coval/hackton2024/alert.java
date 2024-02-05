package ori.coval.hackton2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alert extends AppCompatActivity {

    Intent intent;
    Button btnBreath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnBreath = findViewById(R.id.btnBreath);
        btnBreath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(alert.this, stressReduce.class);
                startActivity(intent);
            }
        });
    }


}