package com.example.appmusic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.Navigation;

public class Bienvenida extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Bienvenida() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TercerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Bienvenida newInstance(String param1, String param2) {
        Bienvenida fragment = new Bienvenida();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bienvenida, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        Button bt3a1 = view.findViewById(R.id.idServicios);
        Button bt4a4 = view.findViewById(R.id.idGruposMusicales);
        Button bt5a5 = view.findViewById(R.id.idSolistas);
        Button bt6a6 = view.findViewById(R.id.idSonido);


        bt3a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_bienvenida2_to_datosArtistas);

            }
        });

        bt4a4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_bienvenida2_to_gruposMusicales);
            }
        }));

        bt5a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_bienvenida2_to_gruposMusicales);
            }
        });

        bt6a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_bienvenida2_to_gruposMusicales);
            }
        });
    }

}


