package com.example.areasvolumenesypyf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CuadradoActivity extends AppCompatActivity
{
    private EditText tfLado;
    private TextView lblPerimetro;
    private TextView lblArea;

    private Button btnCalcular;
    private Button btnLimpiar;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        tfLado = (EditText)findViewById(R.id.tfLado);
        lblPerimetro = (TextView)findViewById(R.id.lblPerimetro);
        lblArea = (TextView)findViewById(R.id.lblArea);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                double lado = Double.parseDouble(tfLado.getText().toString());

                double perimetro = lado * 4;

                double area = lado * lado;

                lblPerimetro.setText(String.format("%.2f" ,perimetro));
                lblArea.setText(String.format("%.2f", area));
            }
        });

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                tfLado.setText("");
                lblPerimetro.setText("0");
                lblArea.setText("0");
            }
        });
    }
}
