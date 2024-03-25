package com.example.ivaproducto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    //crear las variabbles globales
    lateinit var producto: EditText
    lateinit var calcular: Button
    lateinit var mostrar: TextView
    lateinit var mostrar2: TextView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        producto = findViewById(R.id.producto)
        calcular = findViewById(R.id.calcular)
        mostrar  = findViewById(R.id.mostrar)
        mostrar2 = findViewById(R.id.mostrar2)


            }//termina el metodo oncreate
            fun calcularIva(v:View){

                if (!producto.text.toString().isEmpty()){

                    var precio = producto.text.toString().toFloat()
                    var preciocal = precio * 0.16
                    var preciototal = precio+preciocal

                    mostrar.text = "El precio original fue de: "+precio
                    mostrar2.text = "El IVA aplicado es de: "+preciocal+" y el precio total es de: "+preciototal

                }//termina if
                else{

                    var alerta=AlertDialog.Builder(this)
                        .setTitle("¡¡¡ERROR!!!")
                        .setMessage("No se ha ingresado ningun precio")
                    alerta.show()

                }//termina else
            }
        }

