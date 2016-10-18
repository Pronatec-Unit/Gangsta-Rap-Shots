package gangstarap.homeagoravai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeAgoraVai extends AppCompatActivity {

    public Button button2mixtape;

    public void init() {
        button2mixtape = (Button) findViewById(R.id.button2mixtape);
        button2mixtape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(HomeAgoraVai.this,Mixtapes.class);

                startActivity(toy);

            }
        });


    }
    public Button buttonSobre ;

    public void inite () {
        buttonSobre = (Button) findViewById(R.id.buttonSobre);
        buttonSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy2 = new Intent(HomeAgoraVai.this,Sobre.class);

                startActivity(toy2);

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_agora_vai);
        init();
        inite();
    }
}

