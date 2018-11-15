package aplikasiku.com.aplikasiluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    // Array of strings...
    String[] luasArray = {"Segitiga","Lingkaran","Persegi","Balok",
            "Kubus","Trapesium","Jajaran Genjang","Bola"};

    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, luasArray);

        final ListView listView = (ListView) findViewById(R.id.lv1);
        listView.setAdapter(adapter);

        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this, "" +luasArray[i], Toast.LENGTH_SHORT).show();

                if(luasArray[i]=="Segitiga"){
                    Intent ls = new Intent(ListActivity.this, Segitiga.class);
                    startActivity(ls);
                }



            }
        });

    }


}
