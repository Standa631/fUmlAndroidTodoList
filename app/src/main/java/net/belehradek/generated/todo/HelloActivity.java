// This file is automatically generated by Fuml Studio.
// Do not modify this file - YOUR CHANGES WILL BE ERASED!

package net.belehradek.generated.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout._hello_activity);

        setContentView(getLayoutId());

        Intent intent = getIntent();
        String[] params = intent.getStringArrayExtra("fUmlActivityParams");

        onStart(params);
    }

    protected int getLayoutId() {
    	int id = getResources().getIdentifier("_hello_activity", "layout", getPackageName());
    	return id;
    }


        public Integer r;

public void goToListActivity (net.belehradek.generated.todo.ListActivity toStart, String[] params) {
            Intent intent = new Intent(this, net.belehradek.generated.todo.ListActivity.class);
            intent.putExtra("fUmlActivityParams", params);
            startActivity(intent);
    }

public void onTime () {
    	//TODO: implement operation

this.goToListActivity(null, null);
Integer _tmp_0 = 35;
this.r = _tmp_0;
net.belehradek.generated.todo.HelloActivity _tmp_1 = this;
Integer _tmp_2 = _tmp_1.r;
String _tmp_3 = String.valueOf(this.r);
String _tmp_4 = "this.r: " + _tmp_3;
Log.d("fUml", _tmp_4);
Integer _tmp_5 = 0;
Integer _tmp_6 = _tmp_5;
while (true) {
Integer _tmp_7 = _tmp_6;
Boolean _tmp_8 = _tmp_7 < 10;
if (!(_tmp_8)) break;
String _tmp_9 = String.valueOf(_tmp_7);
String _tmp_10 = "While: " + _tmp_9;
Log.d("fUml", _tmp_10);
Integer _tmp_11 = _tmp_7 + 1;
Integer _tmp_12 = _tmp_11;
_tmp_6 = _tmp_12;
}
Integer _tmp_13 = 0;

    }

public void onStart (String[] params) {
    	//TODO: implement operation

String[] _tmp_14 = params;
Log.d("fUml", "HelloActivity start!");
this.onTime();

    }

public HelloActivity () {
    	//TODO: implement operation

    }


}
