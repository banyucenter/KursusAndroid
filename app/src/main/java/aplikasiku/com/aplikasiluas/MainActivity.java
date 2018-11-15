package aplikasiku.com.aplikasiluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //definisikan button
    Button btnsg;
    Button btnpp;
    Button btnl;
    Button sp1;
    Button btlist, btnLempar, btnCheck, btnRdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsg = (Button)findViewById(R.id.btnsg);
        btnpp = (Button)findViewById(R.id.btnpp);
        btnl = (Button) findViewById(R.id.btnl);
        sp1 = (Button) findViewById(R.id.sp1);
        btlist = (Button) findViewById(R.id.btList);
        btnLempar = (Button) findViewById(R.id.btnLempar);
        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnRdb = (Button)findViewById(R.id.btnRdb);

        btnRdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(r);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, CehckBoxActivity.class);
                startActivity(c);
            }
        });

        btnLempar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sm = new Intent(MainActivity.this, DetailActivity.class);

                String angka1 = "10";
                String angka2 = "5";

                sm.putExtra("angkasatu",angka1);
                sm.putExtra("angkadua",angka2);

                startActivity(sm);
            }
        });

        btnsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MainActivity.this, Segitiga.class);
                startActivity(s);
            }
        });
        btnpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MainActivity.this, Ppanjang.class);
                startActivity(p);
            }
        });
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(MainActivity.this, Lingkaran.class);
                startActivity(l);
            }
        });

        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(m);
            }
        });

        btlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n= new Intent(MainActivity.this, ListActivity.class);
                startActivity(n);
            }
        });
    }
}
