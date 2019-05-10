package com.example.tarea2_jias;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    String comandofinal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
    }

    private void setupUI() {
        Button mButton = (Button) findViewById(R.id.btn_Apagar);
        Button mButton2 = (Button) findViewById(R.id.btn_Encender);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BluetoothAdapter mBluetoohAdapter = BluetoothAdapter.getDefaultAdapter();

                mBluetoohAdapter.disable();

                comandofinal = "";
                String comando = "Bluetooh fue apagado";

                final EditText mEdittext = (EditText) findViewById(R.id.edt_history);

                comandofinal = comandofinal + comando;

                mEdittext.setText(comandofinal.toString());

                Toast.makeText(getApplicationContext(), "Bluetooh fue apagado", Toast.LENGTH_SHORT).show();

            }

        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                BluetoothAdapter mBluetoohAdapter = BluetoothAdapter.getDefaultAdapter();

                mBluetoohAdapter.enable();

                comandofinal = "";
                String comando = "Bluetooh fue encendido";

                final EditText mEdittext = (EditText) findViewById(R.id.edt_history);

                comandofinal = comandofinal + comando;

                mEdittext.setText(comandofinal.toString());

                Toast.makeText(getApplicationContext(), "Bluetooh fue encendido", Toast.LENGTH_SHORT).show();

            }

        });

    }

}
