package usa.reto.chaquetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * método para mostrar esta actividad en pantalla, con todos los elmentos incluidos en ella
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.inicioimg, getTheme());

        ImageView imagenini = (ImageView) findViewById(R.id.imagenini);
        imagenini.setImageDrawable(drawable);

        Button botonProductos = (Button) findViewById(R.id.botonProductos);
        botonProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent pantallaProductos = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pantallaProductos);

            }
        });

        Button botonServicios = (Button) findViewById(R.id.botonServicios);
        botonServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent pantallaServicios = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(pantallaServicios);

            }
        });

        Button botonSucursales = (Button) findViewById(R.id.botonSucursales);
        botonSucursales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent pantallaSucursales = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(pantallaSucursales);

            }
        });



    }

    /**
     * Método para mostrar un menú con opciones de la barra de tareas
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones,menu);
        return true;
    }

    /**
     * método del listener para escuchar qué botones se presionan y así ejecutar una acción.
     * @param item
     * @return
     */
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