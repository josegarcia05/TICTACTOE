package com.example.jregalado.tictactec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int Turno,Cont,Contador=0;
    String letra;
    //Crear el EditText
    EditText Et_Ganador;
    //Crear los Botones
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btn_Salir,btn_Limpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        //Buscar las Referencias
        Et_Ganador=(EditText)findViewById(R.id.Et_Ganador);
        btn1=(Button)(findViewById(R.id.btn1));
        btn2=(Button)(findViewById(R.id.btn2));
        btn3=(Button)(findViewById(R.id.btn3));
        btn4=(Button)(findViewById(R.id.btn4));
        btn5=(Button)(findViewById(R.id.btn5));
        btn6=(Button)(findViewById(R.id.btn6));
        btn7=(Button)(findViewById(R.id.btn7));
        btn8=(Button)(findViewById(R.id.btn8));
        btn9=(Button)(findViewById(R.id.btn9));
        btn_Salir=(Button)(findViewById(R.id.btn_Salir));
        btn_Limpiar=(Button)(findViewById(R.id.btn_Limpiar));

        //Creacion del Evento OnClick para que se vean las Letras
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_Salir.setOnClickListener(this);
        btn_Limpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Cont++;
        Turno=Cont%2;
        //Jugador 1 O
        if (Turno== 1)
        {
            ImprimirXO('O',v);
        }
        //Jugador 2 X
        else {
             ImprimirXO('X',v);
        }

    }
    //Crear un nuevo Metodo
    public void ImprimirXO(char Letra,View v)
    {
        if ( v.getId()== R.id.btn_Limpiar)
        {
            Et_Ganador.setEnabled(false);
            Et_Ganador.setText("");

            btn1.setEnabled(true);
            btn1.setText("");

            btn2.setEnabled(true);
            btn2.setText("");

            btn3.setEnabled(true);
            btn3.setText("");

            btn4.setEnabled(true);
            btn4.setText("");

            btn5.setEnabled(true);
            btn5.setText("");

            btn6.setEnabled(true);
            btn6.setText("");

            btn7.setEnabled(true);
            btn7.setText("");

            btn8.setEnabled(true);
            btn8.setText("");

            btn9.setEnabled(true);
            btn9.setText("");
        }
          if (v.getId()== R.id.btn_Salir)
          {
              System.exit(0);
          }

     if(v.getId()== R.id.btn1)
     {
         btn1.setText(Letra+"");
         btn1.setEnabled(false);
     }

     else if ( v.getId()==R.id.btn2 )
     {
         btn2.setText(Letra+"");
         btn2.setEnabled(false);
     }
     else if ( v.getId()==R.id.btn3 )
     {
         btn3.setText(Letra+"");
         btn3.setEnabled(false);
     }
     else if ( v.getId()==R.id.btn4 )
     {
         btn4.setText(Letra+"");
         btn4.setEnabled(false);
     }
     else if ( v.getId()==R.id.btn5 )
     {
         btn5.setText(Letra+"");
         btn5.setEnabled(false);
     }
     else if ( v.getId()==R.id.btn6 )
     {
         btn6.setText(Letra+"");
         btn6.setEnabled(false);
     }
     else if ( v.getId()==R.id.btn7 )
     {
         btn7.setText(Letra+"");
         btn7.setEnabled(false);
     }
     else if ( v.getId()==R.id.btn8 )
     {
         btn8.setText(Letra+"");
         btn8.setEnabled(false);
     }
     else
     {
         btn9.setText(Letra+"");
         btn9.setEnabled(false);
     }
        Ganador(Letra);
    }
    public void Ganador(char Letra)
    {
       if (btn1.getText().toString().equals(Letra+"") && (btn2.getText().toString().equals(Letra+"")) && (btn3.getText().toString().equals(Letra+"")))
        {
            Et_Ganador.setText("El Ganador es:"+Letra);
            Et_Ganador.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        } else if (btn4.getText().toString().equals(Letra+"") && (btn5.getText().toString().equals(Letra+"")) && (btn6.getText().toString().equals(Letra+"")))
       {
           Et_Ganador.setText("El Ganador es:"+Letra);
           Et_Ganador.setEnabled(false);
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }
       else if (btn7.getText().toString().equals(Letra+"") && (btn8.getText().toString().equals(Letra+"")) && (btn9.getText().toString().equals(Letra+"")))
       {
           Et_Ganador.setText("El Ganador es:"+Letra);
           Et_Ganador.setEnabled(false);
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
       }
       else if (btn1.getText().toString().equals(Letra+"") && (btn4.getText().toString().equals(Letra+"")) && (btn7.getText().toString().equals(Letra+"")))
       {
           Et_Ganador.setText("El Ganador es:"+Letra);
           Et_Ganador.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
       }
       else if (btn2.getText().toString().equals(Letra+"") && (btn5.getText().toString().equals(Letra+"")) && (btn8.getText().toString().equals(Letra+"")))
       {
           Et_Ganador.setText("El Ganador es:"+Letra);
           Et_Ganador.setEnabled(false);
           btn1.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn9.setEnabled(false);
       }
       else if (btn3.getText().toString().equals(Letra+"") && (btn6.getText().toString().equals(Letra+"")) && (btn9.getText().toString().equals(Letra+"")))
       {
           Et_Ganador.setText("El Ganador es:"+Letra);
           Et_Ganador.setEnabled(false);
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
       }

    } //Fin del Metodo Ganador
}
