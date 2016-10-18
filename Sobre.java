package gangstarap.homeagoravai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sobre extends AppCompatActivity {

    public Button button4home ;

    public void init() {
        button4home = (Button) findViewById(R.id.button4home);
        button4home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(Sobre.this,HomeAgoraVai.class);

                startActivity(toy);

            }
        });

    }
    public Button mixtape ;

    public void inite () {
        mixtape = (Button) findViewById(R.id.mixtape);
        mixtape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(Sobre.this,Mixtapes.class);

                startActivity(toy);

            }
        });

    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

    init();
    inite();
    }

}
