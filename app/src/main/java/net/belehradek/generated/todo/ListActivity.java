// This file is automatically generated by Fuml Studio.
// Do not modify this file - YOUR CHANGES WILL BE ERASED!

package net.belehradek.generated.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;

//TODO
import net.belehradek.fuml.todolist.fumlandroidtodolist.R;

//TODO

//Activity

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout._list_activity);

        setContentView(getLayoutId());

        Intent intent = getIntent();
        String[] params = intent.getStringArrayExtra("fUmlActivityParams");

        onStart(params);
    }

    protected int getLayoutId() {
    	int id = getResources().getIdentifier("_list_activity", "layout", getPackageName());
    	return id;
    }


    
public ListActivity () {
    	//TODO: implement operation

    }

public void goToDetailActivity (DetailActivity toStart, String[] params) {            
            //Class<?> act = Class.forName("Model::todo::DetailActivity");
            //Intent intent = new Intent(this, act);
            
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("fUmlActivityParams", params);
            startActivity(intent);
    }

public void onStart (String[] params) {
    	//TODO: implement operation

String[] _tmp_1 = params;
Log.d("fUml", "ListActivity start!");
showItems();

    }

public void onItemClick (String[] id) {
    	//TODO: implement operation

String[] _tmp_2 = id;
goToDetailActivity(null, _tmp_2);

    }

public void onRemoveItemClick (String id) {
    	//TODO: implement operation

String _tmp_3 = id;
Item _tmp_4 = new Item();
Item _tmp_5 = _tmp_4;
showItems();

    }

public void onNewItemClick () {
    	//TODO: implement operation

goToDetailActivity(null, null);

    }

public void showItems () {
    	//TODO: implement operation

Item _tmp_7 = new Item();
Item _tmp_8 = _tmp_7;

    }


}