package com.rgbat.newfile;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private Button btn;
PostAdapter adapter;
ArrayList<Post> posts;
final int REQ_CODE_ADD = 1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        btn = findViewById(R.id.custom_btn_main);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        posts= new ArrayList<>();

         Post p =new Post("2,4,2001","AMED","HEOLLO JAVA",12,23,4);
         posts.add(p);
        Post m = new  Post("12,1,200","omer","helloiw world",23,30,4);
        posts.add(m);
       Post l = new Post("12,4,2000","ahmed","java",6,9,10);
        posts.add(l);
        adapter = new PostAdapter(posts,this);
        recyclerView.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),AddFile.class);
                startActivityForResult(intent,REQ_CODE_ADD);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQ_CODE_ADD && requestCode == RESULT_OK) {
            Post p = (Post) data.getSerializableExtra(AddFile.POST_CONS_NAME);
            posts.add(p);
            adapter.addItem(p);
           // adapter.notifyDataSetChanged();
        }

    }
}
