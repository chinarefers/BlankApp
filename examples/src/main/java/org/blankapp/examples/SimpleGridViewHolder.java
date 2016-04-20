package org.blankapp.examples;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lijy91 on 16/4/13.
 */
public class SimpleGridViewHolder extends RecyclerView.ViewHolder {

    public TextView mUsername;
    public TextView mName;

    public SimpleGridViewHolder(View itemView) {
        super(itemView);
        mUsername = (TextView) itemView.findViewById(R.id.username);
        mName = (TextView) itemView.findViewById(R.id.name);
    }
}
