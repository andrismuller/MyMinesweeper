package hu.armando.muller.myminesweeper.ui.main;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hu.armando.muller.myminesweeper.model.MineFieldBlock;

public class MineFieldAdapter extends RecyclerView.Adapter<MineFieldAdapter.MineFieldViewHolder> {
    List<? extends MineFieldBlock> mMineFieldBlockList;

    @NonNull
    @Override
    public MineFieldViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MineFieldViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mMineFieldBlockList == null ? 0 : mMineFieldBlockList.size();
    }

    @Override
    public long getItemId(int position) {
        return mMineFieldBlockList.get(position).getId();
    }

    class MineFieldViewHolder extends RecyclerView.ViewHolder {

        public MineFieldViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
