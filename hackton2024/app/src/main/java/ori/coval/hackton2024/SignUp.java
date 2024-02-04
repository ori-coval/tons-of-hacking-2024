package ori.coval.hackton2024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SignUp extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    int count = 0;
    private RecyclerView recyclerView;
    SharedFilesAdapter adapter;
    List<String> questionaAdapter;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        imageView.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            public void onSwipeTop() {
            }

            public void onSwipeRight() {
                if (count == 0) {
                    imageView.setImageResource(R.drawable.good_night_img);
                    textView.setText("Night");
                    count = 1;
                } else {
                    imageView.setImageResource(R.drawable.good_morning_img);
                    textView.setText("Morning");
                    count = 0;
                }
            }

            public void onSwipeLeft() {
                if (count == 0) {
                    imageView.setImageResource(R.drawable.good_night_img);
                    textView.setText("Night");
                    count = 1;
                } else {
                    imageView.setImageResource(R.drawable.good_morning_img);
                    textView.setText("Morning");
                    count = 0;
                }
            }

            public void onSwipeBottom() {
            }

        });


        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        questionaAdapter = getSharedFilesData();

        // Initialize the adapter and set it to the RecyclerView
        adapter = new SharedFilesAdapter(getSharedFilesData());
        recyclerView.setAdapter(adapter);
    }

    // Implement a method to load shared files data
    private List<String> getSharedFilesData() {
        // Implement this method to retrieve and return a list of shared files
        // Replace this with your actual data retrieval logic.

        ArrayList<String> test = new ArrayList<>();
        test.add("Test");
        test.add("test2");
        test.add("test2");
        test.add("test2");
        test.add("test2");
        test.add("test2");
        test.add("test2");
        test.add("test2");
        test.add("test2");
        return test;
    }
}
