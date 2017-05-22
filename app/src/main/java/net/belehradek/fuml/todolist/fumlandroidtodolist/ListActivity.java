package net.belehradek.fuml.todolist.fumlandroidtodolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import net.belehradek.generated.todo.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bel2 on 17.05.2017.
 */

public class ListActivity extends net.belehradek.generated.todo.ListActivity {

    ListView list;

    @Override
    protected void onResume() {
        super.onResume();
        showItems();
    }

    @Override
    public void onStart(String[] params) {
        list = (ListView) findViewById(R.id.list);
        super.onStart(params);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_activity;
    }

    public void addNewItem(View v) {
        super.onNewItemClick();
    }

    @Override
    public void showItems() {
        List<Item> items = Item.listAll(Item.class);
        list.setAdapter(new ItemAdapter(this, items) {
            @Override
            public void itemClick(Item item) {
                item.delete();
                showItems();
            }
        });
    }

    public void goToDetailActivity (net.belehradek.generated.todo.DetailActivity toStart, String[] params) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("fUmlActivityParams", params);
        startActivity(intent);
    }
}
