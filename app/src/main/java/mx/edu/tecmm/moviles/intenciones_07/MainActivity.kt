package mx.edu.tecmm.moviles.intenciones_07

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnE= findViewById<Button>(R.id.btnExplicita);
        btnE.setOnClickListener {
            Log.e("BOTON", "Se presionó explícita2");
            val intent2= Intent(this, IntencionDos::class.java);
            startActivity(intent2);
        }

        val btnE2= findViewById<Button>(R.id.btnExplicita2);
        btnE2.setOnClickListener {
            Log.e("BOTON", "Se presionó explícita");
            val intent1= Intent(this, SecundariaActividad::class.java);
            startActivity(intent1);
        }
        
        val btnI= findViewById<Button>(R.id.btnImplicita);
        btnI.setOnClickListener {
            Log.e("BOTON", "Se presionó implícita");
            val aTienda = Intent(android.content.Intent.ACTION_VIEW);
            aTienda.data= Uri.parse("http://google.com.mx");
            startActivity(aTienda);
        }

    }
}