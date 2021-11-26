package usa.reto.chaquetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    /**
     * Método
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id ==R.id.productos){
            Toast.makeText(getApplicationContext(),"oprimió productos", Toast.LENGTH_LONG).show();
            Intent pantallaProductos = new Intent(this, MainActivity2.class);
            startActivity(pantallaProductos);
        }
        if (id ==R.id.servicios){
            Toast.makeText(getApplicationContext(),"oprimió servicios", Toast.LENGTH_LONG).show();
            Intent pantallaServicios = new Intent(this, MainActivity3.class);
            startActivity(pantallaServicios);

        }
        if (id ==R.id.sucursales){
            Toast.makeText(getApplicationContext(),"oprimió sucursales", Toast.LENGTH_LONG).show();
            Intent pantallaSucursales = new Intent(this, MainActivity4.class);
            startActivity(pantallaSucursales);

        }
        return super.onOptionsItemSelected(item);
    }
}