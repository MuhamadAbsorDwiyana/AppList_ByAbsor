package com.uts.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.equals("admin") && password.equals("admin")) {
                    // Jika login berhasil, arahkan ke halaman utama
                    Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Jika login gagal, tampilkan pesan error
                    Toast.makeText(MainActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
