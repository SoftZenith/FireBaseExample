package mx.edu.ittepic.firebaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtContrasena, txtZona;
    Button btnRegistrar;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Vendedor");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtContrasena = findViewById(R.id.txtContrasena);
        txtZona = findViewById(R.id.txtZona);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                String contrasena = txtContrasena.getText().toString();
                String zona = txtZona.getText().toString();

                Vendedor vendedor = new Vendedor(nombre, contrasena, zona);

                registrar(vendedor);
            }
        });

    }//onCreate

    private void registrar(Vendedor vendedor){
        myRef.child(myRef.push().getKey()).setValue(vendedor);
    }
}
