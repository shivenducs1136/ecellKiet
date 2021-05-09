package com.example.ecellkiet;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    CircleImageView img;
    TextView Name,Domain,Year;

   public MyViewHolder(@NonNull View itemView){
        super(itemView);
        img=(CircleImageView) itemView.findViewById(R.id.img1);
        Name=(TextView)itemView.findViewById(R.id.nametext);
        Domain=(TextView)itemView.findViewById(R.id.domaintext);
        Year=(TextView)itemView.findViewById(R.id.yeartext);
    }

}