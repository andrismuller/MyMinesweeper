package hu.armando.muller.myminesweeper.ui.main;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MineFieldRowAdapter extends RecyclerView.Adapter<MineFieldRowAdapter.MineFieldRowViewHolder> {
    @NonNull
    @Override
    public MineFieldRowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MineFieldRowViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MineFieldRowViewHolder extends RecyclerView.ViewHolder {
        public MineFieldRowViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
