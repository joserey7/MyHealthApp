package rey.jose.myhealthapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso: EditText = findViewById(R.id.peso) as EditText
        val altura: EditText = findViewById(R.id.altura) as EditText
        val calcular: Button = findViewById(R.id.calcular) as Button
        val imc: TextView = findViewById(R.id.imc) as TextView
        val rango: TextView = findViewById(R.id.rango) as TextView

        calcular.setOnClickListener{
            var p: Float = peso.text.toString().toFloat()
            var a: Float = altura.text.toString().toFloat()
            var imc2: Float = p/(a*a)
            imc.setText("Tu IMC es: "+imc2.toString())

            if(imc2<18.5){
                rango.setText("Por debajo de tu peso ideal")
                rango.setBackgroundResource(R.color.greenish)
            }else if(imc2>=18.5 && imc2 <25){
                rango.setText("Saludable")
                rango.setBackgroundResource(R.color.green)
            }else if(imc2>=25 && imc2 <30){
                rango.setText("Sobrepeso")
                rango.setBackgroundResource(R.color.yellow)
            }else if(imc2>=30 && imc2 <40){
                rango.setText("Obesidad")
                rango.setBackgroundResource(R.color.orange)
            }else if(imc2 >=40){
                rango.setText("Obesidad extrema")
                rango.setBackgroundResource(R.color.red)
            }

        }
    }
}
