package listapaises.eduardo.com;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PaisAdapter extends BaseAdapter {

    Context contexto;
    List<Pais> lista;

    public PaisAdapter(Context contexto, List<Pais> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = LayoutInflater.from(contexto).inflate(R.layout.activity_main, null);
        Pais p = lista.get(position);

        TextView textViewRank = (TextView) linha.findViewById(R.id.rank);
        TextView textViewPais = (TextView) linha.findViewById(R.id.texto);
        TextView textViewPopulacao = (TextView) linha.findViewById(R.id.populacao);
        ImageView img = (ImageView) linha.findViewById(R.id.bandeira);

        textViewRank.setText("Rank: " + p.getRank());
        textViewPais.setText("Country: " + p.getNome());
        textViewPopulacao.setText("Populatiom: " + p.getPop());
        TypedArray fotos = contexto.getResources().obtainTypedArray(R.array.bandeiras);
        img.setImageDrawable(fotos.getDrawable(p.getBandeira()));
        return linha;
    }
}