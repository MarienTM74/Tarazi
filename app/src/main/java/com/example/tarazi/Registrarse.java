package com.example.tarazi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Registrarse extends AppCompatActivity {
    private EditText usuario;
    private EditText contrasena;
    private EditText contrasenaConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        usuario = findViewById(R.id.usuario);
        contrasena =findViewById(R.id.contrasena);
        contrasenaConfirmar =findViewById(R.id.contrasenaConfirmar);
    }
    public void registrarUsuario (View view){
        if (contrasena.getText().equals(contrasenaConfirmar.getText())){
           // mAuth.createUserWithEmailAndPassword(usuario.getText(), contrasena.getText())
                    //.addOnCompleteListener(this, new OnLoadCompleteListener<AuthResult>() {
                      //  @Override
                        //public void onComplete (@NonNull Task<AuthResult> task){
                            //if (task.isSuccessful()) {
                                //Sing in success, update UI with the signed-in users information
                                //FirebaUser user = mAuth.getCurrentUser();
                                //updateUI(user);
                            //} else {
                                //If sing in fails, display a message to the user.
                                  // Toast.makeText(this,""autenticacion fallida.",                   Toast.LENGTH_SHORT)
                                    //updateUI(null);
                            //}
                        //}
                    //});
        }else {
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
        }
    }
}