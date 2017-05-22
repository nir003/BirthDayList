    package com.nirjhor.birthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

    Button add,show;
    EditText e1,e2;
        //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.add);
        show = (Button)findViewById(R.id.show);

        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.day);

        final MyDBFunctions myDBFunctions = new MyDBFunctions(getApplicationContext());



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _name = e1.getText().toString();
                String _day = e2.getText().toString();

                DataTemp dataTemp = new DataTemp(_name,_day);

                myDBFunctions.addingDataToTable(dataTemp);

                Toast.makeText(MainActivity.this, "Name : "+_name+"  BDay: "+_day, Toast.LENGTH_SHORT).show();
                

            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ListOFBirthDay.class));
            }
        });
    }
}
