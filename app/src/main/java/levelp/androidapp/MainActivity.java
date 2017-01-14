package levelp.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText result = (EditText) findViewById(R.id.resultText);

        try {
            // Получаем оба слагаемых
            final EditText arg1 = (EditText) findViewById(R.id.arg1Text);
            final EditText arg2 = (EditText) findViewById(R.id.arg2Text);

            Button button = (Button) findViewById(R.id.sumButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s1 = arg1.getText().toString();
                    String s2 = arg2.getText().toString();
                    result.setText(Calc.sum(s1, s2));
                }
            });
        } catch (Exception ex) {
            result.setText(ex.getMessage());
        }

    }

}
