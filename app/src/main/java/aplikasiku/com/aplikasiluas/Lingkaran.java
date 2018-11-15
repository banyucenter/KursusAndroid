package aplikasiku.com.aplikasiluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {

    EditText alas;
    Button hitung;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        alas = (EditText)findViewById(R.id.Diameterl);
        hitung = (Button) findViewById(R.id.Hitungl);
        luas = (TextView) findViewById(R.id.Luasl);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //jadikan string
                String isiAlas = alas.getText().toString();

                //parsing isiAlas dan isiTinggi menjadi double
                double a = Double.parseDouble(isiAlas);

                //rumus
                double rumus = 3.14*a*a/4;

                //parsing hasil menjadi string
                String output = String.valueOf(rumus);

                //tampilkan datanya
                luas.setText(output.toString());
            }
        });
    }
}
