package activitytest.example.com.load;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1= (Button) findViewById(R.id.load);
        editText =(EditText)findViewById(R.id.edit_query);
        editText1=(EditText)findViewById(R.id.edit_query2);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View v){
                switch (v.getId()){
                    case R.id.load:
                        String inputText= editText.getText().toString();
                        String inputText0=editText1.getText().toString();
                        Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this,inputText0,Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        Button button = (Button) findViewById(R.id.exit);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
        }

        });

    }
}
