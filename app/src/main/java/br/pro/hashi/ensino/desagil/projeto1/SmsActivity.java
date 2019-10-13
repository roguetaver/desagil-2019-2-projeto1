package br.pro.hashi.ensino.desagil.projeto1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.widget.Button;

import android.widget.Toast;

import br.edu.insper.al.algumaluno.sms.R;

public class SmsActivity extends AppCompatActivity {


    private void showToast(String text) {

        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        toast.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        String messageSOS = "S O C O R R O!!!!!! morsaApp";
        Button buttonSOS = findViewById(R.id.button4);

        buttonSOS.setOnClickListener((view) -> {


            String[] lista = new String [2];
            lista[0] = "973715699" ;// textPhone.getText().toString();
            lista[1] = "997638849";

            SmsManager manager = SmsManager.getDefault();

            for (String s : lista) {
                manager.sendTextMessage(s, null, messageSOS, null, null);
            }

            showToast("MENSAGEM DE SOCORRO ENVIADA");


        });
    }
}
