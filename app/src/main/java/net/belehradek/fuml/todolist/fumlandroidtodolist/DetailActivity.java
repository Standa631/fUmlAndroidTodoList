package net.belehradek.fuml.todolist.fumlandroidtodolist;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import net.belehradek.generated.todo.Item;

/**
 * Created by Bel2 on 17.05.2017.
 */

public class DetailActivity extends net.belehradek.generated.todo.DetailActivity {

    EditText label;

    @Override
    public void onStart(String[] params) {
        label = (EditText) findViewById(R.id.editText);
        super.onStart(params);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.detail_activity;
    }

    public void addNewItem(View v) {
        Item i = new Item();
        i.label = label.getText().toString();
        i.save();
        finish();
    }
}
