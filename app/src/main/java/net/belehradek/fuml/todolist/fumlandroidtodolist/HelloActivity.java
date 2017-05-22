package net.belehradek.fuml.todolist.fumlandroidtodolist;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelloActivity extends net.belehradek.generated.todo.HelloActivity {

    Handler handler = new Handler();

    @Override
    protected int getLayoutId() {
        return R.layout.hello_activity;
    }

    public void skipTimer(View v) {
        handler.removeCallbacksAndMessages(null);
        super.onTime();
    }

    @Override
    public void onTime() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                HelloActivity.super.onTime();
            }
        }, 5000);
    }

    @Override
    public void goToListActivity(net.belehradek.generated.todo.ListActivity toStart, String[] params) {
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("fUmlActivityParams", params);
        startActivity(intent);
    }
}
