package com.example.sidratulmuntaha.npotest.View;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sidratulmuntaha.npotest.R;
import com.example.sidratulmuntaha.npotest.model.DataObject;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<DataObject> mDataObject;
    private Context mContext;



    public MyAdapter(Context context, List<DataObject> myDataset) {
        mContext = context;
        mDataObject = myDataset;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View view =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singleview, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final DataObject item = mDataObject.get(position);

//        holder.imageView.setImageDrawable(Drawable.createFromPath(item.getImg()));
        holder.title.setText(item.getTitle());
        holder.date.setText(item.getDate());
    }


    @Override
    public int getItemCount() {
        return mDataObject.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, date;
        public LinearLayout layout;
        //        public ImageView imageView;

        public MyViewHolder(View v) {
            super(v);

//            layout = itemView.findViewById(R.id.singleLayoutContainer);
//            imageView = itemView.findViewById(R.id.imageView);
            title= itemView.findViewById(R.id.textViewTitle);
            date = itemView.findViewById(R.id.textViewDate);
        }
    }
}