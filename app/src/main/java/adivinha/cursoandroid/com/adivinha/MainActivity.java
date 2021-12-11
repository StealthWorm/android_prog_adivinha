package adivinha.cursoandroid.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

import static adivinha.cursoandroid.com.adivinha.R.id.textoId;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView resultado;
    private TextView parabens;
    private EditText valorDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId);
        resultado = (TextView) findViewById(R.id.resultadoId);
        valorDigitado = (EditText)findViewById(R.id.textoId) ;
        parabens = (TextView) findViewById(R.id.parabensId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Random  r =  new Random();
                    int num = r.nextInt(11);
                    resultado.setText("Número sorteado: " + num  );
                                       /* if( resultado.getText().equals(valorDigitado.getText())){
                                            parabens.setText("Parabéns,voce acertou!!");
                                        }*/
                      //resultado.setText(valorDigitado.getText());
            }
        });

        //resultado.setText("Text Alterado");
    }


}
