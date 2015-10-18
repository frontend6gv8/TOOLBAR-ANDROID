package com.pedidos.sistema.toolbarmaterialdesign;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {
    private Toolbar toolbarSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        try{
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch(NullPointerException npe){
            npe.getStackTrace();
        }
        toolbarSecond = (Toolbar) findViewById(R.id.toolbar_second);
        toolbarSecond.setTitle("Second Activity");
        setSupportActionBar(toolbarSecond);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return true;
    }
}
