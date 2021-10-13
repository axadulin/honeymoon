package onlyup.crud.honeymoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
Button btnLogin;
EditText edLogin, edPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin=findViewById(R.id.btnLogin);
        edLogin=findViewById(R.id.edLogin);
        edPwd=findViewById(R.id.edPwd);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edLogin.getText().toString())) {
                    String message = "O'zingiz haqida ma'lumot kiriting";
                    Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
                } else {
                    //doLogin();
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));

                    // SharedPrefManager.loginned(getApplicationContext());
                }
            }
        });


    }
    private void doLogin() {
        String login = edLogin.getText().toString();
        String password = edPwd.getText().toString();
//        if (login.equals(login) == parol.equals(parol))

//        Call<LoginResponse> usersCall = ApiClient.getInterface().doLogin(login, password);
//        final ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setMessage("Profilga kirilmoqda...");
//        progressDialog.show();
//        usersCall.enqueue(new Callback<LoginResponse>() {
//            @Override
//            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
//                String loginCheck, passwordCheck;
//                progressDialog.dismiss();
//
//                if (response.body().getError().equals(false)) {
//
//                    loginCheck = response.body().getUser().getLogin();
//                    passwordCheck = response.body().getUser().getPassword();
//                    if (login.equals(loginCheck) && password.equals(passwordCheck)) {
//
//                        user.setId(response.body().getUser().getId());
//                        user.setLogin(response.body().getUser().getLogin());
//                        user.setPassword(response.body().getUser().getPassword());
//                        MySharedPref.saveUser(user, getApplicationContext());
//                        MySharedPref.loginned(getApplicationContext());
//                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                        LoginActivity.this.finish();
//                        String message = "Profilga kirdingiz";
//                        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
//                    } else {
//                        MySharedPref.loginFailed(getApplicationContext());
//                        recreate();
//                    }
//                } else {
//
//                    String message = "Notogri";
//                    Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<LoginResponse> call, Throwable t) {
//                progressDialog.dismiss();
//                Toast.makeText(LoginActivity.this, "Internet bilan aloqa yo'q", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}