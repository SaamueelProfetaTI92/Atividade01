package br.sp.senac.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirJanela(View view) {
        //Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Testando!", Toast.LENGTH_SHORT).show();
    }

}
