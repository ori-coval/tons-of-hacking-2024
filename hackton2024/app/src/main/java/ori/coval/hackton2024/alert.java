package ori.coval.hackton2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.Manifest;


public class alert extends AppCompatActivity {

    Intent intent;
    Button btnBreath, btnMusic, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnBreath = findViewById(R.id.btnBreath);
        btnBreath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(alert.this, fourseveneight.class);
                startActivity(intent);
            }
        });


        btnMusic = findViewById(R.id.chillMusic);
        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(alert.this, RelaxVid.class);
                startActivity(intent);
            }
        });

        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Replace "123456789" with the desired phone number
                String phoneNumber = "tel:" + "0587528099";

                // Create an implicit intent to open the dialer with the specified phone number
                Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));

                // Check if there is an app to handle the intent
                if (ActivityCompat.checkSelfPermission(alert.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    // Start the phone call
                    startActivity(callIntent);
                } else {
                    // Handle the case where the CALL_PHONE permission is not granted
                    // You should request the permission from the user
                    ActivityCompat.requestPermissions(alert.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
            }
            ;
        });
    }
}