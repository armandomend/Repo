package com.example.navigation2022;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SegundoFrame extends Fragment {


    RecyclerView recyclerView;
    ArrayList<Pokemon> listaPokes;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segundo_frame, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState){

        Context context = this.getContext();
        recyclerView = getView().findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        listaPokes = new ArrayList<>();
        Pokemon p1 = new Pokemon("Pokemon 1",
                "descripcion del pokemon", R.drawable.p1);
        Pokemon p5 = new Pokemon("Pokemon 1",
                "descripcion del pokemon", R.drawable.p1);
        Pokemon p2 = new Pokemon("Pokemon 1",
                "descripcion del pokemon", R.drawable.p1);

        Pokemon p3 = new Pokemon("Pokemon 1",
                "descripcion del pokemon", R.drawable.p1);

        Pokemon p4 = new Pokemon("Pokemon 1",
                "descripcion del pokemon", R.drawable.p1);
        listaPokes.add(p1);
        listaPokes.add(p2);
        listaPokes.add(p3);
        listaPokes.add(p4);
        listaPokes.add(p5);
        PokemonAdapter pokeAdapter = new PokemonAdapter(listaPokes);
        recyclerView.setAdapter(pokeAdapter);
    }
}

