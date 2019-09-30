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

        String messageSOS = "socorro";
        Button buttonSOS = findViewById(R.id.button4);

        buttonSOS.setOnClickListener((view) -> {



            String phone = "973715699" ;// textPhone.getText().toString();

            if (!PhoneNumberUtils.isGlobalPhoneNumber(phone)) {
                showToast("Número inválido!");
                return;
            }

            SmsManager manager = SmsManager.getDefault();
            manager.sendTextMessage(phone, null, messageSOS, null, null);
            showToast("MENSAGEM DE SOCORRO ENVIADA");


        });
    }
}
