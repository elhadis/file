package com.rgbat.newfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddFile extends AppCompatActivity {
private EditText et_dat,et_name,et_body,et_following,et_followers,et_post;

    Button btn_save;
   static final String POST_CONS_NAME = "POST";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_file);
        et_dat = findViewById(R.id.et_dat);
        et_name = findViewById(R.id.et_name);
        et_body = findViewById(R.id.et_body);
        et_following = findViewById(R.id.et_following);
        et_followers = findViewById(R.id.et_followers);
        et_post = findViewById(R.id.et_post);
        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dat = et_dat.getText().toString();
                String name = et_name.getText().toString();
                String body = et_body.getText().toString();
                int following = Integer.parseInt(et_following.getText().toString());
                int followers = Integer.parseInt(et_followers.getText().toString());
                int posts = Integer.parseInt(et_post.getText().toString());
                Intent intent=new Intent();
                Post post = new Post(dat,name,body,following,followers,posts);
                intent.putExtra("POST_CONS_NAME",post);
                setResult(RESULT_OK,intent);
                finish();


            }
        });
    }
}
