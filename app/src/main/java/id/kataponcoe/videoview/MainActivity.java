package id.kataponcoe.videoview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button online = (Button) findViewById(R.id.btn_online);
        Button offline = (Button) findViewById(R.id.btn_offline);

        online.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Menjalankan halaman Online
                Intent i = new Intent(view.getContext(), VideoOnline.class);
                startActivity(i);
            }
        });

        offline.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Menjalankan halaman Offline
                Intent i = new Intent(view.getContext(), VideoOffline.class);
                startActivity(i);
            }
        });

    }
}
