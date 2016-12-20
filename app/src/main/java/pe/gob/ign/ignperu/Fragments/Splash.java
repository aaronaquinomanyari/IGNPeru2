package pe.gob.ign.ignperu.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import pe.gob.ign.ignperu.R;

/**
 * Created by prueba on 15/12/2016.
 */
public class Splash extends AppCompatActivity {
    private final int DURACION_SPLASH = 10000; // 3 segundos
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Tenemos una plantilla llamada splash.xml donde mostraremos la información que queramos (logotipo, etc.)
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(Splash.this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }

}
