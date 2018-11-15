package aplikasiku.com.aplikasiluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Button jumlah, kali, bagi, kurang;
    TextView angkapertama, angkakedua,hasilnya;

    double a,b;
    String angka1,angka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        angka1 = intent.getStringExtra("angkasatu");
        angka2 = intent.getStringExtra("angkadua");
        hasilnya = (TextView)findViewById(R.id.txtHasil);
        angkapertama = (TextView)findViewById(R.id.txtAngka1);
        angkakedua = (TextView)findViewById(R.id.txtAngka2);

        angkapertama.setText(angka1);
        angkakedua.setText(angka2);

        a = Double.parseDouble(angka1);
        b = Double.parseDouble(angka2);

        jumlah = (Button)findViewById(R.id.btnJumlah);
        kali = (Button)findViewById(R.id.btnKali);
        bagi = (Button)findViewById(R.id.btnBagi);
        kurang = (Button)findViewById(R.id.btnKurang);

        jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //masukan fungsi
                double hs = hasiljumlah(a,b);

                //parsing hasil menjadi string
                String output = String.valueOf(hs);

                //set txtHasil dengan output (string hasil parsing)
                hasilnya.setText(output.toString());
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //masukan fungsi
                double hs = hasilkali(a,b);

                //parsing hasil menjadi string
                String output = String.valueOf(hs);

                //set txtHasil dengan output (string hasil parsing)
                hasilnya.setText(output.toString());
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //masukan fungsi
                double hs = hasilbagi(a,b);

                //parsing hasil menjadi string
                String output = String.valueOf(hs);

                //set txtHasil dengan output (string hasil parsing)
                hasilnya.setText(output.toString());
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //masukan fungsi
                double hs = hasilkurang(a,b);

                //parsing hasil menjadi string
                String output = String.valueOf(hs);

                //set txtHasil dengan output (string hasil parsing)
                hasilnya.setText(output.toString());
            }
        });


    }

    //fungsi jumlah
    public  double hasiljumlah(double a,double b){
        return a+b;
    }

    //fungsi jumlah
    public  double hasilkali(double a,double b){
        return a*b;
    }

    //fungsi jumlah
    public  double hasilbagi(double a,double b){
        return a/b;
    }

    //fungsi jumlah
    public  double hasilkurang(double a,double b){
        return a-b;
    }
}
