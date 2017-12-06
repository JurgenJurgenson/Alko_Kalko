package com.example.opilane.alko_kalko;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText opr1;
    private EditText opr2;
    private EditText opr3;
    private Button bin_KalkDatShit;
    private Button bin_kustuta;
    private EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 = (EditText) findViewById(R.id.editOp1);
        opr2 = (EditText) findViewById(R.id.editOp2);
        opr3 = (EditText) findViewById(R.id.editOp3);
        bin_KalkDatShit = (Button) findViewById(R.id.btn_KalkItGud);
        bin_kustuta = (Button) findViewById(R.id.btn_kustuta);
        result = (EditText) findViewById(R.id.result);
    }

    public void liidaArvud(View v) {
        Double a = Double.parseDouble(opr1.getText().toString());
        Double b = Double.parseDouble(opr2.getText().toString());
        Double c = Double.parseDouble(opr3.getText().toString());
        Double aMilliLiiterValue = a*1000; // Leiab milliliitrise väärtuse sisestatud liitri kogusest.
        Double cSentValue = c*100;        // Leiab sent väärtuse sisestatud euri kogusest.
        Double sumshit = aMilliLiiterValue/100*b;   // Esimene pool arvutamist (No fucking clue how to explain what's going on here.)
        Double summa = cSentValue/sumshit;          // leiab mitu senti maksab üks milliliiter alkoholi teatud joogi sees
        result.setText(Double.toString(summa));     // Välastab arvutatud vastuse.
    }

    public void kustutaArvud(View v) {
        result.setText("0.00");                 // vahetab defaultina arvutatud vastus välja 0.00 peale.
        opr1.setText("");                       // tühjendab esimese lahtri sisestatud väärtuse.
        opr2.setText("");                       // tühjendab teise lahtri sisestatud väärtuse.
        opr3.setText("");                       // tühjendab kolmanda lahtri sisestatud väärtuse.
    }
}
