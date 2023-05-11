package buiduythanh.edu.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {
    TextView txtLichSu,txtGhiNho;
    String textLuu="",s="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        txtLichSu=findViewById(R.id.txtLichSu);
        txtGhiNho=findViewById(R.id.txtGhiNho);
        Intent intentGet=getIntent();
        s = intentGet.getStringExtra("PHEPTINH");
        txtLichSu.setText(s);
        textLuu=textLuu+s;
    }

    public void xuLyQuayLai(View view) {
        Intent intentBack = new Intent(HistoryActivity.this,MainActivity.class);
        startActivity(intentBack);
    }
}