package com.geektech.hw6_isakova_kyial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.invoke.LambdaConversionException;

public class MainActivity extends AppCompatActivity {
    private EditText pochta, password;
    private Button button;
    private TextView come_in, info, welcome, forget_pass, click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pochta = findViewById(R.id.text1);
        password = findViewById(R.id.text2);
        button = findViewById(R.id.button);
        come_in = findViewById(R.id.come_in);
        info = findViewById(R.id.info);
        welcome = findViewById(R.id.welcome);
        forget_pass = findViewById(R.id.forget_pass);
        click = findViewById(R.id.click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pochta.getText().toString().equals("admin@gmail.com") &&
                        password.getText().toString().equals("admin")) {
                    button.setVisibility(view.GONE);
                    pochta.setVisibility(view.GONE);
                    password.setVisibility(view.GONE);
                    forget_pass.setVisibility(view.GONE);
                    click.setVisibility(view.GONE);
                    come_in.setVisibility(view.GONE);
                    info.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неверная почта или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
        pochta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (pochta.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
                }
            });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });


        }


    }
