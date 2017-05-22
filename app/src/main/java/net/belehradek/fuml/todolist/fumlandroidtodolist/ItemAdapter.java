package net.belehradek.fuml.todolist.fumlandroidtodolist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import net.belehradek.generated.todo.Item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bel2 on 18.05.2017.
 */

public abstract class ItemAdapter extends BaseAdapter {

    Context context;
    List<Item> items;
    LayoutInflater inflater = null;

    HashMap<Button, Item> buttonItem = new HashMap<>();

    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public abstract void itemClick(Item item);

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.item, null);
        Item item = items.get(position);

        TextView text = (TextView) vi.findViewById(R.id.label);
        text.setText(item.label);

        Button button = (Button) vi.findViewById(R.id.button);
        buttonItem.put(button, item);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClick(buttonItem.get(v));
            }
        });

        return vi;
    }
}