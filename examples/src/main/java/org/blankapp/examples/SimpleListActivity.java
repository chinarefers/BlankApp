package org.blankapp.examples;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.blankapp.app.ListActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lijy91 on 16/4/13.
 */
public class SimpleListActivity extends ListActivity<SimpleListViewHolder, User, List<User>> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);
        this.initLoader();
    }

    @Override
    public void onRefresh() {
        getItemsSource().clear();
        getAdapter().notifyDataSetChanged();
//        new Handler().postDelayed(() -> {
//            this.forceLoad();
//        }, 1000);
    }

    @Override
    public SimpleListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_simple_list_item, parent, false);
        return new SimpleListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SimpleListViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        User user = getItemsSource().get(position);
        holder.mName.setText(user.getName());
        holder.mUsername.setText(user.getUsername());
    }

    @Override
    protected void onListItemClick(RecyclerView rv, View v, int position, long id) {
        Toast.makeText(this, "Item:" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoadStart() {

    }

    @Override
    public List<User> onLoadInBackground() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User("lijy91", "痕迹1"));
        users.add(new User("lijy92", "痕迹2"));
        users.add(new User("lijy93", "痕迹3"));
        users.add(new User("lijy94", "痕迹4"));
        users.add(new User("lijy95", "痕迹5"));
        return users;
    }

    @Override
    public void onLoadComplete(List<User> data) {
        getItemsSource().addAll(data);
        getAdapter().notifyDataSetChanged();
        onRefreshComplete();
    }

    @Override
    public void onLoadError(Exception e) {

    }
}
