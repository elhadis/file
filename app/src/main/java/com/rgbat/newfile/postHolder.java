package com.rgbat.newfile;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class postHolder extends RecyclerView.ViewHolder {

    TextView tv_name, tv_dat, tv_body, tv_following, tv_followers, tv_post;


    public postHolder(@NonNull View itemView) {
        super(itemView);
        tv_name = itemView.findViewById(R.id.custom_tv_name);
        tv_dat = itemView.findViewById(R.id.custom_tv_date);
        tv_body = itemView.findViewById(R.id.custom_tv_body);
        tv_following = itemView.findViewById(R.id.custom_tv_following_data);
        tv_followers = itemView.findViewById(R.id.custom_tv_followers_data);
        tv_post = itemView.findViewById(R.id.custom_tv_post_data);
    }
}




