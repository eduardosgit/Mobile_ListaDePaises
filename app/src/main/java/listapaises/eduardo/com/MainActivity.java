package listapaises.eduardo.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("Chine", 1, 1354040000, 2));
        paises.add(new Pais("India", 2, 1210193422, 4));
        paises.add(new Pais("United States", 3, 315761000, 3));
        paises.add(new Pais("Indonesia", 4, 237641000, 5));
        paises.add(new Pais("Brasil", 5, 193946886, 1));
        paises.add(new Pais("Pakistan", 6, 193946886, 8));
        paises.add(new Pais("Nigeria", 7, 193946886, 7));
        paises.add(new Pais("Bangladesh", 8, 193946886, 0));
        paises.add(new Pais("Russia", 9, 193946886, 9));
        paises.add(new Pais("Japan", 10, 193946886, 6));

        listView.setAdapter(new PaisAdapter(this,paises));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Pais pais = (Pais) adapterView.getItemAtPosition(i);
        Toast.makeText(this,pais.getNome(), Toast.LENGTH_SHORT).show();
    }
}