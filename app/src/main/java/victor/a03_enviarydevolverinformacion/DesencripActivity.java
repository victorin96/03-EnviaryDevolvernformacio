package victor.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import victor.a03_enviarydevolverinformacion.modelos.Usuario;

public class DesencripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desencrip);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            Usuario user = (Usuario) bundle.getSerializable("USER");
            Toast.makeText(this, user.toString(), Toast.LENGTH_LONG).show();
        }
    }
}