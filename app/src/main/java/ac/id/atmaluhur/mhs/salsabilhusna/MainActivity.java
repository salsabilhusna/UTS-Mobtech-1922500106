package ac.id.atmaluhur.mhs.salsabilhusna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText Kolom1,Kolom2,Kolom3,Kolom4;
TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hasil = (TextView) findViewById(R.id.txthasil);
        Kolom1 = (EditText) findViewById(R.id.Kolom1);
        Kolom2 = (EditText) findViewById(R.id.Kolom2);
        Kolom3 = (EditText) findViewById(R.id.Kolom3);
        Kolom4 = (EditText) findViewById(R.id.Kolom4);
    }
    public void hitung (View view) {
        Integer klm1 = Integer.parseInt(Kolom1.getText().toString());
        Integer klm2 = Integer.parseInt(Kolom2.getText().toString());
        Integer klm3 = Integer.parseInt(Kolom3.getText().toString());
        Integer klm4 = Integer.parseInt(Kolom4.getText().toString());
        int hasil = (klm1 * 10/100) + (klm2 * 20/100) + (klm3 * 30/100) + (klm4 * 40/100);
        Hasil.setText("Hasil Nilai Akhir = "+hasil);

    }
}