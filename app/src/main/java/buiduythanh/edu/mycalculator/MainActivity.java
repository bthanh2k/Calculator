package buiduythanh.edu.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtManHinh,txtKetQua;
    ImageButton btnLichSu;
    Button btnReset,btnBinhPhuong,btnCanBacHai,btnPhanTram,
            btn7,btn8,btn9,btnChia,btn4,btn5,btn6,btnNhan,
            btn1,btn2,btn3,btnTru,btn0,btnPhay,btnBang,btnCong;
    String phepTinh="",soThuc="",show="";
    double soA=0,soB=0,kq=0,tam=0;
    String status="",status2="",s="",ghiNho="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy0();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy3();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy4();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy5();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy6();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy7();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy8();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLy9();
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyCong();
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyBang();
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyReset();
            }
        });
        btnPhay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyPhay();
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyTru();
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyNhan();
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyChia();
            }
        });
        btnBinhPhuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyBinhPhuong();
            }
        });
        btnCanBacHai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyCanBacHai();
            }
        });
        btnPhanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyPhanTram();
            }
        });
    }

    private void xuLyPhanTram() {
        if(show==""){
            xuLyReset();
        }else{
            soA=Double.parseDouble(show);
            tam=soA/100;
            phepTinh=phepTinh+String.valueOf(tam);
            txtKetQua.setText(String.valueOf(tam));
            status2="phantram";
            show="";
        }
    }

    private void xuLyCanBacHai() {
        status="canbachai";
        if(show==""){
            xuLyReset();
        }else{
            soA=Double.parseDouble(show);
            tam=Math.sqrt(soA);
            phepTinh=phepTinh+String.valueOf(tam);
            txtKetQua.setText(String.valueOf(tam));
            status2="canbachai";
            show="";
        }
    }



    private void xuLyBinhPhuong() {
        status="binhphuong";
        if(show==""){
            xuLyReset();
        }else{
            soA=Double.parseDouble(show);
            tam=soA*soA;
            phepTinh=phepTinh+String.valueOf(tam);
            txtKetQua.setText(String.valueOf(tam));
            status2="binhphuong";
            show="";
        }
    }

    private void xuLyChia() {
        status="chia";
        switch (status2){
            case "binhphuong":
                phepTinh=phepTinh+"/";
                status2="";
                break;
            case "phantram":
                phepTinh=phepTinh+"/";
                status2="";
                break;
            case "canbachai":
                phepTinh=phepTinh+"/";
                status2="";
                break;
        }
        if(show==""){
            show="";
        }else{
            if(kq==0) {
                soA = Double.parseDouble(show);
                show = "";
                if(tam==0){
                    tam=soA;
                    show = "";
                    phepTinh=phepTinh+String.valueOf(soA)+"/";
                }else{
                    tam=tam/soA;
                    txtKetQua.setText(String.valueOf(tam));
                    show = "";
                    phepTinh=phepTinh+String.valueOf(tam)+"/";
                }
            }else{
                soA=kq;
                show="";
                phepTinh=phepTinh+String.valueOf(soA)+"/";
            }
        }
    }

    private void xuLyNhan() {
        status="nhan";
        switch (status2){
            case "binhphuong":
                phepTinh=phepTinh+"x";
                status2="";
                break;
            case "phantram":
                phepTinh=phepTinh+"x";
                status2="";
                break;
            case "canbachai":
                phepTinh=phepTinh+"x";
                status2="";
                break;
        }
        if(show==""){
            show="";
        }else{
            if(kq==0) {
                soA = Double.parseDouble(show);
                show = "";
                if(tam==0){
                    tam=soA;
                    show = "";
                    phepTinh=phepTinh+String.valueOf(soA)+"x";
                }else{
                    tam=tam*soA;
                    txtKetQua.setText(String.valueOf(tam));
                    show = "";
                    phepTinh=phepTinh+String.valueOf(tam)+"x";
                }
            }else{
                soA=kq;
                show="";
                phepTinh=phepTinh+String.valueOf(soA)+"x";
            }
        }
    }

    private void xuLy9() {
        if(show=="") {
            txtManHinh.setText("9");
            show="9";
        }else{
            show+="9";
            txtManHinh.setText(show);
        }
    }

    private void xuLy8() {
        if(show=="") {
            txtManHinh.setText("8");
            show="8";
        }else{
            show+="8";
            txtManHinh.setText(show);
        }
    }

    private void xuLy7() {
        if(show=="") {
            txtManHinh.setText("7");
            show="7";
        }else{
            show+="7";
            txtManHinh.setText(show);
        }
    }

    private void xuLy6() {
        if(show=="") {
            txtManHinh.setText("6");
            show="6";
        }else{
            show+="6";
            txtManHinh.setText(show);
        }
    }

    private void xuLy5() {
        if(show=="") {
            txtManHinh.setText("5");
            show="5";
        }else{
            show+="5";
            txtManHinh.setText(show);
        }
    }

    private void xuLy4() {
        if(show=="") {
            txtManHinh.setText("4");
            show="4";
        }else{
            show+="4";
            txtManHinh.setText(show);
        }
    }

    private void xuLy3() {
        if(show=="") {
            txtManHinh.setText("3");
            show="3";
        }else{
            show+="3";
            txtManHinh.setText(show);
        }
    }

    private void xuLyTru() {
        status="tru";
        switch (status2){
            case "binhphuong":
                phepTinh=phepTinh+"-";
                status2="";
                break;
            case "phantram":
                phepTinh=phepTinh+"-";
                status2="";
                break;
            case "canbachai":
                phepTinh=phepTinh+"-";
                status2="";
                break;
        }
        if(show==""){
            show="";
        }else{
            if(kq==0) {
                soA = Double.parseDouble(show);
                show = "";
                if(tam==0){
                    tam=soA-tam;
                    show = "";
                    phepTinh=phepTinh+String.valueOf(soA)+"-";
                }else{
                    tam=tam-soA;
                    txtKetQua.setText(String.valueOf(tam));
                    show = "";
                    phepTinh=phepTinh+String.valueOf(tam)+"-";
                }
            }else{
                soA=kq;
                show="";
                phepTinh=phepTinh+String.valueOf(soA)+"-";
            }
        }
    }

    private void xuLyPhay() {
        if(show.isEmpty()){
            show="";
        }
        show=show+".";
        txtManHinh.setText(show);
    }

    private void xuLyReset() {
        show="";
        status="";
        txtManHinh.setText("0");
        txtKetQua.setText("0");
        soA=0;soB=0;kq=0;tam=0;
        phepTinh="";
    }

    private void xuLyBang() {
        switch (status){
            case "cong":
                xuLyTinhPhepCong();
                break;
            case "tru":
                xuLyTinhPhepTru();
                break;
            case "nhan":
                xuLyTinhPhepNhan();
                break;
            case "chia":
                xuLyTinhPhepChia();
                break;
        }
    }
    private void xuLyTinhPhepChia() {
        if(show==""){
            kq=soA/soA;
            txtKetQua.setText(String.valueOf(kq));
            phepTinh=phepTinh+String.valueOf(soA)+"="+String.valueOf(kq);
        }else{
            soB=Double.parseDouble(show);
            if(tam!=0.0){
                tam=tam/soB;
                txtKetQua.setText(String.valueOf(tam));
                phepTinh=phepTinh+String.valueOf(soB)+"="+String.valueOf(tam);
            }
        }
        show="0";
        Toast.makeText(MainActivity.this, phepTinh, Toast.LENGTH_SHORT).show();
        s=s+phepTinh+"\n";
        phepTinh="";
    }

    private void xuLyTinhPhepNhan() {
        if(show==""){
            kq=soA*soA;
            txtKetQua.setText(String.valueOf(kq));
            phepTinh=phepTinh+String.valueOf(soA)+"="+String.valueOf(kq);
        }else{
            soB=Double.parseDouble(show);
            if(tam!=0.0){
                tam=tam*soB;
                txtKetQua.setText(String.valueOf(tam));
                phepTinh=phepTinh+String.valueOf(soB)+"="+String.valueOf(tam);
            }
        }
        show="0";
        Toast.makeText(MainActivity.this, phepTinh, Toast.LENGTH_SHORT).show();
        s=s+phepTinh+"\n";
        phepTinh="";
    }

    private void xuLyTinhPhepTru() {
        if(show==""){
            kq=soA-soA;
            txtKetQua.setText(String.valueOf(kq));
            phepTinh=phepTinh+String.valueOf(soA)+"="+String.valueOf(kq);
        }else{
            soB=Double.parseDouble(show);
            if(tam!=0.0){
                    tam=tam-soB;
                    txtKetQua.setText(String.valueOf(tam));
                    phepTinh=phepTinh+String.valueOf(soB)+"="+String.valueOf(tam);
            }
        }
        show="0";
        Toast.makeText(MainActivity.this, phepTinh, Toast.LENGTH_SHORT).show();
        s=s+phepTinh+"\n";
        phepTinh="";
    }

    private void xuLyTinhPhepCong() {
        if(show==""){
            kq=soA+soA;
            txtKetQua.setText(String.valueOf(kq));
        }else{
            soB=Double.parseDouble(show);

                if(tam!=0.0){
                    tam=tam+soB;
                    txtKetQua.setText(String.valueOf(tam));
                    phepTinh=phepTinh+String.valueOf(soB)+"="+String.valueOf(tam);
                }

        }
        show="0";
        Toast.makeText(MainActivity.this, phepTinh, Toast.LENGTH_SHORT).show();
        s=s+phepTinh+"\n";
        phepTinh="";
    }

    private void xuLyCong() {
        status="cong";
        switch (status2){
            case "binhphuong":
                phepTinh=phepTinh+"+";
                status2="";
                break;
            case "phantram":
                phepTinh=phepTinh+"+";
                status2="";
                break;
            case "canbachai":
                phepTinh=phepTinh+"+";
                status2="";
                break;
        }
        if(show==""){
            show="";
        }else{
            if(kq==0) {
                soA = Double.parseDouble(show);
                show = "";
                if(tam==0){
                    tam=tam+soA;
                    show = "";
                    phepTinh=phepTinh+String.valueOf(soA)+"+";
                }else{
                    tam=tam+soA;
                    txtKetQua.setText(String.valueOf(tam));
                    show = "";
                    phepTinh=phepTinh+String.valueOf(tam)+"+";
                }
            }else{
                soA=kq;
                show="";
                phepTinh=phepTinh+String.valueOf(soA)+"+";
            }
        }
    }


    private void xuLy2() {
        if(show=="") {
            txtManHinh.setText("2");
            show="2";
        }else{
            show+="2";
            txtManHinh.setText(show);
        }
    }

    private void xuLy1() {
        if(show=="") {
            txtManHinh.setText("1");
            show="1";
        }else{
            show+="1";
            txtManHinh.setText(show);
        }
    }

    private void xuLy0() {
        if(show=="") {
            txtManHinh.setText("0");
            show="0";
        }else{
            show+="0";
            txtManHinh.setText(show);
        }
    }

    private void addControls() {
        txtManHinh = findViewById(R.id.txtManHinh);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnLichSu = findViewById(R.id.btnLichSu);
        btnReset = findViewById(R.id.btnReset);
        btnBinhPhuong = findViewById(R.id.btnBinhPhuong);
        btnCanBacHai = findViewById(R.id.btnCanBacHai);
        btnPhanTram = findViewById(R.id.btnPhanTram);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnTru = findViewById(R.id.btnTru);
        btnBang = findViewById(R.id.btnBang);
        btnCong = findViewById(R.id.btnCong);
        btnPhay = findViewById(R.id.btnPhay);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void xuLyMoLichSu(View view) {
        Intent intent = new Intent(MainActivity.this,HistoryActivity.class);
        intent.putExtra("PHEPTINH",s);
        startActivity(intent);
    }
}