package gangstarap.homeagoravai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mixtapes extends AppCompatActivity {

           public Button button2home ;

        public void init() {
            button2home = (Button) findViewById(R.id.button2home);
            button2home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent toy = new Intent(Mixtapes.this, HomeAgoraVai.class);

                    startActivity(toy);

                }
            });

        }

    public Button button3sobre ;

    public void inite() {
        button3sobre = (Button) findViewById(R.id.button3sobre);
        button3sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(Mixtapes.this, Sobre.class);

                startActivity(toy);

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixtapes);
                  init();
        inite();
    }
}
