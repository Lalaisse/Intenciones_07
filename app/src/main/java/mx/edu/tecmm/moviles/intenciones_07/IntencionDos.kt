package mx.edu.tecmm.moviles.intenciones_07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntencionDos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intencion_dos)
        val btn3= findViewById<Button>(R.id.button);
        btn3.setOnClickListener {
            finish();
        }
    }
}