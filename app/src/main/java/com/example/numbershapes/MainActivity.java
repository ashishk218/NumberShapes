package com.example.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number
    {
        int n;
        public boolean checker1()
        {
            int i=1;
            int a=1;
            while(a<n)
            {
                i++;
                a=a+i;

            }
            if(a==n)
            {
                return true;
            }
            else
                return false;
        }
        public boolean checker2()
        {
            double j = Math.sqrt(n);
            if ((j == Math.floor(j)) && !Double.isInfinite(j)) {
             return true;
            }
            else
                return false;
        }
    }
    public void clickfunc(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editText);


        Number number = new Number();

        number.n=Integer.parseInt(editText.getText().toString());
        if(number.checker1())
            Toast.makeText(this, "Triangular", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Not Triangular", Toast.LENGTH_SHORT).show();
        
    }
    public void clickfunc2(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editText);


        Number number = new Number();

        number.n=Integer.parseInt(editText.getText().toString());
        if(number.checker2())
            Toast.makeText(this, "Square", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Not Square", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
