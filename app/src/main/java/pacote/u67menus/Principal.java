package pacote.u67menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.itemSalvar:
                Toast.makeText(Principal.this, "Item Salvar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemEditar:
                Toast.makeText(Principal.this, "Item Editar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemConfiguracao:
                Toast.makeText(Principal.this, "Item Configuração", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
