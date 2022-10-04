package com.example.curso2;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



import androidx.navigation.ui.AppBarConfiguration;


import com.example.curso2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   public int contador;
   TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
    } // Fin metodo onCreate

    public void incrementaContador(View vista){

        contador ++;

        mostrarResultado();

    } // Fin del método incrementaContador


    public void restaContador(View vista){

       int negativos = negativosResetea();

        if(negativos!=0){
            contador--;
        }
    //    if(negativos == 0)
         //   contador;
        mostrarResultado();

    } // Fin del método restaContador

    public void reseteaContador(View vista){

        contador = Integer.parseInt(numeroDeReseteo());

        mostrarResultado();

    } // Fin del método reseteaContador

    public void mostrarResultado(){

        TextView textoResultado=(TextView) findViewById(R.id.contadorTexto);

        textoResultado.setText("" + contador);
    } // Fin del método mostrarResultado


    public String numeroDeReseteo(){

        TextView numero = (TextView) findViewById(R.id.n_resetea);

        return numero.getText().toString();
    }// Fin del método numeroDeReseteo

    public int negativosResetea(){


        if (contador<0){
            CheckBox reseNegativo = (CheckBox) findViewById(R.id.checkNegativos);
            if (!reseNegativo.isChecked()) {
                contador = 0;
                return 0;
            }
        }
        return contador;


    } //Fin del método negativosResetea

} // Fin de la clase MainActivity