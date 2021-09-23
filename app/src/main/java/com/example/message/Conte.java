package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.message.model.Messege;
import com.example.message.model.*;
import com.example.message.model.employeeApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Conte extends AppCompatActivity {

    EditText id;
    TextView firtname;
    TextView lastname;
    TextView email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conte);
        id= (EditText) findViewById(R.id.id);
        firtname=(TextView)findViewById(R.id.firstname);
        lastname=(TextView)findViewById(R.id.lastname);
        email=(TextView)findViewById(R.id.email);




    }

    public void buscar (View view)
    {
        Retrofit t= new Retrofit.Builder().baseUrl("https://emplyees.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        employeeApi api= t.create(employeeApi.class);
        Call<employee> call= api.find(Integer.parseInt(id.getText().toString()));
        call.enqueue(new Callback<employee>() {
            @Override
            public void onResponse(Call<employee> call, Response<employee> response) {

                try {
                    if(response.isSuccessful())
                    {
                        employee m= response.body();
                        firtname.setText(m.getFirstname());
                        lastname.setText(m.getLasttname());
                        email.setText(m.getEmail());

                    }

                }catch (Exception e)
                {
                    Toast.makeText(Conte.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<employee> call, Throwable t) {

            }
        });
    }
}