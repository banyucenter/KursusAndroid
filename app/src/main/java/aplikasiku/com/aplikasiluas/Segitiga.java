package aplikasiku.com.aplikasiluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    EditText alas,tinggi;
    Button hitung;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = (EditText)findViewById(R.id.Alass);
        tinggi = (EditText) findViewById(R.id.Tinggis);
        hitung = (Button) findViewById(R.id.Hitungs);
        luas = (TextView) findViewById(R.id.Luass);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //jadikan string
                String isiAlas = alas.getText().toString();
                String isiTinggi = tinggi.getText().toString();

                //parsing isiAlas dan isiTinggi menjadi double
                double a = Double.parseDouble(isiAlas);
                double t = Double.parseDouble(isiTinggi);

                //rumus
                double rumus = 0.5*a*t;

                //parsing hasil menjadi string
                String output = String.valueOf(rumus);

                //tampilkan datanya
                luas.setText(output.toString());
            }
        });
    }
}
