package victor.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import victor.a03_enviarydevolverinformacion.modelos.Direccion;

public class CreateDirActivity extends AppCompatActivity {

    private EditText txtCalle;
    private EditText txtNumero;
    private EditText txtciudad;
    private Button btncrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dir);

        inicializavistas();

        btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Direccion direccion = new Direccion(
                        txtCalle.getText().toString(),
                        Integer.parseInt(txtNumero.getText().toString()),
                        txtciudad.getText().toString());

                Bundle bundle = new Bundle();
                bundle.putSerializable("DIR",direccion);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    private void inicializavistas() {
        txtciudad = findViewById(R.id.txtCalleCreateDir);
        txtNumero = findViewById(R.id.txtNumeroDir);
        txtCalle = findViewById(R.id.txtciudaddir);
        btncrear = findViewById(R.id.btnCrearCreateDir);
    }
}