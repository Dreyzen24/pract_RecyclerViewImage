package pe.edu.idat.apprecyclerviewsimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import pe.edu.idat.apprecyclerviewsimage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AndroidAdapter androidAdapter = new AndroidAdapter();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvAndroid.setLayoutManager (
                new LinearLayoutManager(getApplicationContext())
        );
        binding.rvAndroid.setAdapter(androidAdapter);
        androidAdapter.setData(getData());
    }

    private ArrayList<Android> getData(){

        ArrayList<Android> list = new ArrayList<>();
        list.add(new Android(list.size() +1, R.drawable.image1, "Angel cake", "Android 1.0"));

        list.add(new Android(list.size() +1, R.drawable.image1, "Angel cake", "Android 1.0"));

        list.add(new Android(list.size() +1, R.drawable.image3, "Angel cake", "Android 1.0"));


        list.add(new Android(list.size() +1, R.drawable.image4, "Angel cake", "Android 1.0"));


        list.add(new Android(list.size() +1, R.drawable.image5, "Angel cake", "Android 1.0"));


        list.add(new Android(list.size() +1, R.drawable.image6, "Angel cake", "Android 1.0"));


        list.add(new Android(list.size() +1, R.drawable.image7, "Angel cake", "Android 1.0"));
        return list;
    }
}