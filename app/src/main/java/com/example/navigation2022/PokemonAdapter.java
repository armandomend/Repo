package com.example.navigation2022;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {
    ArrayList<Pokemon> ListaPokes;

    public PokemonAdapter(ArrayList<Pokemon> listaPokes) {

        ListaPokes = listaPokes;
    }


    @NonNull
    @Override
    public PokemonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.itemlist, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.ViewHolder holder, int position) {
        holder.nombre.setText(ListaPokes.get(position).getNombre());
        holder.descripcion.setText(ListaPokes.get(position).getDescripcion());
        holder.imagen.setImageResource(ListaPokes.get(position).getImagen());
        holder.imagen.setId(ListaPokes.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return ListaPokes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView descripcion;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.Nombre);
            descripcion = (TextView) itemView.findViewById(R.id.Descripcion);
            imagen =(ImageView) itemView.findViewById(R.id.Imagen);
        }
    }
}
