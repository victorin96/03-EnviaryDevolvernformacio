package victor.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import victor.a03_enviarydevolverinformacion.modelos.Usuario;

public class MainActivity extends AppCompatActivity {
    private EditText txtpassword;
    private Button btndesencriptar;
    private EditText txtemail;
    private Button btncreardir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaVariables();
        btndesencriptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = txtpassword.getText().toString();
                String email = txtemail.getText().toString();
                Intent intent = new Intent(MainActivity.this, DesencripActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("USER",new Usuario(email,password));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btncreardir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void inicializaVariables() {
        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.passwordMain);
        btndesencriptar = findViewById(R.id.btndesencriptar);
        btncreardir = findViewById(R.id.btnCrearDirMain);
    }
}