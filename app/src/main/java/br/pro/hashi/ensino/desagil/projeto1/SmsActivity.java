package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import br.edu.insper.al.algumaluno.sms.R;

public class SmsActivity extends AppCompatActivity {

    protected  Button botaoMorse;
    private TextView caixaTexto;
    private TextToSpeech t1;
    private void showToast(String text) {

        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        toast.show();
    }
    private void startDictionaryActivity() {


        Intent intent = new Intent(this, dictionary.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        caixaTexto = findViewById(R.id.caixaMorse);
        String messageSOS = "S O C O R R O!!!!!! morsaApp";

        Button buttonSOS = findViewById(R.id.sos_btn);

        String[] lista = new String [2];
        lista[0] = "973715699" ;// textPhone.getText().toString();
        lista[1] = "997638849";
        Translator translator = new Translator(this);

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
        Button botaoTrad = findViewById(R.id.trad_space);
        botaoTrad.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){

                String message = caixaTexto.getText().toString();

                if (caixaTexto.length() <= 0){
                    message = "" ;
                }

                String last = "";
                String letters = "";

                if (!caixaTexto.getText().toString().isEmpty()){

                        for(char c: message.toCharArray()) {
                            if (c == '.' || c == '-') {
                                last += String.valueOf(c);
                            }
                            else
                                {
                                letters += String.valueOf(c);
                            }

                    }

                    char numero_char = translator.morseToChar(last);
                    String numero_string = String.valueOf(numero_char);
                    caixaTexto.setText("");
                    caixaTexto.append(letters);
                    caixaTexto.append(numero_string);
                }
                else{
                    showToast("CARACTER AUSENTE");
                }
            }
        });
        botaoTrad.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view) {
                String message = caixaTexto.getText().toString();


                caixaTexto.setText(message + " ");
                return true;
            }

        });
        Button botaoApaga = findViewById(R.id.delete_btn);
        botaoApaga.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){

                String message = caixaTexto.getText().toString();
                int messageLen;
                if (!caixaTexto.getText().toString().isEmpty()){
                messageLen = message.length();
                message = message.substring(0, messageLen-1);
                caixaTexto.setText(message);
                }
                else{
                    showToast("CARACTER AUSENTE");
                }
            }
        });
        botaoApaga.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view) {

                if (!caixaTexto.getText().toString().isEmpty()){

                    caixaTexto.setText("");
                }
                else{
                    showToast("MENSAGEM AUSENTE");
                }
                caixaTexto.setText("");
                return true;
            }

        });
        Button botaoEnvia = findViewById(R.id.send);

        botaoEnvia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
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

            }



        });
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        botaoEnvia.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String toSpeak = caixaTexto.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                return true;
            }
        });

        Button dictionary_btn = findViewById(R.id.dictionary_btn);
        dictionary_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startDictionaryActivity();

            }

        });


    }

}
