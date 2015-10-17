package com.pedidos.sistema.toolbarmaterialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar myToolbar;
    private Toolbar myToolbarBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbarBottom = (Toolbar) findViewById(R.id.toolbar_bottom);
        myToolbar.setTitle("Material Design");
        myToolbar.setSubtitle("Exemplo basico de Toolbar");
        setSupportActionBar(myToolbar);

        myToolbarBottom.inflateMenu(R.menu.toolbar_menu);
        myToolbarBottom.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                String message = "";

                switch (id) {
                    case R.id.ic_contact:
                        message = "Adicionar Contato";
                        break;
                    case R.id.ic_cloud:
                        message = "Cloud Computing";
                        break;
                    default:
                        message = "Erro ao caputrar id dos icones no menu";
                        break;
                }

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
