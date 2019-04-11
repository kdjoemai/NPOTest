package com.example.sidratulmuntaha.npotest.View;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sidratulmuntaha.npotest.MainActivity;
import com.example.sidratulmuntaha.npotest.R;
import com.example.sidratulmuntaha.npotest.model.DataObject;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.MyViewHolder> {

    private List<DataObject> mDataObject;
    private Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, date;
        public LinearLayout layout;

        public MyViewHolder(View itemView) {

            super(itemView);

            layout = itemView.findViewById(R.id.singleLayoutContainer);
            title = itemView.findViewById(R.id.textViewTitle);
            date = itemView.findViewById(R.id.textViewDate);

//            layout.setOnClickListener(new View.OnClickListener() {
//
//                        @Override
//                        public void onClick(View view) {
////                             mContext.userItemClick(getAdapterPosition());
//                        }
//
//                    });
        }
    }

    public ViewAdapter(Context context, List<DataObject> DataObject) {

        this.mContext = context;
        this.mDataObject = DataObject;
    }

    @Override
    public ViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singleview, parent, false);
        MyViewHolder textViewHolder = new MyViewHolder(view);

        return textViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final DataObject item = mDataObject.get(position);

        holder.title.setText(item.getTitle());
        holder.date.setText(item.getDate());

    }

    @Override
    public int getItemCount() {
        return mDataObject.size();
    }


}