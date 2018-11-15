package aplikasiku.com.aplikasiluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class CehckBoxActivity extends AppCompatActivity {

    private CheckBox cbAlgoritma, cbAkuntansi, cbMatematika, cbAnalisaBisnis;
    private Button btSubmit;
    TextView pilihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cehck_box);



        setButtonListener();
    }

    private void setButtonListener() {
        cbAlgoritma = (CheckBox)findViewById(R.id.cbAlgortima);
        cbAkuntansi = (CheckBox)findViewById(R.id.cbAkuntansi);
        cbMatematika = (CheckBox)findViewById(R.id.cbMatematika);
        cbAnalisaBisnis = (CheckBox)findViewById(R.id.cbAnalisaBisnis);

        btSubmit = (Button)findViewById(R.id.btnPilih);
        pilihan = (TextView)findViewById(R.id.txtPilihan);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status = "Algoritma check " + cbAlgoritma.isChecked()
                        + "\n Akuntansi check " + cbAkuntansi.isChecked()
                        + "\n Matematika check " + cbMatematika.isChecked()
                        + "\n Analisis Bisnis check " + cbAnalisaBisnis.isChecked();

                //Toast.makeText(CehckBoxActivity.this,status, Toast.LENGTH_LONG).show();

                pilihan.setText(status);
            }
        });
    }
}
