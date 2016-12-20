package pe.gob.ign.ignperu.Adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.gob.ign.ignperu.Entidades.Producto;
import pe.gob.ign.ignperu.R;

/**
 * Created by Aaron Aquino
 */
public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>{
    private List<Producto> items;
    public static class ProductoViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView nombre;
        public TextView descripcion;

        public ProductoViewHolder(View v) {
            super(v);
            imagen =(ImageView) v.findViewById(R.id.imagen);
            nombre=(TextView)v.findViewById(R.id.nombre);
            descripcion=(TextView)v.findViewById(R.id.descripcion);
        }
    }
    public ProductoAdapter(List<Producto>items){
        this.items=items;
    }
    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ProductoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewproductos,viewGroup,false);
        return new ProductoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProductoViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.descripcion.setText(items.get(i).getDescripcion());
    }


}
