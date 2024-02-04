package ori.coval.hackton2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class fadeIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_in);
        final TextView fadingText = findViewById(R.id.fadingText);

        // Create fading-in animation
        AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(2000); // Adjust the duration as needed

        // Create scaling animation
        ScaleAnimation scaleUp = new ScaleAnimation(
                0f, 1f, // Start and end scale on X-axis
                0f, 1f, // Start and end scale on Y-axis
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point on X-axis (center)
                Animation.RELATIVE_TO_SELF, 0.5f // Pivot point on Y-axis (center)
        );
        scaleUp.setDuration(2000); // Adjust the duration as needed

        // Combine both animations using AnimationSet
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(fadeIn);
        animationSet.addAnimation(scaleUp);

        // Set listener to start next activity after the animation completes
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                // Start the next activity after the animation ends
                // You can replace MainActivity.class with the activity you want to start
                startActivity(new Intent(fadeIn.this, MainActivity.class));
                finish(); // Finish the current activity
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        // Apply the animation to the TextView
        fadingText.startAnimation(animationSet);
        fadingText.setVisibility(View.VISIBLE);
    }
}