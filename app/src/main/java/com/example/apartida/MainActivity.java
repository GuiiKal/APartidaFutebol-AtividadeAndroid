package com.example.apartida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextData, editTextPlacarA, editTextPlacarB, editTextPublico;
    private Spinner spinnerTimeA, spinnerTimeB;
    private Button buttonMostrar;
    private TextView textViewMostra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencias
        editTextData = findViewById(R.id.editTextTextData);
        editTextPlacarA = findViewById(R.id.editTextTextPlacarA);
        editTextPlacarB = findViewById(R.id.editTextTextPlacarB);
        editTextPublico = findViewById(R.id.editTextTextPublico);
        spinnerTimeA = findViewById(R.id.spinnerTimeA);
        spinnerTimeB = findViewById(R.id.spinnerTimeB);
        buttonMostrar = findViewById(R.id.botaoMostrar);
        textViewMostra = findViewById(R.id.textViewMostrar);

        //criar o evento no botão
        buttonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if para verificar se estão todos os itens preenchidos
                if (!editTextData.getText().toString().isEmpty() && !editTextPlacarA.getText().toString().isEmpty() && !editTextPlacarB.getText().toString().isEmpty() && !editTextPublico.getText().toString().isEmpty()) {
                    //criando o objeto Partida
                    Partida partida = new Partida(Integer.parseInt(editTextPlacarA.getText().toString()), Integer.parseInt(editTextPlacarB.getText().toString()), Integer.parseInt(editTextPublico.getText().toString()), editTextData.getText().toString());
                    textViewMostra.setText(spinnerTimeA.getSelectedItem().toString() + "  " + "X" + "  " + spinnerTimeB.getSelectedItem().toString() + "\n" +
                            partida.mostrarDadosPartida());
                }else Toast.makeText(MainActivity.this, "Preencha todos os campos!", Toast.LENGTH_LONG).show();
            }
        });
    }
}