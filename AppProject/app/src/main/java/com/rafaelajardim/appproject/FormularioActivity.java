package com.rafaelajardim.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    private EditText etNome;
    private Spinner spCategorias;
    private Spinner spTipo;
    private Button btnSalvar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        etNome = findViewById(R.id.etNome);
        spCategorias = findViewById(R.id.spCategoria);
        spTipo = findViewById(R.id.spTipo);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });

    }

    private void salvar(){
        String nome = etNome.getText().toString();

        if (nome.isEmpty() || spCategorias.getSelectedItemPosition() == 0){
            Toast.makeText(this,"Você deve preencher todos os campos!", Toast.LENGTH_LONG).show();

        }else {
            Produto produto = new Produto();
            produto.setNome(nome);
            produto.setCategoria(spCategorias.getSelectedItem().toString());
            produto.setTipo(produto.tipo);

            ProdutoDAO.inserir(this, produto);

            etNome.setText("");
            spCategorias.setSelection(0, true);
        }

    }
}