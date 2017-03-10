package mx.edu.cetis108.cetis108app_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class App_002 extends AppCompatActivity implements View.OnClickListener {

    EditText et1 , et2;
    Button suma , resta , mult , dividir;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_002);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        mult = (Button) findViewById(R.id.mult);
        dividir = (Button) findViewById(R.id.dividir);

        txt = (TextView) findViewById(R.id.txt);


        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        dividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String n1 = et1.getText().toString();
        String n2 = et2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);

        int resp=0;


            switch (view.getId()){
                case R.id.suma:
                    resp=entero1+entero2;
                    break;
                case R.id.resta:
                    resp=entero1-entero2;
                    break;
                case R.id.mult:
                    resp=entero1*entero2;
                    break;
                case R.id.dividir:
                    resp=entero1/entero2;
                    break;

            }

        txt.setText(""+resp);
    }

}
