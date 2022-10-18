package com.example.tarazi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        password = findViewById(R.id.Password);
    }
    //public void iniciar (View view){
      //  mAuth.signInWithEmailAndPassword (usuario.getText().toString(),password.getText().toString())
        //        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>(){
          //         @Override
            //       public void onComplete(@NonNull Task<AuthResult> task){
              //         if (task.isSuccessful()){
                           //Sing in success, update UI with the signed in users information
                //           FirebaseUser user = mAuth.getCurrentUser();
                           //updateUI(user);
                  //     }else {
                           //if sign in fails, display a message to the user.
                    //       Toast.makeText(getApplicationContext(),"Autentificacion fallida.",
                      //             Toast.LENGTH_SHORT).show();
                           //updateUI(null);
                       //}
                   //}
               // });

    //}
    public void iniciarSesion(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void hacerRegistro (View view){
        Intent i = new Intent(this,Registrarse.class);
        startActivity(i);
    }

    public void irInstagram(View view) {
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tarazi.21/"));
        startActivity(i);
    }
    public void irFacebook(View view) {
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100066567111347"));
        startActivity(i);
    }
}