package pe.edu.idat.apprecyclerviewsimage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pe.edu.idat.apprecyclerviewsimage.databinding.ItemAndroidBinding;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder>
{

    private ArrayList<Android> lista = new ArrayList<>();


    @NonNull
    @Override
    public AndroidAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemAndroidBinding
                .inflate(LayoutInflater.from(parent.getContext())
                        ,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidAdapter.ViewHolder holder, int position) {

        final  Android objAndroid = lista.get(position);
        holder.binding.ivimagen.setImageResource(objAndroid.getImagen());
        holder.binding.tvnombre.setText(objAndroid.getNombre());
        holder.binding.tvversion.setText(objAndroid.getVersion());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void setData(ArrayList<Android> data){
        lista.addAll(data);
        notifyDataSetChanged(); //actualiza la info del recycleView
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemAndroidBinding binding;
        public ViewHolder(ItemAndroidBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
