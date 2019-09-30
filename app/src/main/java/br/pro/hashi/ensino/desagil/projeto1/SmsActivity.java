package br.pro.hashi.ensino.desagil.projeto1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.insper.al.algumaluno.sms.R;

public class SmsActivity extends AppCompatActivity {

    // Método de conveniência para mostrar uma bolha de texto.
    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
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

            // Esta verificação do número de telefone é bem
            // rígida, pois exige até mesmo o código do país.
            if (!PhoneNumberUtils.isGlobalPhoneNumber(phone)) {
                showToast("Número inválido!");
                return;
            }

            // Enviar uma mensagem de SMS. Por simplicidade,
            // não estou verificando se foi mesmo enviada,
            // mas é possível fazer uma versão que verifica.
            SmsManager manager = SmsManager.getDefault();
            manager.sendTextMessage(phone, null, messageSOS, null, null);
            showToast("MENSAGEM DE SOCORRO ENVIADA");

            // Limpar o campo para nenhum engraçadinho
            // ficar apertando o botão várias vezes.
            //textPhone.setText("");
        });
    }
}
