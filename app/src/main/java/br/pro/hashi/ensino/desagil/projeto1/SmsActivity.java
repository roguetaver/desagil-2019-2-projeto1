package br.pro.hashi.ensino.desagil.projeto1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import br.edu.insper.al.algumaluno.sms.R;

public class SmsActivity extends AppCompatActivity {

    protected  Button botaoMorse;
    private TextView caixaTexto;

    private void showToast(String text) {

        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        toast.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        caixaTexto = findViewById(R.id.caixaMorse);
        String messageSOS = "S O C O R R O!!!!!! morsaApp";
        Button buttonSOS = findViewById(R.id.button4);
        String[] lista = new String [2];
        lista[0] = "973715699" ;// textPhone.getText().toString();
        lista[1] = "997638849";
        buttonSOS.setOnClickListener((view) -> {




            SmsManager manager = SmsManager.getDefault();

            for (String s : lista) {
                manager.sendTextMessage(s, null, messageSOS, null, null);
            }

            showToast("MENSAGEM DE SOCORRO ENVIADA");

        });
        Button botaoMorse = findViewById(R.id.morse);

        botaoMorse.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){

                caixaTexto.append(".");
            }
        });
        botaoMorse.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view) {
            caixaTexto.append(("-"));
            return true;
            }

        });
        Button botaoTraduz = findViewById(R.id.send);
        botaoTraduz.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){

                caixaTexto.append(".");
            }
        });
        botaoTraduz.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view) {
                String message = caixaTexto.getText().toString();
                SmsManager manager = SmsManager.getDefault();
                if (!caixaTexto.getText().toString().isEmpty()){
                    for (String s : lista) {
                        manager.sendTextMessage(s, null, message, null, null);
                        showToast("MENSAGEM ENVIADA");
                    }
                }
                    else{
                        showToast("MENSAGEM AUSENTE");
                    }
            caixaTexto.setText("");
            return true;
            }

        });

}

}
