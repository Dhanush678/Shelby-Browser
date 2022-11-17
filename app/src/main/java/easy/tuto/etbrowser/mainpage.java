package easy.tuto.etbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mainpage extends AppCompatActivity {
    ImageView google;
    ImageView duck;
    ImageView ask;
    ImageView bing;
    ImageView yahoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        google=findViewById(R.id.goo);
        ImageView back=findViewById(R.id.link_icon);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),mainpage.class));
                finish();
            }
        });
        yahoo=findViewById(R.id.yahoo);
        ask=findViewById(R.id.ask);
        bing=findViewById(R.id.bing);
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),yahoo.class));
                finish();

            }
        });
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ask.class));
                finish();

            }
        });
        bing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),bing.class));
                finish();

            }
        });



        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();

            }
        });
        duck=findViewById(R.id.duckduck);
        duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),duckduckgo.class));
                finish();

            }
        });

    }
}