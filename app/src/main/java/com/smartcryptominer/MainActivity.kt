package com.smartcryptominer
import android.app.Activity
import android.os.Bundle
import android.os.Build
import android.os.BatteryManager
import android.content.Context
import android.widget.*
class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val root=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(30,40,30,30) }
  fun line(s:String) { root.addView(TextView(this).apply { text=s; textSize=18f; setPadding(0,10,0,10) }) }
  line("Smart Crypto Miner — diagnóstico")
  line("Modelo: ${Build.MANUFACTURER} ${Build.MODEL}")
  line("Android: ${Build.VERSION.RELEASE}")
  line("CPU: ${Build.SUPPORTED_ABIS.joinToString()}")
  line("Núcleos: ${Runtime.getRuntime().availableProcessors()}")
  val battery=getSystemService(Context.BATTERY_SERVICE) as BatteryManager
  line("Bateria: ${battery.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)}%")
  line("Carteira EVM configurada: 0xAeEB0bBeBfE22Fe328543F50702611CF0807A0AF")
  line("Esta versão ainda NÃO minera nem envia criptomoedas. Rede, ativo e pool devem ser validados.")
  val consent=CheckBox(this).apply { text="Autorizo mineração futura, com opção de parada." }; root.addView(consent)
  val status=TextView(this);root.addView(status)
  root.addView(Button(this).apply { text="Verificar autorização"; setOnClickListener { status.text=if(consent.isChecked) "Autorizado nesta sessão; motor de mineração não integrado." else "Mineração desativada." } })
  setContentView(ScrollView(this).apply { addView(root) })
 }
}