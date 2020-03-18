package com.rgbat.newfile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter  extends RecyclerView.Adapter<postHolder> {
    ArrayList<Post>posts;
    Context c;

    public PostAdapter(ArrayList<Post> posts, Context c) {
        this.posts = posts;
        this.c = c;
    }
    public  void addItem(Post post){
        this.posts.add(post);
      //  notifyDataSetChanged();
    }

    @NonNull
    @Override
    public postHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.custom_file,null,false);
        postHolder holder = new postHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull postHolder holder, int position) {

        holder.tv_dat.setText(posts.get(position).getDat());
        holder.tv_name.setText(posts.get(position).getName());
        holder.tv_body.setText(posts.get(position).getBody());
        holder.tv_following.setText(posts.get(position).getFollowing()+"");
        holder.tv_followers.setText(posts.get(position).getFollowers()+"");
        holder.tv_post.setText(posts.get(position).getPost()+"");





    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}


